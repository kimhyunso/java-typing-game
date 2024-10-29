package org.example.domain.Image;

import javax.imageio.ImageIO;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import java.net.URL;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class ImageFactory {
    private String filePath;
    private List<MoveImage> moveImage = new ArrayList<>();
    private List<RunImage> runImage = new ArrayList<>();
    private List<AttackImage> attackImage = new ArrayList<>();


    public BufferedImage createImage(ImageType type) {
        String currentDir = System.getProperty("user.dir");
        filePath = currentDir + "/src/test/resources/image/zombie_archive/zombie_female/walk";
        File file = new File(filePath);


        List<BufferedImage> a = Arrays.stream(file.listFiles())
                .sorted()
                .map(item -> {
                    try {
                        return ImageIO.read(item);
                    } catch (IOException e) {
                        throw new RuntimeException(e);
                    }
                })
                .collect(Collectors.toList());


        if (type.name().equalsIgnoreCase("move")) {

        } else if (type.name().equalsIgnoreCase("run")) {
        } else if (type.name().equalsIgnoreCase("attack")) {
        }
        return null;
    }
}
