package org.example.view.components;

import org.example.controller.GameController;
import org.example.model.player.Soldier;
import org.example.view.settings.ButtonSize;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class DavidButton extends JButton implements ActionListener {
    private static final String BUTTON_NAME = "선택";
    private static final String NAME = "davidthompson";
    private GameController gameController;
    private JFrame prevFrame;

    public DavidButton(JFrame frame) {
        super(BUTTON_NAME);
        setPreferredSize(new Dimension(ButtonSize.WIDTH.value(), ButtonSize.HEIGHT.value()));
        setMaximumSize(new Dimension(ButtonSize.WIDTH.value(), ButtonSize.HEIGHT.value()));
        addActionListener(this);
        this.prevFrame = frame;
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        Soldier soldier = new Soldier(NAME);
        gameController = new GameController(soldier, prevFrame);
        gameController.handleDavidSingleMode();
    }
}
