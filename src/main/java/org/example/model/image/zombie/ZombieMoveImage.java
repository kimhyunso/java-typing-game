package org.example.model.image.zombie;

import org.example.model.image.Image;

import java.util.ArrayList;
import java.util.List;

public class ZombieMoveImage {
    private List<Image> femaleMoveImage = new ArrayList<>();
    private List<Image> maleMoveImage = new ArrayList<>();
    private List<Image> maleWildImage = new ArrayList<>();

    public List<Image> getFemaleMoveImage() {
        return femaleMoveImage;
    }

    public List<Image> getMaleMoveImage() {
        return maleMoveImage;
    }

    public List<Image> getMaleWildImage() {
        return maleWildImage;
    }
}
