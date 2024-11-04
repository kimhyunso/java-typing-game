package org.example.model.image.soldier;

import org.example.model.image.Image;
import org.example.model.image.Status;

public class SoldierAttackImage extends Image {
    private Status status = Status.ATTACK;

    public SoldierAttackImage(String name) {
        String filePath = SoldierFilePath.FILE_PATH;
        images = createImages(filePath, name, status.status());
    }
}
