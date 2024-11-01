package org.example.model.image;

import org.example.model.player.Unit;
import org.example.model.player.UnitType;

import java.awt.image.BufferedImage;
import java.util.List;

public interface ImageFactory {
    public List<BufferedImage> createImage(String name, UnitType type);
}
