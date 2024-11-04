package org.example.view.frame.panel;

import org.example.model.image.CharacterImageFactory;
import org.example.model.player.UnitType;
import org.example.view.components.*;
import org.example.view.settings.ButtonSize;

import javax.swing.*;
import java.awt.*;
import java.awt.image.BufferedImage;
import java.util.List;

public class DavidthompsonPanel extends JPanel {
    private CharacterImageFactory imageFactory = new CharacterImageFactory();

    public DavidthompsonPanel(JFrame frame) {
        setLayout(new BoxLayout(this, BoxLayout.Y_AXIS));
        add(new DavidButton(frame));
    }

    @Override
    protected void paintComponent(Graphics g) {
        List<BufferedImage> davidthompsonIdleImage =
                imageFactory.createImage("davidthompson", UnitType.SOLDIER, "idle");

        for (BufferedImage image : davidthompsonIdleImage) {
            g.drawImage(image, 0, ButtonSize.HEIGHT.value(), image.getWidth(), image.getHeight(),this);
        }
    }
}
