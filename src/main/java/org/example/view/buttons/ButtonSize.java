package org.example.view.buttons;

public enum ButtonSize {
    WIDTH(120), HEIGHT(30);
    private int value;

    private ButtonSize(int value) {
        this.value = value;
    }

    public int getValue() {
        return value;
    }
}
