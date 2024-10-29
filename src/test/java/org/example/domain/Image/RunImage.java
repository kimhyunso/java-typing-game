package org.example.domain.Image;


public class RunImage extends Image implements ImageFactory {
    @Override
    public Image createImage() {
        return this;
    }
}
