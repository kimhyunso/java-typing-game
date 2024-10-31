package org.example;

import org.example.controller.GameControllerTest;
import org.example.domain.GameModelTest;
import org.example.domain.Image.Image;

import java.net.SocketException;
import java.net.UnknownHostException;

public class Main {
    public static void main(String[] args) throws SocketException, UnknownHostException {
        GameModelTest gameModel = new GameModelTest();
        GameControllerTest gameController = new GameControllerTest(gameModel);
//        GameViewTest gameViewTest = new GameViewTest();
    }

}
