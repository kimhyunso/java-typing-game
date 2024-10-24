package view.components;

import java.awt.Dimension;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;

import view.settings.ButtonSize;

public class SingleModeButton extends JButton implements ActionListener {
    private static final String BUTTON_NAME = "싱글모드";
    private static final int BUTTON_WIDTH = ButtonSize.WIDTH.value();
    private static final int BUTTON_HEIGHT = ButtonSize.HEIGHT.value();

    public SingleModeButton() {
        super(BUTTON_NAME);
        setPreferredSize(new Dimension(BUTTON_WIDTH, BUTTON_HEIGHT));
        setMaximumSize(new Dimension(BUTTON_WIDTH, BUTTON_HEIGHT));
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'actionPerformed'");
    }
}