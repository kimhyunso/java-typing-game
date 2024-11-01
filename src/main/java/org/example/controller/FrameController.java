package org.example.controller;

import org.example.model.ChooseModel;
import org.example.view.frame.CharacterChooseFrame;

import javax.swing.*;

public class FrameController {
    private JFrame pveFrame;
    private JFrame currentFrame;

    public FrameController(JFrame pveFrame) {
        this.pveFrame = pveFrame;
    }

    public void handleSingleMode() {
        frameDisable();
        currentFrame = new CharacterChooseFrame();
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
        pveFrame.setVisible(false);
        pveFrame.dispose();
    }
}
