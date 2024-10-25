package org.example.view.components;

import org.example.view.components.listener.ActionListenerTest;

public class HonorButtonTest implements ActionListenerTest {

    @Override
    public void execute() {
        System.out.println("명예의 전당 보는 중...");
    }

}
