package org.example.view.frame;

import org.example.controller.MainController;
import org.example.view.settings.Display;
import org.example.view.settings.Version;

import java.awt.*;

import javax.swing.JFrame;

public class MainFrame extends JFrame {
    private int frameWidth = Display.WIDTH.value();
    private int frameHeight = Display.HEIGHT.value();
    private MainController controller;

    public MainFrame() {
        this.controller = new MainController(this, new CharacterChooseFrame());
        setTitle("Typing Game " + Version.VERSION.value());
        setSize(frameWidth, frameHeight);
        Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
		setLocation((screenSize.width - frameWidth) / 2, (screenSize.height - frameHeight) / 2);

        setResizable(false);
        setVisible(true);
        setDefaultCloseOperation(DISPOSE_ON_CLOSE);
    }

    @Override
    public void paint(Graphics g) {
        // TODO Auto-generated method stub
        super.paint(g);
    }
}