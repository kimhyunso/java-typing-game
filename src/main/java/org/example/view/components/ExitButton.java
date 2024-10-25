package org.example.view.components;

import java.awt.Dimension;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;

import view.settings.ButtonSize;

public class ExitButton extends JButton implements ActionListener {
    private static final String BUTTON_NAME = "끝내기";
    private static final int BUTTON_WIDTH = ButtonSize.WIDTH.value();
    private static final int BUTTON_HEIGHT = ButtonSize.HEIGHT.value();
    
    public ExitButton() {
        super(BUTTON_NAME);
        setPreferredSize(new Dimension(BUTTON_WIDTH, BUTTON_HEIGHT));
        setMaximumSize(new Dimension(BUTTON_WIDTH, BUTTON_HEIGHT));
        addActionListener(this);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        System.exit(0);
    }
}