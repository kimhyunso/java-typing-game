package org.example.domain.Image;

public class MoveImageFactory implements ImageFactory {

    @Override
    public Image createImage(String type) {
        new MoveImage();


        return new MoveImage();
    }
}
