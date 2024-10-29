package org.example.controller;

import org.example.view.components.listener.ActionListenerTest;

import java.net.SocketException;
import java.net.UnknownHostException;

public class ModeController {
    private ActionListenerTest button;

    public ModeController(ActionListenerTest button) {
        this.button = button;
    }

    public void action() throws SocketException, UnknownHostException {
        button.execute();
    }
}
