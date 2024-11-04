package org.example.model.image.soldier;

import org.example.model.image.Image;
import org.example.model.image.Status;

public class SoldierIdleImage extends Image {
    private Status status = Status.IDLE;

    public SoldierIdleImage(String name) {
        String filePath = SoldierFilePath.FILE_PATH;
        images = createImages(filePath, name, status.status());
    }
}
