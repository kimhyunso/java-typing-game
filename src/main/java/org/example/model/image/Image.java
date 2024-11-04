package org.example.model.image;

import javax.imageio.ImageIO;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public abstract class Image {
    protected List<BufferedImage> images;

    protected List<BufferedImage> createImages(String filePath, String name, String status) {
        filePath += name + "/" + status;
        File file = new File(filePath);
        return Arrays.stream(file.listFiles())
                .sorted()
                .map(item -> {
                    try {
                        return ImageIO.read(item);
                    } catch (IOException e) {
                        throw new RuntimeException(e);
                    }
                })
                .collect(Collectors.toList());
    }

    public List<BufferedImage> getImages() {
        return images;
    }
}
