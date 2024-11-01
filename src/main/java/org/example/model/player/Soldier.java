package org.example.model.player;

import org.example.model.image.AttackImageFactory;
import org.example.model.image.MoveImageFactory;
import org.example.model.image.RunImageFactory;

public class Soldier extends Unit {
    private UnitType type = UnitType.SOLDIER;

    public Soldier(String name) {
        moveImageFactory = new MoveImageFactory();
        moveImageFactory.createImage(name, type);

        attackImageFactory = new AttackImageFactory();
        attackImageFactory.createImage(name, type);

        runImageFactory = new RunImageFactory();
        runImageFactory.createImage(name, type);
    }

    @Override
    void attack() {

    }
}
