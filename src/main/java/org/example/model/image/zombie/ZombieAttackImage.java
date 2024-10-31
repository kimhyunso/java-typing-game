package org.example.model.image.zombie;

import org.example.model.image.Image;

import java.util.ArrayList;
import java.util.List;

public class ZombieAttackImage {
    private List<Image> femaleAttackImage = new ArrayList<>();
    private List<Image> maleAttackImage = new ArrayList<>();
    private List<Image> wildAttackImage = new ArrayList<>();

    public List<Image> getFemaleAttackImage() {
        return femaleAttackImage;
    }

    public List<Image> getMaleAttackImage() {
        return maleAttackImage;
    }

    public List<Image> getWildAttackImage() {
        return wildAttackImage;
    }
}
