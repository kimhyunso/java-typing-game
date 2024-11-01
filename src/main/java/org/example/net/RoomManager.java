package org.example.net;

import java.net.SocketException;
import java.util.HashMap;
import java.util.Map;

public class RoomManager {
    private final Map<Integer, Room> rooms = new HashMap<>();
    private int nextRoomId = 1;
    private final static RoomManager instance = getInstance();

    private RoomManager() {}

    public Room createRoom() throws SocketException {
        Room room = new Room(nextRoomId++);
        rooms.put(room.getRoomId(), room);
        System.out.println("새로운 룸 생성: " + room.getRoomId());
        return room;
    }
    public Room getRoom(int roomId) {
        return rooms.get(roomId);
    }

    public void removeRoom(int roomId) {
        rooms.remove(roomId);
        System.out.println("룸 " + roomId + "이 삭제되었습니다.");
    }

    public static RoomManager getInstance() {
        if (instance == null) {
            return new RoomManager();
        }
        return instance;
    }
}
