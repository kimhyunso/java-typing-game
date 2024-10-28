package org.example.view;


import org.example.net.Room;
import org.example.net.RoomManager;
import org.example.view.components.*;
import org.example.view.components.button.Button;
import org.example.view.components.listener.ActionListenerTest;

import java.net.SocketException;
import java.net.UnknownHostException;
import java.util.Scanner;

public class GameViewTest {
    private ActionListenerTest button;
    public GameViewTest(Room room) throws SocketException, UnknownHostException {
        Scanner input = new Scanner(System.in);

        while (true) {
            System.out.println("1. 싱글모드");
            System.out.println("2. 멀티모드");
            System.out.println("3. 설정");
            System.out.println("4. 명예의전당");
            System.out.println("5. 끝내기");

            String mode = input.next();

            if (mode.equals("1")) {
                button = new SingleButtonTest();
                button.execute();
            } else if (mode.equals("2")) {
                button = new MultiButtonTest(room);
                button.execute();
            } else if (mode.equals("3")) {
                button = new SettingButtonTest();
                button.execute();
            } else if (mode.equals("4")) {
                button = new HonorButtonTest();
                button.execute();
            } else if (mode.equals("5")) {
                button = new ExitButtonTest();
                break;
            }
        }
    }
}
