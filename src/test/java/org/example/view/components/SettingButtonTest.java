package org.example.view.components;

import org.example.view.settings.ModeTest;

import java.util.Scanner;

public class SettingButtonTest implements ModeTest {

    @Override
    public void execute() {
        Scanner input = new Scanner(System.in);

        while (true) {
            System.out.println("1. 해상도조절");
            System.out.println("2. 단어추가하기");
            System.out.println("3. 사운드조절");
            System.out.println("4. 폰트조절");
            System.out.println("5. 끝내기");
            System.out.println("6. 뒤로가기");

            String mode = input.next();

            if (mode.equals("1")) {

            }

        }
    }
    
}
