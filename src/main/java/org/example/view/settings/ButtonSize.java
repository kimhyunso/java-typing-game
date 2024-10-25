package view.settings;

public enum ButtonSize {
    WIDTH(100), HEIGHT(25);
    private int value;
    
    private ButtonSize(int value) {
        this.value = value;
    }

    public int value() {
        return value;
    }
}
