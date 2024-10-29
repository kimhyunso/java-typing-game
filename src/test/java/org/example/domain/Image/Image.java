package org.example.domain.Image;

import java.awt.image.BufferedImage;
import java.util.ArrayList;
import java.util.List;

public abstract class Image {
    protected List<BufferedImage> files = new ArrayList<>();

    abstract void init();
    public List<BufferedImage> getFiles() {
        return files;
    }
}
