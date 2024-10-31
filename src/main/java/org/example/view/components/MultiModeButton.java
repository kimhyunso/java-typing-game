package org.example.view.components;

import java.awt.Dimension;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;

import org.example.view.settings.ButtonSize;

public class MultiModeButton extends JButton implements ActionListener, Runnable {
    private static final String BUTTON_NAME = "멀티모드";
    private JFrame prevFrame;

    public MultiModeButton(JFrame prevFrame) {
        super(BUTTON_NAME);
        setPreferredSize(new Dimension(ButtonSize.WIDTH.value(), ButtonSize.HEIGHT.value()));
        setMaximumSize(new Dimension(ButtonSize.WIDTH.value(), ButtonSize.HEIGHT.value()));
        addActionListener(this);
        this.prevFrame = prevFrame;
    }

    @Override
    public void actionPerformed(ActionEvent e) {
    }

    @Override
    public void run() {

    }
}