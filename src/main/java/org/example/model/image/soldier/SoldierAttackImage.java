package org.example.model.image.soldier;

import org.example.model.image.Image;

import java.util.ArrayList;
import java.util.List;

public class SoldierAttackImage {
    private List<Image> davidthompsonAttackImage = new ArrayList<>();
    private List<Image> jamescarterAttackImage = new ArrayList<>();
    private List<Image> johnmillerAttackImage = new ArrayList<>();

//    public SoldierAttackImage() {
//        this.filePath += currentDir + "/src/test/resources/image/" + filePath;
//    }

    public List<Image> getDavidthompsonAttackImage() {
        return davidthompsonAttackImage;
    }

    public List<Image> getJamescarterAttackImage() {
        return jamescarterAttackImage;
    }

    public List<Image> getJohnmillerAttackImage() {
        return johnmillerAttackImage;
    }
}
