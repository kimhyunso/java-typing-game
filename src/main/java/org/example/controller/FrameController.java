package org.example.controller;

import org.example.view.frame.CharacterChooseFrame;

import javax.swing.*;

public class FrameController {
    private JFrame frame;

    public FrameController(JFrame frame) {
        this.frame = frame;
    }

    public void handleSingleMode() {
        frame.setVisible(false);
        frame.dispose();

        CharacterChooseFrame characterChooseFrame = new CharacterChooseFrame();
    }

    public void handleMultiMode() {

    }

    public void handleSettingMode() {

    }

    public void handleHonorMode() {

    }

    public void handleExitMode() {
        frame.setVisible(false);
        frame.dispose();
        System.exit(0);
    }
}
