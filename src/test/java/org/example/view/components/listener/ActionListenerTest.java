package org.example.view.components.listener;

import java.net.SocketException;
import java.net.UnknownHostException;

@FunctionalInterface
public interface ActionListenerTest {
    public void execute() throws UnknownHostException, SocketException;
}
