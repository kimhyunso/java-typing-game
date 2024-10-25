package org.example.view.components;

import javax.swing.BoxLayout;
import javax.swing.JButton;
import javax.swing.JPanel;

public class MainMenuPanel extends JPanel {
    private Buttons buttons = new Buttons();

    public MainMenuPanel() {
        setLayout(new BoxLayout(this, BoxLayout.Y_AXIS));
        for (JButton button : buttons.getButtons()) {
            add(button);
        }
    }
}
