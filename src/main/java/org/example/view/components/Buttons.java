package org.example.view.components;

import java.util.ArrayList;
import java.util.List;
import javax.swing.JButton;

public class Buttons {
    private ExitButton exitButton = new ExitButton();
    private HonorButton honorButton = new HonorButton();
    private MultiModeButton multiModeButton = new MultiModeButton();
    private SettingButton settingButton = new SettingButton();
    private SingleModeButton singleModeButton = new SingleModeButton();
    private List<JButton> buttons = new ArrayList<JButton>();

    public Buttons() {
        buttons.add(singleModeButton);
        buttons.add(multiModeButton);
        buttons.add(settingButton);
        buttons.add(honorButton);
        buttons.add(exitButton);
    }

    public List<JButton> getButtons() {
        return this.buttons;
    }
}
