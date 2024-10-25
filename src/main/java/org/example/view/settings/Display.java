package view.settings;

public enum Display {
    WIDTH(800), HEIGHT(600);

    private int value;

    private Display(int value) {
        this.value = value;
    }

    public int value() {
        return this.value;
    }
}