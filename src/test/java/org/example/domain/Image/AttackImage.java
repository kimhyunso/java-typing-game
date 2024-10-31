package org.example.domain.Image;

import java.util.ArrayList;
import java.util.List;

public class AttackImage extends Image implements ImageFactory {
    private List<Image> soldierAttackImages = new ArrayList<>();
    private List<Image> zombieAttackImages = new ArrayList<>();

    public AttackImage() {}
    public AttackImage(String filePath) {
        this.filePath += currentDir + "/src/test/resources/image/" + filePath;
        containsFile();
    }
    @Override
    public Image createImage() {
        soldierAttackImages.add(new AttackImage("soldier_archive/soldier_davidthompson/attack"));
        soldierAttackImages.add(new AttackImage("soldier_archive/soldier_jamescarter/attack"));
        soldierAttackImages.add(new AttackImage("soldier_archive/soldier_johnmiller/attack"));

        zombieAttackImages.add(new AttackImage("zombie_archive/zombie_female/attack"));
        zombieAttackImages.add(new AttackImage("zombie_archive/zombie_male/attack"));
        zombieAttackImages.add(new AttackImage("zombie_archive/zombie_wild/attack"));
        return this;
    }

    public List<Image> getSoldierAttackImages() {
        return soldierAttackImages;
    }

    public List<Image> getZombieAttackImages() {
        return zombieAttackImages;
    }
}
