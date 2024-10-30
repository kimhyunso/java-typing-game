package org.example.domain.Image;

public class MoveImage extends Image implements ImageFactory {
    public MoveImage(String filePath) {
        super(filePath);
    }
    @Override
    public Image createImage() {
        return this;
    }
}
