package org.example.view.components;

import java.awt.Dimension;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;

import org.example.view.frame.CharacterChooseFrame;
import org.example.view.frame.ChooseFrame;
import org.example.view.settings.ButtonSize;

public class SingleModeButton extends JButton implements ActionListener {
    private static final String BUTTON_NAME = "싱글모드";
    private JFrame prevFrame;
    private JFrame nextFrame;

    public SingleModeButton(JFrame prevFrame) {
        super(BUTTON_NAME);
        setPreferredSize(new Dimension(ButtonSize.WIDTH.value(), ButtonSize.HEIGHT.value()));
        setMaximumSize(new Dimension(ButtonSize.WIDTH.value(), ButtonSize.HEIGHT.value()));
        addActionListener(this);
        this.prevFrame = prevFrame;
        this.nextFrame = new CharacterChooseFrame();
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        prevFrame.dispose();
        prevFrame.setVisible(false);
        nextFrame.setVisible(true);
    }

}