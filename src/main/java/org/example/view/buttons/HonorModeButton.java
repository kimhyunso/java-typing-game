package org.example.view.buttons;

import org.example.controller.MainModeController;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class HonorModeButton extends JButton implements ActionListener {
    private final static String NAME = "명예의전당";
    private MainModeController controller;

    public HonorModeButton(MainModeController controller) {
        super(NAME);
        this.controller = controller;
        setPreferredSize(new Dimension(ButtonSize.WIDTH.getValue(), ButtonSize.WIDTH.getValue()));
        addActionListener(this);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        controller.handleHonorMode();
    }
}
