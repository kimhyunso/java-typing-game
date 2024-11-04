package org.example.view.frame.panel;

import org.example.model.image.CharacterImageFactory;
import org.example.model.player.UnitType;
import org.example.view.components.CharacterChooseButton;
import org.example.view.settings.ButtonSize;

import javax.swing.*;
import java.awt.*;
import java.awt.image.BufferedImage;
import java.util.List;

public class JamescarterPanel extends JPanel {
    private CharacterImageFactory imageFactory = new CharacterImageFactory();

    public JamescarterPanel() {
        setLayout(new BoxLayout(this, BoxLayout.Y_AXIS));
        add(new CharacterChooseButton());
    }

    @Override
    protected void paintComponent(Graphics g) {
        List<BufferedImage> davidthompsonIdleImage =
                imageFactory.createImage("soldier_jamescarter", UnitType.SOLDIER, "idle");

        for (BufferedImage image : davidthompsonIdleImage) {
            g.drawImage(image, 0, ButtonSize.HEIGHT.value(), image.getWidth(), image.getHeight(),this);
        }
    }
}
