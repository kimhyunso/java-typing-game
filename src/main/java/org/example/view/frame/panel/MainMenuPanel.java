package org.example.view.frame.panel;

import org.example.controller.MainController;
import org.example.view.components.*;

import javax.swing.*;

public class MainMenuPanel extends JPanel {
    public MainMenuPanel(MainController mainController) {
        setLayout(new BoxLayout(this, BoxLayout.Y_AXIS));
        add(new SingleModeButton(mainController));
        add(new MultiModeButton(mainController));
        add(new SettingButton(mainController));
        add(new HonorButton(mainController));
        add(new ExitButton(mainController));
    }
}
