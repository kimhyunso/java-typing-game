package org.example.sample;

import java.util.List;
import java.util.concurrent.CompletableFuture;
import java.util.concurrent.CompletionStage;
import java.util.concurrent.ExecutionException;

import io.lettuce.core.RedisClient;
import io.lettuce.core.RedisURI;
import io.lettuce.core.TransactionResult;
import io.lettuce.core.api.StatefulRedisConnection;
import io.lettuce.core.api.async.RedisAsyncCommands;
import io.lettuce.core.codec.StringCodec;
import io.lettuce.core.support.AsyncConnectionPoolSupport;
import io.lettuce.core.support.AsyncPool;
import io.lettuce.core.support.BoundedAsyncPool;
import io.lettuce.core.support.BoundedPoolConfig;

public class RedisSample {
    private static final String HOST = "localhost";
    private static final int PORT = 6379;
    private RedisClient client = RedisClient.create();
    
    public RedisSample() {
        CompletionStage<BoundedAsyncPool<StatefulRedisConnection<String, String>>> poolFuture
                = AsyncConnectionPoolSupport.createBoundedObjectPoolAsync(
                () -> client.connectAsync(StringCodec.UTF8, RedisURI.create(HOST, PORT)),
                BoundedPoolConfig.create());

        // await poolFuture initialization to avoid NoSuchElementException: Pool exhausted when starting your application
        AsyncPool<StatefulRedisConnection<String, String>> pool = poolFuture.toCompletableFuture()
                .join();

        // execute work
        CompletableFuture<TransactionResult> transactionResult = pool.acquire()
                .thenCompose(connection -> {
                    RedisAsyncCommands<String, String> async = connection.async();
                    try {
                        List<String> words = async.lrange("words", 0, 100).get();
                        System.out.println(words);
                    } catch (InterruptedException e) {
                        throw new RuntimeException(e);
                    } catch (ExecutionException e) {
                        throw new RuntimeException(e);
                    }
                    return async.exec().whenComplete((s, throwable) -> pool.release(connection));
                });
        transactionResult.join();

        // terminating
        pool.closeAsync();

        // after pool completion
        client.shutdownAsync();
    }
    
}
