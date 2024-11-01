package org.example.view.components;

import java.awt.Dimension;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;

import org.example.controller.FrameController;
import org.example.view.settings.ButtonSize;

public class MultiModeButton extends JButton implements ActionListener {
    private static final String BUTTON_NAME = "멀티모드";
    private FrameController frameController;

    public MultiModeButton(FrameController frameController) {
        super(BUTTON_NAME);
        setPreferredSize(new Dimension(ButtonSize.WIDTH.value(), ButtonSize.HEIGHT.value()));
        setMaximumSize(new Dimension(ButtonSize.WIDTH.value(), ButtonSize.HEIGHT.value()));
        addActionListener(this);
        this.frameController = frameController;
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        frameController.handleMultiMode();
    }

}