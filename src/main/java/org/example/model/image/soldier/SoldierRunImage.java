package org.example.model.image.soldier;

import org.example.model.image.Image;
import org.example.model.image.Status;

public class SoldierRunImage extends Image {
    private Status status = Status.RUN;

    public SoldierRunImage(String name) {
        String filePath = SoldierFilePath.FILE_PATH;
        images = createImages(filePath, name, status.status());
    }
}
