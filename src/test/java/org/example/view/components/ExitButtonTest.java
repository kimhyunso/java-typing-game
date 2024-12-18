package org.example.view.components;

import org.example.view.components.button.Button;
import org.example.view.components.listener.ActionListenerTest;

public class ExitButtonTest extends Button implements ActionListenerTest {

    @Override
    public void execute() {
        System.out.println("게임을 종료합니다.");
    }

    @Override
    public boolean equals(Object obj) {
        return super.equals(obj);
    }

    @Override
    public String toString() {
        return super.toString();
    }
}
