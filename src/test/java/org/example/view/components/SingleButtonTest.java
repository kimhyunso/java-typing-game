package org.example.view.components;


import java.util.Scanner;

import org.example.domain.Archive;
import org.example.view.components.button.Button;
import org.example.view.components.listener.ActionListenerTest;

public class SingleButtonTest extends Button implements ActionListenerTest {
    private int score;

    @Override
    public void execute() {
        Scanner input = new Scanner(System.in);
        System.out.println("==== 싱글모드 게임 ====");
        int wordCount = 0;

         while (true) {
             if (wordCount >= 200) {
                 wordCount = 0;
             }
             String targetWord = Archive.WORDS.get(wordCount++);
             System.out.println("단어: " + targetWord);
             System.out.println("1. 텍스트 입력하기");
             System.out.println("6. 메인 메뉴로 가기");
             String mode = input.next();

             if (!mode.equals("1")) {
                 break;
             }

             System.out.print("입력: ");
             String word = input.next();
             if (targetWord.equals(word)) {
                 score += 10;
             }

             System.out.println("점수 현황: " + score);
         }
    }

}
