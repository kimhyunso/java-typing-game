package org.example.model.player;

public abstract class Unit {
    protected String name;
    protected int heath;
    protected int x;
    protected int y;
    protected MoveImageFactory moveImageFactory;
    protected AttackImageFactory attackImageFactory;
    protected RunImageFactory runImageFactory;


    abstract void attack();
}
