package org.example.view.components;

import java.awt.Dimension;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;

import org.example.controller.MainController;
import org.example.view.settings.ButtonSize;

public class SingleModeButton extends JButton implements ActionListener {
    private static final String BUTTON_NAME = "싱글모드";
    private MainController mainController;

    public SingleModeButton(MainController mainController) {
        super(BUTTON_NAME);
        setPreferredSize(new Dimension(ButtonSize.WIDTH.value(), ButtonSize.HEIGHT.value()));
        setMaximumSize(new Dimension(ButtonSize.WIDTH.value(), ButtonSize.HEIGHT.value()));
        addActionListener(this);
        this.mainController = mainController;
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        mainController.handleSingleMode();
    }
}