package org.example.domain.unit.soldier;

import org.example.domain.image.SoldierImageFactory;
import org.example.domain.image.Status;
import org.example.domain.unit.Damage;
import org.example.domain.unit.DeadStatus;
import org.example.domain.unit.Position;
import org.example.domain.unit.Unit;

public class Soldier extends Unit {
    public Soldier(String name, Position position, Damage damage) {
        this.name = name;
        this.position = position;
        this.damage = damage;
        this.status = DeadStatus.ARRIVED;
        attackImages = SoldierImageFactory.loadImageByStatus(name, Status.ATTACK);
        runImages = SoldierImageFactory.loadImageByStatus(name, Status.RUN);
        moveImages = SoldierImageFactory.loadImageByStatus(name, Status.WALK);
    }

}
