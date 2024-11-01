package org.example.view.frame;

import org.example.controller.FrameController;
import org.example.view.GameView;
import org.example.view.frame.panel.MainMenuPanel;
import org.example.view.settings.Display;
import org.example.view.settings.Version;

import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.Graphics;
import java.awt.Toolkit;

import javax.swing.JFrame;

public class ChooseFrame extends JFrame implements GameView {
     private int frameWidth = Display.WIDTH.value();
     private int frameHeight = Display.HEIGHT.value();

    public ChooseFrame() {
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

    @Override
    public void updateView() {

    }
}