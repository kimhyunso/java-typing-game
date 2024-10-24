package test.view.settings;

public enum ModeSettingTest {
    SINGLE_MODE("1", );
    private String name;
    private ModeTest modeTest;

    private Mode(String name, ModeTest modeTest) {
        this.name = name;
        this.modeTest = modeTest;
    }
}
