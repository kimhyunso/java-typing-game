package org.example.domain.Image;

public class AttackImage extends Image implements ImageFactory {
    public AttackImage(String filePath) {
        super(filePath);
    }
    @Override
    public Image createImage() {
        return this;
    }
}
