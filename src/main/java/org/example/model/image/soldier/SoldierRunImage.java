package org.example.model.image.soldier;

import org.example.model.image.Image;

public class SoldierRunImage extends Image {
    private String status = "run";

    public SoldierRunImage(String name) {
        images = createImages(name, status);
    }
}
