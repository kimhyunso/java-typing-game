package org.example.model.image.zombie;

import org.example.model.image.Image;

import java.awt.image.BufferedImage;
import java.util.List;

public class ZombieRunImage extends Image {
    private String status = "run";

    public ZombieRunImage(String name) {
        images = createImages(name, status);
    }
}
