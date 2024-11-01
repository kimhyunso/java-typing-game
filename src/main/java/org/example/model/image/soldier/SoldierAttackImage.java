package org.example.model.image.soldier;

import org.example.model.image.Image;

import java.awt.image.BufferedImage;
import java.util.ArrayList;
import java.util.List;

public class SoldierAttackImage extends Image {
    private List<BufferedImage> moveImages;
    private String status = "attack";

    public SoldierAttackImage(String name) {
        moveImages = createImages(name, status);
    }

    public List<BufferedImage> getMoveImages() {
        return moveImages;
    }
}
