package org.example.view.frame.panel;

import org.example.controller.FrameController;
import org.example.view.components.*;

import javax.swing.*;

public class MainMenuPanel extends JPanel {

    public MainMenuPanel(FrameController frameController) {
        setLayout(new BoxLayout(this, BoxLayout.Y_AXIS));
        add(new SingleModeButton(frameController));
        add(new MultiModeButton(frameController));
        add(new SettingButton(frameController));
        add(new HonorButton(frameController));
        add(new ExitButton(frameController));
    }
}
