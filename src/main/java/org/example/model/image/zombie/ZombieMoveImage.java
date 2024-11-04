package org.example.model.image.zombie;

import org.example.model.image.Image;
import org.example.model.image.Status;

import java.awt.image.BufferedImage;
import java.util.ArrayList;
import java.util.List;

public class ZombieMoveImage extends Image {
    private Status status = Status.MOVE;

    public ZombieMoveImage(String name) {
        String filePath = ZombieFilePath.FILE_PATH;
        images = createImages(filePath, name, status.status());
    }
}
