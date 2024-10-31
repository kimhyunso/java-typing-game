package org.example.model.player;

public abstract class Unit {
    protected String name;
    protected int heath;
    protected int x;
    protected int y;

    abstract void attack();
}
