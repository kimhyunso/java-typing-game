package view;

import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.Graphics;
import java.awt.Toolkit;

import javax.swing.BoxLayout;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

import model.Display;
import model.Version;

public class GameView extends JFrame {

    private Display display;
    private JPanel panel;
    private Buttons buttons = new Buttons();
    
    public GameView() {
        setTitle("Typing Game " + Version.VERSION.value());
        setSize(display.WIDTH.value(), display.HEIGHT.value());
        Dimension frameSize = this.getSize();
        Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
		setLocation((screenSize.width - frameSize.width) / 2, (screenSize.height - frameSize.height) / 2);
        
        panel = new JPanel();
        panel.setLayout(new BoxLayout(panel, BoxLayout.Y_AXIS));
        
        addButton();
        setLayout(new FlowLayout(FlowLayout.CENTER, 0, (frameSize.height -  panel.getPreferredSize().height) / 2));
        add(panel);

        setResizable(false);
        setVisible(true);
        setDefaultCloseOperation(DISPOSE_ON_CLOSE);
    }

    public void addButton() {
        for (JButton button : buttons.getButtons()) {
            panel.add(button);
        }
    }

    @Override
    public void paint(Graphics g) {
        // TODO Auto-generated method stub
        super.paint(g);
    }

}