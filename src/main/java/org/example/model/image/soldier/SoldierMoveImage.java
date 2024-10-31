package org.example.model.image.soldier;

import org.example.model.image.Image;

import java.util.ArrayList;
import java.util.List;

public class SoldierMoveImage {
    private List<Image> davidthompsonMoveImage = new ArrayList<>();
    private List<Image> jamescarterMoveImage = new ArrayList<>();
    private List<Image> johnmillerMoveImage = new ArrayList<>();

    public List<Image> getDavidthompsonMoveImage() {
        return davidthompsonMoveImage;
    }

    public List<Image> getJamescarterMoveImage() {
        return jamescarterMoveImage;
    }

    public List<Image> getJohnmillerMoveImage() {
        return johnmillerMoveImage;
    }
}
