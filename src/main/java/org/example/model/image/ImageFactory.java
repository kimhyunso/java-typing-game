package org.example.model.image;

import org.example.model.player.Unit;

import java.util.List;

public interface ImageFactory {
    public List<Image> createImage(ImageType type);
}
