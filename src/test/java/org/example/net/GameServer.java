package org.example.net;

import java.io.IOException;
import java.net.*;

public class GameServer extends Thread {
    private DatagramSocket socket;
    private String HOST = "127.0.0.1";
    private int PORT = 9999;

    public GameServer() {
        try {
            InetAddress address = InetAddress.getByName(HOST);
            socket = new DatagramSocket(PORT, address);
        } catch (SocketException e) {
            throw new RuntimeException(e);
        } catch (UnknownHostException e) {
            throw new RuntimeException(e);
        }
    }

    @Override
    public void run() {
        while (true) {
            byte[] data = new byte[1024];
            DatagramPacket packet = new DatagramPacket(data, data.length);
            try {
                socket.receive(packet);
            } catch (IOException e) {
                throw new RuntimeException(e);
            }
            System.out.println(packet.getData());
        }
    }

    public static void main(String[] args) {
        GameServer server = new GameServer();
        server.start();
    }
}
