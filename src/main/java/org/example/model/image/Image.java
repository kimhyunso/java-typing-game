package org.example.model.image;

import javax.imageio.ImageIO;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public abstract class Image {
    protected List<BufferedImage> files;
    protected String currentDir = System.getProperty("user.dir");
    protected String filePath;

    void containsFile() {
        File file = new File(filePath);
        files = Arrays.stream(file.listFiles())
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
}
