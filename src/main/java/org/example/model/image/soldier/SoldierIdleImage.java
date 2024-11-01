package org.example.model.image.soldier;

import org.example.model.image.Image;

public class SoldierIdleImage extends Image {
    private String status = "idle";

    public SoldierIdleImage(String name) {
        images = createImages(name, status);
    }
}
