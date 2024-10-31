package org.example.model.image;

import java.util.ArrayList;
import java.util.List;

public class MoveImage extends Image {
    private List<Image> zombieMoveImages = new ArrayList<>();
    private List<Image> soldierMoveImages = new ArrayList<>();

    public MoveImage() {}
    public MoveImage(String filePath) {
        this.filePath += currentDir + "/src/test/resources/image/" + filePath;
        containsFile();

        zombieMoveImages.add(new MoveImage("zombie_archive/zombie_female/walk"));
        zombieMoveImages.add(new MoveImage("zombie_archive/zombie_male/walk"));
        zombieMoveImages.add(new MoveImage("zombie_archive/zombie_wild/walk"));

        soldierMoveImages.add(new MoveImage("soldier_archive/soldier_davidthompson/walk"));
        soldierMoveImages.add(new MoveImage("soldier_archive/soldier_jamescarter/walk"));
        soldierMoveImages.add(new MoveImage("soldier_archive/soldier_johnmiller/walk"));
    }

    public List<Image> getZombieMoveImages() {
        return zombieMoveImages;
    }

    public List<Image> getSoldierMoveImages() {
        return soldierMoveImages;
    }
}
