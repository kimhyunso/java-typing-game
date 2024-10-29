package org.example.view.components;

import org.example.domain.Archive;
import org.example.net.Player;
import org.example.net.Room;
import org.example.net.RoomManager;
import org.example.view.components.button.Button;
import org.example.view.components.listener.ActionListenerTest;

import java.net.InetAddress;
import java.net.SocketException;
import java.net.UnknownHostException;
import java.util.Objects;
import java.util.Scanner;

public class MultiButtonTest extends Button implements ActionListenerTest {
    private final static int MAX_USER_NUM = 2;
    private final static int PORT = 9999;
    private int score;
    private final Room room;
    private final InetAddress address;


    public MultiButtonTest(Room room) {
        this.room = room;
        try {
            this.address = InetAddress.getByName("127.0.0.1");
        } catch (UnknownHostException e) {
            throw new RuntimeException(e);
        }
    }

    @Override
    public void execute() throws UnknownHostException, SocketException {
        Scanner input = new Scanner(System.in);
        System.out.println("==== 멀티모드 게임 ====");
        int userCount = 1;
        int wordCount = 0;

        while (true) {
            if (userCount < MAX_USER_NUM) {
                System.out.print("닉네임: ");
                String nickName = input.next();
                Player player = new Player(nickName, address, PORT);
                room.addPlayer(player);
                userCount++;
            }

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

            room.broadcastGameState(word);

            System.out.println("점수 현황: " + score);
        }
    }

    @Override
    public boolean equals(Object object) {
        if (this == object) return true;
        if (object == null || getClass() != object.getClass()) return false;
        MultiButtonTest that = (MultiButtonTest) object;
        return score == that.score && Objects.equals(room, that.room) && Objects.equals(address, that.address);
    }

    @Override
    public int hashCode() {
        return Objects.hash(score, room, address);
    }

    @Override
    public String toString() {
        return "MultiButtonTest{" +
                "score=" + score +
                ", room=" + room +
                ", address=" + address +
                '}';
    }
}
