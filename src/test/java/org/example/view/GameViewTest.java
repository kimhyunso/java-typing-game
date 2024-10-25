package org.example.view;


import org.example.view.components.ModeSettingTest;
import org.example.view.components.listener.ActionListenerTest;

import java.util.Scanner;

public class GameViewTest {
    private ActionListenerTest modeTest;
    private ModeSettingTest modeSettingTest = ModeSettingTest.EMPTY_MODE;

    public GameViewTest() {
        Scanner input = new Scanner(System.in);

        while (true) {
            System.out.println("1. 싱글모드");
            System.out.println("2. 멀티모드");
            System.out.println("3. 설정");
            System.out.println("4. 명예의전당");
            System.out.println("5. 끝내기");

            String mode = input.next();
            modeTest = modeSettingTest.mode(mode);
            modeTest.execute();

            if (mode.equals("5")) {
                break;
            }
        }
    }
}
