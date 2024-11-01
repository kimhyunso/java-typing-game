package org.example.model.player;

public class Zombie extends Unit implements Movable {
    private UnitType type = UnitType.ZOMBIE;

    public Zombie(String name) {

    }

    @Override
    void attack() {

    }

    @Override
    public void move() {
        this.x -= 1;
    }
}
