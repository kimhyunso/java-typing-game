package org.example.view.buttons;

import org.example.controller.MainModeController;

import javax.print.attribute.standard.MediaSize;
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class ExitModeButton extends JButton implements ActionListener {
    private final static String NAME = "종료하기";
    private MainModeController controller;

    public ExitModeButton(MainModeController controller) {
        super(NAME);
        this.controller = controller;
        setPreferredSize(new Dimension(ButtonSize.WIDTH.getValue(), ButtonSize.HEIGHT.getValue()));
        addActionListener(this);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        controller.handleExitMode();
    }
}
