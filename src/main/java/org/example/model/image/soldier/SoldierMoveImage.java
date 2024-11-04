package org.example.model.image.soldier;

import org.example.model.image.Image;
import org.example.model.image.Status;

import java.awt.image.BufferedImage;
import java.util.ArrayList;
import java.util.List;

public class SoldierMoveImage extends Image {
    private Status status = Status.MOVE;

    public SoldierMoveImage(String name) {
        String filePath = SoldierFilePath.FILE_PATH;
        images = createImages(filePath, name, status.status());
    }
}
