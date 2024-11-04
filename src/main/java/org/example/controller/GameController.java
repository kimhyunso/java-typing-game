package org.example.controller;

import org.example.model.GameModel;
import org.example.model.player.Soldier;
import org.example.view.frame.SingleGameFrame;

import javax.swing.*;

public class GameController {
    private Soldier soldier;
    private JFrame prevFrame;

    public GameController(Soldier soldier, JFrame prevFrame) {
        this.soldier = soldier;
        this.prevFrame = prevFrame;
    }

    public void handleDavidSingleMode() {
        prevFrame.setVisible(false);
        SingleGameFrame frame = new SingleGameFrame(soldier);
        Thread thread = new Thread(frame);
        thread.start();
    }

    public void handleJameSingleMode() {

    }

    public void handleJohnSingleMode() {

    }
}