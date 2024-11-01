package org.example.model.image.zombie;

import org.example.model.image.Image;

import java.awt.image.BufferedImage;
import java.util.ArrayList;
import java.util.List;

public class ZombieAttackImage extends Image {
    private String status = "attack";

    public ZombieAttackImage(String name) {
        images = createImages(name, status);
    }
}
