package org.example.view;

import java.awt.CardLayout;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.Graphics;
import java.awt.Toolkit;

import javax.swing.JFrame;
import javax.swing.JPanel;

public class GameView extends JFrame {
    // private static final int FARME_WIDTH = Display.WIDTH.value();
    // private static final int FARME_HEIGHT = Display.HEIGHT.value();    
    // private MainMenuPanel mainMenuPanel = new MainMenuPanel();
    private JPanel cards;

    public GameView() {
        // setTitle("Typing Game " + Version.VERSION.value());
        // setSize(FARME_WIDTH, FARME_HEIGHT);
        Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
		// setLocation((screenSize.width - FARME_WIDTH) / 2, (screenSize.height - FARME_HEIGHT) / 2);
        // setLayout(new FlowLayout(FlowLayout.CENTER, 0, (FARME_HEIGHT -  mainMenuPanel.getPreferredSize().height) / 2));

        cards = new JPanel(new CardLayout());
        // cards.add(mainMenuPanel, "mainMenu");
        cards.revalidate();

        add(cards);
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