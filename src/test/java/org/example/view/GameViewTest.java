package org.example.view;


import org.example.controller.GameControllerTest;
import org.example.domain.GameModelTest;

import java.net.SocketException;
import java.net.UnknownHostException;
import java.util.Scanner;

public class GameViewTest {

    private GameControllerTest gameControllerTest;
    private GameModelTest gameModelTest;

    public GameViewTest(GameControllerTest gameControllerTest, GameModelTest gameModelTest) {
        this.gameControllerTest = gameControllerTest;
        this.gameModelTest = gameModelTest;
    }


    public void chiosMode() {
        Scanner input = new Scanner(System.in);

        while (true) {
            System.out.println("1. 싱글모드");
            System.out.println("2. 멀티모드");
            System.out.println("3. 설정");
            System.out.println("4. 명예의전당");
            System.out.println("5. 끝내기");

            String mode = input.next();


        }

    }
}
