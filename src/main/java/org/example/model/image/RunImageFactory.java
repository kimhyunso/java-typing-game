package org.example.model.image;

import org.example.model.image.soldier.SoldierRunImage;
import org.example.model.image.zombie.ZombieRunImage;
import org.example.model.player.Unit;
import org.example.model.player.UnitType;

import java.awt.image.BufferedImage;
import java.util.List;

public class RunImageFactory implements ImageFactory {
    private Image image;

    @Override
    public List<BufferedImage> createImage(String name, UnitType type) {
        if (type.equals(UnitType.SOLDIER)) {
            image = new SoldierRunImage(name);
            return image.getImages();
        }

        image = new ZombieRunImage(name);
        return image.getImages();
    }
}
