package view;

import java.awt.Dimension;
import java.util.ArrayList;
import java.util.List;

import javax.swing.JButton;

public class Buttons {

    private List<String> buttonNames = new ArrayList<String>();
    private List<JButton> buttons = new ArrayList<JButton>();
    private static final int WIDTH = 100;
    private static final int HEIGHT = 40;


    public Buttons() {
        buttonNames.add("싱글모드");
        buttonNames.add("멀티모드");
        buttonNames.add("설정");
        buttonNames.add("명예의전당");
        buttonNames.add("끝내기");

        for (String name : buttonNames) {
            JButton button = new JButton(name);
            button.setPreferredSize(new Dimension(WIDTH, HEIGHT));
            button.setMaximumSize(new Dimension(WIDTH, HEIGHT));
            buttons.add(button);
        }
    }

    public List<JButton> getButtons() {
        return this.buttons;
    }
    
}
