package org.example;

import org.example.controller.GameControllerTest;
import org.example.domain.GameModelTest;
import org.example.domain.Image.ImageFactory;
import org.example.domain.Image.ImageType;
import org.example.net.Room;
import org.example.net.RoomManager;
import org.example.view.GameViewTest;

import java.net.SocketException;
import java.net.UnknownHostException;

public class Main {
    public static void main(String[] args) throws SocketException, UnknownHostException {
//        GameModelTest gameModel = new GameModelTest();
//        GameControllerTest gameController = new GameControllerTest();
//        GameViewTest gameViewTest = new GameViewTest();

        ImageFactory factory = new ImageFactory();
        factory.createImage(ImageType.MOVE);
    }

}
