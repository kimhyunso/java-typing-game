package org.example.model.player;

import org.example.model.image.CharacterImageFactory;
import org.example.model.image.Status;

import java.awt.image.BufferedImage;
import java.util.List;

public class Soldier extends Unit {
    private UnitType type = UnitType.SOLDIER;
    private List<BufferedImage> attackImages;
    private List<BufferedImage> moveImages;
    private List<BufferedImage> runImages;

    public Soldier(String name) {
        CharacterImageFactory characterImageFactory = new CharacterImageFactory();
        attackImages = characterImageFactory.createImage(name, type, Status.ATTACK);
        moveImages = characterImageFactory.createImage(name, type, Status.MOVE);
        runImages = characterImageFactory.createImage(name, type, Status.RUN);
    }

    @Override
    void attack() {

    }
}
