package org.example.view.components;

import java.awt.Dimension;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;

import org.example.controller.MainController;
import org.example.view.settings.ButtonSize;

public class SettingButton extends JButton implements ActionListener {
    private static final String BUTTON_NAME = "설정";
    private MainController mainController;

    public SettingButton(MainController mainController) {
        super(BUTTON_NAME);
        setPreferredSize(new Dimension(ButtonSize.WIDTH.value(), ButtonSize.HEIGHT.value()));
        setMaximumSize(new Dimension(ButtonSize.WIDTH.value(), ButtonSize.HEIGHT.value()));
        addActionListener(this);
        this.mainController = mainController;
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        mainController.handleSettingMode();
    }
}