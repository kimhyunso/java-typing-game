package org.example.model.image;

import org.example.model.image.soldier.SoldierAttackImage;
import org.example.model.image.soldier.SoldierIdleImage;
import org.example.model.image.soldier.SoldierMoveImage;
import org.example.model.image.soldier.SoldierRunImage;
import org.example.model.image.zombie.ZombieAttackImage;
import org.example.model.image.zombie.ZombieMoveImage;
import org.example.model.image.zombie.ZombieRunImage;
import org.example.model.player.UnitType;

import java.awt.image.BufferedImage;
import java.util.List;

public class CharacterImageFactory {
    public List<BufferedImage> createImage(String name, UnitType type, Status action) {
        Image image;
        switch (action) {
            case ATTACK:
                image = type == UnitType.SOLDIER ? new SoldierAttackImage(name) : new ZombieAttackImage(name);
                break;
            case MOVE:
                image = type == UnitType.SOLDIER ? new SoldierMoveImage(name) : new ZombieMoveImage(name);
                break;
            case RUN:
                image = type == UnitType.SOLDIER ? new SoldierRunImage(name) : new ZombieRunImage(name);
                break;
            case IDLE:
                image = new SoldierIdleImage(name);
                break;
            default:
                throw new IllegalArgumentException("Unknown action: " + action);
        }
        return image.getImages();
    }

}
