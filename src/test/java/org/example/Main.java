package org.example;

import org.example.net.GameServer;
import org.example.net.Player;
import org.example.net.Room;
import org.example.net.RoomManager;
import org.example.view.GameViewTest;

import java.net.DatagramSocket;
import java.net.InetAddress;
import java.net.SocketException;
import java.net.UnknownHostException;

public class Main {
    public static void main(String[] args) throws SocketException, UnknownHostException {
        RoomManager roomManager = RoomManager.getInstance();
        Room room = roomManager.createRoom();
        GameViewTest gameViewTest = new GameViewTest(room);

    }

}
