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

        InetAddress address = InetAddress.getByName("127.0.0.1");
        Player player = new Player("kim", address, 9999);
        Player playerA = new Player("aa", address, 9999);

        room.addPlayer(playerA);
        room.addPlayer(player);

        room.broadcastGameState("test");

        // GameViewTest gameViewTest = new GameViewTest(room);
    }

}
