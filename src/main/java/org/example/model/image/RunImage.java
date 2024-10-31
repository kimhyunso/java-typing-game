package org.example.model.image;


import java.util.ArrayList;
import java.util.List;

public class RunImage extends Image implements ImageFactory {
    private List<Image> soldierRunImages = new ArrayList<>();
    private List<Image> zombieRunImages = new ArrayList<>();

    public RunImage() {}
    public RunImage(String filePath) {
        this.filePath += currentDir + "/src/test/resources/image/" + filePath;
        containsFile();
    }

    @Override
    public Image createImage() {
        soldierRunImages.add(new RunImage("soldier_archive/soldier_davidthompson/run"));
        soldierRunImages.add(new RunImage("soldier_archive/soldier_jamescarter/run"));
        soldierRunImages.add(new RunImage("soldier_archive/soldier_johnmiller/run"));

        zombieRunImages.add(new RunImage("zombie_archive/zombie_female/run"));
        zombieRunImages.add(new RunImage("zombie_archive/zombie_male/run"));
        zombieRunImages.add(new RunImage("zombie_archive/zombie_wild/run"));
        return this;
    }

    public List<Image> getSoldierRunImages() {
        return soldierRunImages;
    }

    public List<Image> getZombieRunImages() {
        return zombieRunImages;
    }
}
