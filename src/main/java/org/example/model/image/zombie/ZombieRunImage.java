package org.example.model.image.zombie;

import org.example.model.image.Image;
import org.example.model.image.ImageType;

import java.awt.image.BufferedImage;
import java.util.ArrayList;
import java.util.List;

public class ZombieRunImage extends Image {
    private List<BufferedImage> moveImages;
    private String status = "run";

    public ZombieRunImage(String name) {
        moveImages = createImages(name, status);
    }

    public List<BufferedImage> getMoveImages() {
        return moveImages;
    }
}
