package org.example;

import org.example.net.GameServer;
import org.example.net.Room;
import org.example.net.RoomManager;
import org.example.view.GameViewTest;

import java.net.SocketException;
import java.net.UnknownHostException;

public class Main {
    public static void main(String[] args) throws SocketException, UnknownHostException {

//        Thread thread = new GameServer();
//        thread.setDaemon(true);
//        thread.start();

        RoomManager roomManager = RoomManager.getInstance();
        Room room = roomManager.createRoom();
        GameViewTest gameViewTest = new GameViewTest(room);
    }
}
