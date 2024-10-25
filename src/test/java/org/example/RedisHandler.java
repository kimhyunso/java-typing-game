package org.example;

import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.ExecutionException;

import io.lettuce.core.RedisClient;
import io.lettuce.core.api.StatefulRedisConnection;
import io.lettuce.core.api.async.RedisAsyncCommands;

public class RedisHandler {
    private static final String HOST = "redis://localhost:6379";
    private RedisClient redisClient;
    
    public RedisHandler() {
        redisClient = RedisClient.create(HOST);

        try (StatefulRedisConnection<String, String> connection = redisClient.connect()) {
            RedisAsyncCommands<String, String> asyncCommands = connection.async();

            asyncCommands.set("foo", "bar").get();
            System.out.println(asyncCommands.get("foo").get()); // prints bar

            // Asynchronously store key-value pairs in a hash directly
            Map<String, String> hash = new HashMap<>();
            hash.put("name", "John");
            hash.put("surname", "Smith");
            hash.put("company", "Redis");
            hash.put("age", "29");
            asyncCommands.hset("user-session:123", hash).get();

            System.out.println(asyncCommands.hgetall("user-session:123").get());
            // Prints: {name=John, surname=Smith, company=Redis, age=29}
        } catch (ExecutionException | InterruptedException e) {
            throw new RuntimeException(e);
        } finally {
            redisClient.shutdown();
        }
    }
    
}
