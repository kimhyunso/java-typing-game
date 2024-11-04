package org.example.view.components;

import org.example.view.settings.ButtonSize;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class JohnButton extends JButton implements ActionListener {
    private static final String BUTTON_NAME = "선택";

    public JohnButton() {
        super(BUTTON_NAME);
        setPreferredSize(new Dimension(ButtonSize.WIDTH.value(), ButtonSize.HEIGHT.value()));
        setMaximumSize(new Dimension(ButtonSize.WIDTH.value(), ButtonSize.HEIGHT.value()));
        addActionListener(this);
    }

    @Override
    public void actionPerformed(ActionEvent e) {


    }
}
