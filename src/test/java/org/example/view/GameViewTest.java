package org.example.view;


import org.example.controller.ModeController;
import org.example.net.Room;
import org.example.net.RoomManager;
import org.example.view.components.*;
import org.example.view.components.button.Button;
import org.example.view.components.listener.ActionListenerTest;

import java.net.SocketException;
import java.net.UnknownHostException;
import java.util.Scanner;

public class GameViewTest {
    private ModeController modeController;

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
                modeController = new ModeController(new SingleButtonTest(room));
            } else if (mode.equals("2")) {
                modeController = new ModeController(new MultiButtonTest(room));
            } else if (mode.equals("3")) {
                modeController = new ModeController(new SettingButtonTest());
            } else if (mode.equals("4")) {
                modeController = new ModeController(new HonorButtonTest());
            } else if (mode.equals("5")) {
                modeController = new ModeController(new ExitButtonTest());
                break;
            }

            modeController.action();
        }
    }
}
