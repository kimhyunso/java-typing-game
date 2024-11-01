package org.example.model;

import org.example.model.image.CharacterImageFactory;
import org.example.model.player.UnitType;

import java.awt.image.BufferedImage;
import java.util.List;

public class ChooseModel {
    private List<BufferedImage> images;
    private CharacterImageFactory characterImageFactory;

    public ChooseModel(String name, UnitType type, String action) {
        characterImageFactory = new CharacterImageFactory();
        images = characterImageFactory.createImage(name, type, action);
    }

    public List<BufferedImage> getImages() {
        return images;
    }
}
