package org.example.net;

import org.example.model.player.Player;

import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;
import java.net.SocketException;
import java.util.HashSet;
import java.util.Set;

public class Room {
    private int roomId;
    private final Set<Player> players = new HashSet<>();
    private DatagramSocket socket;

    public Room(int roomId) throws SocketException {
        this.roomId = roomId;
        this.socket = new DatagramSocket();
    }

    public int getRoomId() {
        return roomId;
    }

    public void addPlayer(Player player) {
        players.add(player);
        System.out.println("플레이어 " + player.getName() + "이(가) 룸 " + roomId + "에 참가했습니다.");
    }

    public void removePlayer(Player player) {
        players.remove(player);
        System.out.println("플레이어 " + player.getName() + "이(가) 룸 " + roomId + "에서 나갔습니다.");
    }

    public void broadcastGameState(String gameState) {
        for (Player player : players) {
            try {
                byte[] data = gameState.getBytes();
                InetAddress address = player.getUdpAddress();
                int port = player.getUdpPort();

                DatagramPacket packet = new DatagramPacket(data, data.length, address, port);
                socket.send(packet);  // 각 플레이어에게 게임 상태를 전송
                System.out.println("룸 " + roomId + "에서 " + player.getName() + "에게 상태 전송: " + gameState);
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }
}

