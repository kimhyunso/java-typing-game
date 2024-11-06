package org.example.model.player;

import org.example.model.image.CharacterImageFactory;
import org.example.model.image.Status;

import java.awt.image.BufferedImage;
import java.util.List;

public class Zombie extends Unit implements Movable {
    private UnitType type = UnitType.ZOMBIE;
    private CharacterImageFactory imageFactory;
    private List<BufferedImage> moveImages;
    private List<BufferedImage> attackImages;
    private List<BufferedImage> runImages;



    public Zombie(String name) {
        imageFactory = new CharacterImageFactory();
        moveImages = imageFactory.createImage(name, type, Status.MOVE);
        attackImages = imageFactory.createImage(name, type, Status.ATTACK);
        runImages = imageFactory.createImage(name, type, Status.RUN);
    }

    @Override
    void attack() {

    }

    @Override
    public void move() {
        this.x -= 1;
    }

    public List<BufferedImage> getMoveImages() {
        return moveImages;
    }

    public List<BufferedImage> getAttackImages() {
        return attackImages;
    }

    public List<BufferedImage> getRunImages() {
        return runImages;
    }

}
