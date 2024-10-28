package org.example.net;

import java.net.InetAddress;

public class Player {

    private final String name;
    private final InetAddress addrss; // 플레이어의 UDP 주소
    private final int port;            // 플레이어의 UDP 포트

    public Player(String name, InetAddress address, int port) {
        this.name = name;
        this.addrss = address;
        this.port = port;
    }

    public String getName() {
        return name;
    }

    public InetAddress getUdpAddress() {
        return addrss;
    }

    public int getUdpPort() {
        return port;
    }
}
