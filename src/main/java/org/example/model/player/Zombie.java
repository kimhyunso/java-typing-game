package org.example.model.player;

public class Zombie extends Unit implements Movable {
    @Override
    void attack() {

    }

    @Override
    public void move() {
        this.x -= 1;
    }
}
