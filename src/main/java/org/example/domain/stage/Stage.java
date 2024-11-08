package org.example.domain.stage;

import java.awt.image.BufferedImage;
import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

public class Stage {
    private final int level;
    private final BufferedImage backgroundImage;
    private final int score;

    public Stage(final int level, final BufferedImage backgroundImage, final int score) {
        this.level = level;
        this.backgroundImage = backgroundImage;
        this.score = score;
    }


}
