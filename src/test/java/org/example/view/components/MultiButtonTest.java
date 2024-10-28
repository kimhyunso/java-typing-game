package org.example.view.components;

import org.example.domain.Archive;
import org.example.net.Player;
import org.example.net.Room;
import org.example.net.RoomManager;
import org.example.view.components.listener.ActionListenerTest;

import java.net.InetAddress;
import java.net.SocketException;
import java.net.UnknownHostException;
import java.util.Scanner;

public class MultiButtonTest implements ActionListenerTest {

    private int score;
    private RoomManager roomManager;
    private Room room;
    private Scanner input = new Scanner(System.in);
    private final static int PORT = 9999;

    public MultiButtonTest() throws SocketException, UnknownHostException {
        room = roomManager.createRoom();
        System.out.print("닉네임: ");
        String nickName = input.next();
        InetAddress intAddress = InetAddress.getByName("127.0.0.1");
        Player player = new Player(nickName, intAddress, PORT);
        room.addPlayer(player);
    }

    @Override
    public void execute() throws UnknownHostException, SocketException {
        Scanner input = new Scanner(System.in);
        System.out.println("==== 멀티모드 게임 ====");

        int wordCount = 0;
        while (true) {
            if (wordCount >= 200) {
                wordCount = 0;
            }
            String targetWord = Archive.WORDS.get(wordCount++);
            System.out.println("단어: " + targetWord);
            System.out.println("1. 텍스트 입력하기");
            System.out.println("6. 메인 메뉴로 가기");
            String mode = input.next();

            room.broadcastGameState("Game State Update: x=100, y=200");

            if (!mode.equals("1")) {
                break;
            }

            System.out.print("입력: ");
            String word = input.next();
            if (targetWord.equals(word)) {
                score += 10;
            }

            System.out.println("점수 현황: " + score);
        }
    }
}
