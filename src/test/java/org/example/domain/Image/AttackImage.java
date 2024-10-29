package org.example.domain.Image;

public class AttackImage extends Image implements ImageFactory {
    @Override
    public Image createImage() {
        return this;
    }
}
