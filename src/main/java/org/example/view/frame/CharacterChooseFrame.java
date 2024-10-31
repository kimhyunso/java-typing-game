package org.example.view.frame;

import org.example.view.settings.Display;
import org.example.view.settings.Version;

import javax.swing.*;
import java.awt.*;

public class CharacterChooseFrame extends JFrame {
    private int frameWidth = Display.WIDTH.value();
    private int frameHeight = Display.HEIGHT.value();

    public CharacterChooseFrame() {
        setTitle("Typing Game " + Version.VERSION.value());
        setSize(frameWidth, frameHeight);
        Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
        setLocation((screenSize.width - frameWidth) / 2, (screenSize.height - frameHeight) / 2);

        setDefaultCloseOperation(DISPOSE_ON_CLOSE);
        setResizable(false);
    }
}
