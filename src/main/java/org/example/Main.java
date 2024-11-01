package org.example;

import org.example.controller.FrameController;
import org.example.model.ChooseModel;
import org.example.view.frame.ChooseFrame;

public class Main {
    public static void main(String[] args) {
        ChooseFrame gameView = new ChooseFrame();
        FrameController frameController = new FrameController(gameView);
    }
}