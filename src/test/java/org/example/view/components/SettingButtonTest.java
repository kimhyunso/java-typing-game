package org.example.view.components;

import org.example.view.settings.ModeTest;

public class SettingButtonTest implements ModeTest {

    @Override
    public void execute() {
        System.out.println("1. 해상도조절");
        System.out.println("2. 단어추가하기");
        System.out.println("3. 사운드조절");
        System.out.println("4. 폰트조절");
        System.out.println("5. 끝내기");
        System.out.println("6. 뒤로가기");
    }
    
}
