package org.example.domain.Image;

import org.example.domain.Image.Image;
import org.example.domain.Unit;

public interface ImageFactory {
    public Image createImage(Unit unit);
}
