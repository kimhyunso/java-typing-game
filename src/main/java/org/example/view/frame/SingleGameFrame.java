package org.example.view.frame;

import org.example.model.player.Soldier;
import org.example.model.player.Zombie;
import org.example.view.settings.ButtonSize;
import org.example.view.settings.Display;
import org.example.view.settings.Version;

import javax.swing.*;
import java.awt.*;
import java.awt.image.BufferedImage;
import java.util.ArrayList;
import java.util.List;

public class SingleGameFrame extends JFrame implements Runnable {
    private Soldier soldier;
    private int frameWidth = Display.WIDTH.value();
    private int frameHeight = Display.HEIGHT.value();
    private static final int FPS = 60;
    private static final int FRAME_DURATION = 1000 / FPS; // 16ms
    private int frameCount = 0;
    private long lastTime = System.currentTimeMillis();
    private int level = 0;
    private Zombie zombie;


    public SingleGameFrame(Soldier soldier) {
        this.soldier = soldier;
        setTitle("Typing Game " + Version.VERSION.value());
        setSize(frameWidth, frameHeight);
        Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
        setLocation((screenSize.width - frameWidth) / 2, (screenSize.height - frameHeight) / 2);

        setResizable(false);
        setVisible(true);
        setDefaultCloseOperation(DISPOSE_ON_CLOSE);
        zombie = new Zombie("male");
    }

    @Override
    public void run() {
        while (true) {
            long startTime = System.currentTimeMillis();

            repaint();
            zombie.move();
            frameCount++;

            // 1초마다 FPS 측정
            long currentTime = System.currentTimeMillis();
            if (currentTime - lastTime >= 1000) { // 1초가 지났을 때
                System.out.println("FPS: " + frameCount);
                frameCount = 0;
                lastTime = currentTime;
            }

            long endTime = System.currentTimeMillis();
            long sleepTime = FRAME_DURATION - (endTime - startTime);

            if (sleepTime > 0) {
                try {
                    Thread.sleep(sleepTime);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        }
    }

    @Override
    public void paint(Graphics g) {
        for (BufferedImage moveImage : zombie.getMoveImages()) {
            try {
                Thread.sleep(2000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            g.drawImage(moveImage, zombie.getX(), zombie.getY(), moveImage.getWidth(), moveImage.getHeight(),this);
        }
    }
}
