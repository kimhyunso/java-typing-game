package org.example.domain;

import org.example.controller.GameControllerTest;
import org.example.domain.Image.*;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

public class GameModelTest {
    private ImageFactory imageFactory;
    private MoveImage moveImage;
    private RunImage runImage;
    private AttackImage attackImage;

    public GameModelTest() {
        imageFactory = new RunImage();
        runImage = (RunImage) imageFactory.createImage();

        imageFactory = new AttackImage();
        attackImage = (AttackImage) imageFactory.createImage();

        imageFactory = new MoveImage();
        moveImage = (MoveImage) imageFactory.createImage();
    }


}
