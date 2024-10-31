package org.example.model.image;

import org.example.model.image.soldier.SoldierAttackImage;
import org.example.model.player.Unit;

import java.util.List;

public class AttackImageFactory implements ImageFactory {
    private Image image;

    @Override
    public List<Image> createImage(ImageType type) {
        if (type == ImageType.SOLDIER_DAVIDTHOMPSON) {
            image = new SoldierAttackImage();

        }
        return null;
    }
}
