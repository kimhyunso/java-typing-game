package view.components;

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
        buttons.add(exitButton);
        buttons.add(honorButton);
        buttons.add(multiModeButton);
        buttons.add(settingButton);
        buttons.add(singleModeButton);
    }

    public List<JButton> getButtons() {
        return this.buttons;
    }
}
