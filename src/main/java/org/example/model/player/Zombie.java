package org.example.model.player;

import org.example.model.image.AttackImageFactory;
import org.example.model.image.MoveImageFactory;
import org.example.model.image.RunImageFactory;

public class Zombie extends Unit implements Movable {
    private UnitType type = UnitType.ZOMBIE;

    public Zombie(String name) {
        attackImageFactory = new AttackImageFactory();
        attackImageFactory.createImage(name, type);

        runImageFactory = new RunImageFactory();
        runImageFactory.createImage(name, type);

        moveImageFactory = new MoveImageFactory();
        moveImageFactory.createImage(name, type);
    }

    @Override
    void attack() {

    }

    @Override
    public void move() {
        this.x -= 1;
    }
}
