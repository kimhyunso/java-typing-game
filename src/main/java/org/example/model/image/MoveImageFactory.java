package org.example.model.image;

import org.example.model.image.soldier.SoldierMoveImage;
import org.example.model.image.zombie.ZombieMoveImage;
import org.example.model.player.Unit;
import org.example.model.player.UnitType;

import java.awt.image.BufferedImage;
import java.util.List;

public class MoveImageFactory implements ImageFactory {
    private Image image;

    @Override
    public List<BufferedImage> createImage(String name, UnitType type) {
        if (type.equals(UnitType.SOLDIER)) {
            image = new SoldierMoveImage(name);
            return image.getImages();
        }

        image = new ZombieMoveImage(name);
        return image.getImages();
    }
}
