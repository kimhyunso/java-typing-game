package org.example.view.frame.panel;

import org.example.view.components.*;

import javax.swing.*;

public class MainMenuPanel extends JPanel {

    public MainMenuPanel(JFrame frame) {
        setLayout(new BoxLayout(this, BoxLayout.Y_AXIS));
        add(new SingleModeButton(frame));
        add(new MultiModeButton(frame));
        add(new SettingButton());
        add(new HonorButton());
        add(new ExitButton());
    }
}
