package org.example.model.player;

import org.example.model.image.CharacterImageFactory;

public class Soldier extends Unit {
    private UnitType type = UnitType.SOLDIER;

    public Soldier(String name) {
        CharacterImageFactory characterImageFactory = new CharacterImageFactory();
        characterImageFactory.createImage(name, type, "attack");
    }

    @Override
    void attack() {

    }
}
