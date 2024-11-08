package org.example.view;

import org.example.controller.MainModeController;
import org.example.view.buttons.SingleModeButton;

import javax.swing.*;
import java.util.Scanner;

public class MainView {
    public static void run() {
        JFrame frame = new JFrame();
        JPanel panel = new JPanel();
        MainModeController controller = new MainModeController(frame);

        panel.setLayout(new BoxLayout(panel, BoxLayout.Y_AXIS));
        panel.add(new SingleModeButton(controller));

        frame.add(panel);

        frame.setVisible(true);
    }
}
