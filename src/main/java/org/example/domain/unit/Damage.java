package org.example.domain.unit;

import java.util.Objects;

public class Damage {
    private final int damage;

    public Damage(final int damage) {
        this.damage = damage;
    }

    @Override
    public String toString() {
        return "Damage{" +
                "damage=" + damage +
                '}';
    }

    @Override
    public boolean equals(Object object) {
        if (this == object) return true;
        if (object == null || getClass() != object.getClass()) return false;
        Damage damage1 = (Damage) object;
        return damage == damage1.damage;
    }

    @Override
    public int hashCode() {
        return Objects.hash(damage);
    }
}
