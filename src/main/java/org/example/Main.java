package org.example;

import org.example.controller.FrameController;
import org.example.view.GameView;
import org.example.view.frame.ChooseFrame;
import org.example.view.frame.panel.MainMenuPanel;
import org.example.view.settings.Display;

import java.awt.*;

public class Main {
    public static void main(String[] args) {
        ChooseFrame frame = new ChooseFrame();
        FrameController frameController = new FrameController(frame);

        MainMenuPanel mainMenuPanel = new MainMenuPanel(frameController);
        frame.setLayout(new FlowLayout(FlowLayout.CENTER, 0, (Display.HEIGHT.value() -  mainMenuPanel.getPreferredSize().height) / 2));
        frame.add(mainMenuPanel);
    }
}