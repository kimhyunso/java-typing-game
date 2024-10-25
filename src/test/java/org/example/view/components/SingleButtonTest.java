package org.example.view.components;


import java.util.Scanner;

import org.example.RedisHandler;
import org.example.view.settings.ModeTest;

public class SingleButtonTest implements ModeTest {

    // TODO: 레디스에서 가져온 단어들
    private String words = "강아지";
    // TODO: 스코어 저장
    private int score;
    private RedisHandler handler;

    @Override
    public void execute() {
        handler = new RedisHandler();
        Scanner input = new Scanner(System.in);
        
        System.out.println("==== 싱글모드 게임 ====");

         while (true) {
             System.out.println("단어: " + words);
             System.out.println("1. 텍스트 입력하기");
             System.out.println("5. 끝내기");
             System.out.println("6. 메인 메뉴로 가기");
             String mode = input.next();

             if (!mode.equals("1")) {
                 break;
             }

             String word = input.next();
             if (words.equals(word)) {
                 score += 10;
             }
             System.out.println("단어: " + words);
             words = "메추리알";
         }
         System.out.println("점수 현황: " + score);
         input.close();
    }

}
