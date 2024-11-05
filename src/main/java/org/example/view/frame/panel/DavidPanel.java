package org.example.view.frame.panel;

import org.example.model.image.CharacterImageFactory;
import org.example.model.image.Status;
import org.example.model.player.UnitType;
import org.example.view.components.*;
import org.example.view.settings.ButtonSize;

import javax.swing.*;
import java.awt.*;
import java.awt.image.BufferedImage;
import java.util.List;

public class DavidPanel extends JPanel {
    private CharacterImageFactory imageFactory = new CharacterImageFactory();
    private List<BufferedImage> idleImages;

    public DavidPanel(JFrame frame) {
        setLayout(new BoxLayout(this, BoxLayout.Y_AXIS));
        add(new DavidButton(frame));
        idleImages = imageFactory.createImage("davidthompson", UnitType.SOLDIER, Status.IDLE);
    }

    @Override
    protected void paintComponent(Graphics g) {
        for (BufferedImage image : idleImages) {
            g.drawImage(image, 0, ButtonSize.HEIGHT.value(), image.getWidth(), image.getHeight(),this);
        }
    }
}
