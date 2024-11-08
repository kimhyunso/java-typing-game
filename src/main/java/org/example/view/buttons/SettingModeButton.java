package org.example.view.buttons;

import org.example.controller.MainModeController;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class SettingModeButton extends JButton implements ActionListener {
    private final static String NAME = "설정";
    private MainModeController controller;

    public SettingModeButton(MainModeController controller) {
        super(NAME);
        this.controller = controller;
        setPreferredSize(new Dimension(ButtonSize.WIDTH.getValue(), ButtonSize.HEIGHT.getValue()));
        addActionListener(this);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        controller.handleSettingMode();
    }
}
