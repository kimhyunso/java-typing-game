package org.example.domain.image;

import javax.imageio.ImageIO;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class SoldierImageFactory {
    private static String filePath = System.getProperty("user.dir") + "/src/main/resources/image/soldier_archive/";

    public static List<BufferedImage> loadImageByStatus(String name, Status status) {
        File file = new File(filePath + name + "/" + status.name());
        return Arrays.stream(file.listFiles())
                .sorted()
                .map(SoldierImageFactory::readImage)
                .collect(Collectors.toList());
    }

    private static BufferedImage readImage(File file) {
        try {
            return ImageIO.read(file);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

}
