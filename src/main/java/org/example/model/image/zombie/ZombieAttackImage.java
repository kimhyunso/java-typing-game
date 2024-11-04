package org.example.model.image.zombie;

import org.example.model.image.Image;
import org.example.model.image.Status;

import java.awt.image.BufferedImage;
import java.util.ArrayList;
import java.util.List;

public class ZombieAttackImage extends Image {
    private Status status = Status.ATTACK;

    public ZombieAttackImage(String name) {
        String filePath = ZombieFilePath.FILE_PATH;
        images = createImages(filePath, name, status.status());
    }
}
