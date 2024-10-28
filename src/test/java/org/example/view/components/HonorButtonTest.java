package org.example.view.components;

import org.example.view.components.button.Button;
import org.example.view.components.listener.ActionListenerTest;

public class HonorButtonTest extends Button implements ActionListenerTest {

    @Override
    public void execute() {
        System.out.println("명예의 전당 보는 중...");
    }

}
