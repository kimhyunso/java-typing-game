package org.example.domain;

import org.example.controller.GameControllerTest;
import org.example.domain.Image.AttackImage;
import org.example.domain.Image.ImageFactory;
import org.example.domain.Image.MoveImage;
import org.example.domain.Image.RunImage;

public class GameModelTest {
    private AttackImage attackImage;
    private MoveImage moveImage;
    private RunImage runImage;


    public GameModelTest() {
        attackImage = new AttackImage("");
        moveImage = new MoveImage("");
        runImage = new RunImage();
    }

}
