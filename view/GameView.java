package view;

import java.awt.Graphics;

import javax.swing.JFrame;

public class GameView extends JFrame {

    private int defaultWidth = 800;
    private int defaultHeight = 800;


    public GameView(int width, int height) {
        setTitle("Typing Game");
        setSize(defaultWidth, defaultHeight);
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