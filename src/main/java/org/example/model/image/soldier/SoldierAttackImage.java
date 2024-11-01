package org.example.model.image.soldier;

import org.example.model.image.Image;

import java.awt.image.BufferedImage;
import java.util.ArrayList;
import java.util.List;

public class SoldierAttackImage extends Image {
    private String status = "attack";

    public SoldierAttackImage(String name) {
        images = createImages(name, status);
    }
}
