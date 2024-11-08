package org.example.domain.unit;

import java.awt.image.BufferedImage;
import java.util.List;

public abstract class Unit {
    protected String name;
    protected Position position;
    protected Damage damage;
    protected List<BufferedImage> attackImages;
    protected List<BufferedImage> runImages;
    protected List<BufferedImage> moveImages;
    protected DeadStatus status;

}
