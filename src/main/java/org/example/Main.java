package org.example;

import org.example.controller.FrameController;
import org.example.view.GameView;
import org.example.view.frame.ChooseFrame;

public class Main {
    public static void main(String[] args) {
        ChooseFrame frame = new ChooseFrame(null);
        FrameController frameController = new FrameController(frame);
    }
}