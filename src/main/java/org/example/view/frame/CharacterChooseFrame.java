package org.example.view.frame;

import org.example.model.ChooseModel;
import org.example.model.image.CharacterImageFactory;
import org.example.model.player.UnitType;
import org.example.view.settings.Display;
import org.example.view.settings.Version;

import javax.swing.*;
import java.awt.*;
import java.awt.image.BufferedImage;
import java.util.List;

public class CharacterChooseFrame extends JFrame {
    private int frameWidth = Display.WIDTH.value();
    private int frameHeight = Display.HEIGHT.value();
    private CharacterImageFactory imageFactory;

    public CharacterChooseFrame() {
        setTitle("Typing Game " + Version.VERSION.value());
        setSize(frameWidth, frameHeight);
        Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
        setLocation((screenSize.width - frameWidth) / 2, (screenSize.height - frameHeight) / 2);

        setDefaultCloseOperation(DISPOSE_ON_CLOSE);
        setResizable(false);
        imageFactory = new CharacterImageFactory();
    }
    @Override
    public void paint(Graphics g) {
        List<BufferedImage> davidthompsonIdleImage =
                imageFactory.createImage("soldier_davidthompson", UnitType.SOLDIER, "idle");

        List<BufferedImage> jamescarterIdleImage =
                imageFactory.createImage("soldier_jamescarter", UnitType.SOLDIER, "idle");

        List<BufferedImage> johnmillerIdleImage =
                imageFactory.createImage("soldier_johnmiller", UnitType.SOLDIER, "idle");

        drawImage(davidthompsonIdleImage, g);
        drawImage(jamescarterIdleImage, g);
        drawImage(johnmillerIdleImage, g);
    }

    private void drawImage(List<BufferedImage> images, Graphics g) {
        for (BufferedImage image : images) {
            g.drawImage(image, 10, 10,this);
        }
    }
}
