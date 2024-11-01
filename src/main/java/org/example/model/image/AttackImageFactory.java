package org.example.model.image;

import org.example.model.image.soldier.SoldierAttackImage;
import org.example.model.image.soldier.SoldierRunImage;
import org.example.model.image.zombie.ZombieAttackImage;
import org.example.model.player.Unit;
import org.example.model.player.UnitType;

import javax.print.attribute.standard.MediaSize;
import java.awt.image.BufferedImage;
import java.util.List;

public class AttackImageFactory implements ImageFactory {
    private Image image;

    @Override
    public List<BufferedImage> createImage(String name, UnitType type) {
        if (type.equals(UnitType.SOLDIER)) {
            image = new SoldierAttackImage(name);
            return image.getImages();
        }

        image = new ZombieAttackImage(name);
        return image.getImages();
    }
}
