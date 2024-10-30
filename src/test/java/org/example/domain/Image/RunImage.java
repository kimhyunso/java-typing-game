package org.example.domain.Image;


public class RunImage extends Image implements ImageFactory {
    public RunImage(String filePath) {
        super(filePath);
    }

    @Override
    public Image createImage() {
        return this;
    }
}
