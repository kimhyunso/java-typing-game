package org.example.view.components;

import org.example.view.components.listener.ActionListenerTest;

public class ExitButtonTest implements ActionListenerTest {

    @Override
    public void execute() {
        System.out.println("게임을 종료합니다.");
    }
    
}
