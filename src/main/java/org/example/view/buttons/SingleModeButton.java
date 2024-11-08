package org.example.view.buttons;

import org.example.controller.MainModeController;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class SingleModeButton extends JButton implements ActionListener {
    private final static String NAME = "싱글모드";
    private final MainModeController controller;

    public SingleModeButton(MainModeController controller) {
        super(NAME);
        this.controller = controller;
        setPreferredSize(new Dimension(ButtonSize.WIDTH.getValue(), ButtonSize.HEIGHT.getValue()));
        addActionListener(this);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        controller.handleSingleMode();
    }
}
