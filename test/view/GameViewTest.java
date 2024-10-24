package test.view;

import java.util.Scanner;

import test.view.settings.ModeSettingTest;
import test.view.settings.ModeTest;

public class GameViewTest {

    private ModeTest modeTest;

    public GameViewTest() {
        Scanner input = new Scanner(System.in);
        String mode = null;

        while(!mode.equals("5")) {
            System.out.println("1. 싱글모드");
            System.out.println("2. 멀티모드");
            System.out.println("3. 설정");
            System.out.println("4. 명예의전당");
            System.out.println("5. 끝내기");

            mode = input.next();
            for (ModeSettingTest modeSetting : ModeSettingTest.values()) {
            }

        }       
    }
}
