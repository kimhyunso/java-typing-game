package test.view;

import java.util.Scanner;

public class GameViewTest {
    private SettingViewTest settingViewTest = new SettingViewTest();

    public GameViewTest() {
        Scanner input = new Scanner(System.in);
        int mode = 0;

        while(mode != 5) {
            System.out.println("1. 싱글모드");
            System.out.println("2. 멀티모드");
            System.out.println("3. 설정");
            System.out.println("4. 명예의전당");
            System.out.println("5. 끝내기");

            mode = input.nextInt();
            if (mode == 1) {
                settingViewTest.start();
            }else if (mode == 2) {
                settingViewTest.start();
            }else if (mode == 3) {
                settingViewTest.start();
            }
        }       
    }
}
