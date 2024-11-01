package org.example.view.frame.panel;

import org.example.model.image.soldier.SoldierIdleImage;
import org.example.view.components.*;

import javax.imageio.ImageIO;
import javax.swing.*;
import java.awt.*;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

public class CharacterPanel extends JPanel {

    public CharacterPanel(JFrame frame) {
        setLayout(new BoxLayout(this, BoxLayout.X_AXIS));
        add(new CharacterChooseButton());
        add(new CharacterChooseButton());
        add(new CharacterChooseButton());
    }

    @Override
    protected void paintComponent(Graphics g) {
//        g.drawImage(apple, 10, 10, w, h, this);
    }
}
