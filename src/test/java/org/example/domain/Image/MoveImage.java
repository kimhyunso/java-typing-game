package org.example.domain.Image;

public class MoveImage extends Image implements ImageFactory {
    @Override
    public Image createImage() {
        return this;
    }
}
