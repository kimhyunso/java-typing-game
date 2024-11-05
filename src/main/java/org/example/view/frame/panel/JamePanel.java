package org.example.view.frame.panel;

import org.example.model.image.CharacterImageFactory;
import org.example.model.image.Status;
import org.example.model.player.UnitType;
import org.example.view.components.JameButton;
import org.example.view.settings.ButtonSize;

import javax.swing.*;
import java.awt.*;
import java.awt.image.BufferedImage;
import java.util.List;

public class JamePanel extends JPanel {
    private CharacterImageFactory imageFactory = new CharacterImageFactory();
    private List<BufferedImage> idleImages;

    public JamePanel(JFrame frame) {
        setLayout(new BoxLayout(this, BoxLayout.Y_AXIS));
        add(new JameButton(frame));
        idleImages = imageFactory.createImage("jamescarter", UnitType.SOLDIER, Status.IDLE);
    }

    @Override
    protected void paintComponent(Graphics g) {
        for (BufferedImage image : idleImages) {
            g.drawImage(image, 0, ButtonSize.HEIGHT.value(), image.getWidth(), image.getHeight(),this);
        }
    }
}
