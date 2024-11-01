package org.example.model.image.zombie;

import org.example.model.image.Image;

import java.awt.image.BufferedImage;
import java.util.ArrayList;
import java.util.List;

public class ZombieAttackImage extends Image {
    private List<BufferedImage> moveImages;
    private String status = "attack";

    public ZombieAttackImage(String name) {
        moveImages = createImages(name, status);
    }

    public List<BufferedImage> getMoveImages() {
        return moveImages;
    }
}
