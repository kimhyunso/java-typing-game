package org.example.domain.unit;

import java.util.Objects;

public class Heath {
    private int heath;

    public Heath(int heath) {
        this.heath = heath;
    }

    @Override
    public boolean equals(Object object) {
        if (this == object) return true;
        if (object == null || getClass() != object.getClass()) return false;
        Heath heath1 = (Heath) object;
        return heath == heath1.heath;
    }

    @Override
    public int hashCode() {
        return Objects.hash(heath);
    }

    @Override
    public String toString() {
        return "Heath{" +
                "heath=" + heath +
                '}';
    }
}
