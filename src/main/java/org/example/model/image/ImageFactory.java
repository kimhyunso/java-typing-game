package org.example.model.image;

import org.example.model.player.Unit;

public interface ImageFactory {
    public Image createImage(Unit unit);
}
