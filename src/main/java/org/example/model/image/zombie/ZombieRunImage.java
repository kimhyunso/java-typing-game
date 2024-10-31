package org.example.model.image.zombie;

import org.example.model.image.Image;
import org.example.model.image.ImageType;

import java.util.ArrayList;
import java.util.List;

public class ZombieRunImage {
    private List<Image> famaleRunImage = new ArrayList<>();
    private List<Image> maleRunImage = new ArrayList<>();
    private List<Image> wildRunImage = new ArrayList<>();

    public List<Image> getFamaleRunImage() {
        return famaleRunImage;
    }

    public List<Image> getMaleRunImage() {
        return maleRunImage;
    }

    public List<Image> getWildRunImage() {
        return wildRunImage;
    }
}
