package org.example.model.image.soldier;

import org.example.model.image.Image;

import java.awt.image.BufferedImage;
import java.util.ArrayList;
import java.util.List;

public class SoldierMoveImage extends Image {
    private List<BufferedImage> moveImages;
    private String status = "walk";

    public SoldierMoveImage(String name) {
        moveImages = createImages(name, status);
    }

    public List<BufferedImage> getMoveImages() {
        return moveImages;
    }
}
