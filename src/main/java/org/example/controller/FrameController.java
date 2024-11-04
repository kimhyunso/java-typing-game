package org.example.controller;

import org.example.view.frame.CharacterChooseFrame;
import org.example.view.frame.panel.MainMenuPanel;
import org.example.view.settings.Display;

import javax.swing.JFrame;
import java.awt.*;

public class FrameController {

    private JFrame prevFrame;
    private JFrame nextFrame;

    public FrameController(JFrame prevFrame, JFrame nextFrame) {
        this.prevFrame = prevFrame;
        this.nextFrame = nextFrame;
        setup();
    }

    public void setup() {
        MainMenuPanel mainMenuPanel = new MainMenuPanel(this);
        prevFrame.setLayout(new FlowLayout(FlowLayout.CENTER, 0, (Display.HEIGHT.value() -  mainMenuPanel.getPreferredSize().height) / 2));
        prevFrame.add(mainMenuPanel);
    }

    public void handleSingleMode() {
        frameDisable();
        nextFrame.setVisible(true);
    }

    public void handleMultiMode() {
        frameDisable();
    }

    public void handleSettingMode() {
        frameDisable();
    }

    public void handleHonorMode() {
        frameDisable();
    }

    public void handleExitMode() {
        frameDisable();
        System.exit(0);
    }

    private void frameDisable() {
        prevFrame.setVisible(false);
    }
}
