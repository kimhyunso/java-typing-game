package test.view.settings;

import test.view.components.ExitButtonTest;
import test.view.components.HonorButtonTest;
import test.view.components.MultiButtonTest;
import test.view.components.SettingButtonTest;
import test.view.components.SingleButtonTest;

public enum ModeSettingTest {
    SINGLE_MODE("1", new SingleButtonTest()), MULTI_MODE("2", new MultiButtonTest()), 
    SETTING_MODE("3", new SettingButtonTest()), HONOR_MODE("4", new HonorButtonTest()),
    EXIT_MODE("5", new ExitButtonTest());
    private String name;
    private ModeTest modeTest;

    private ModeSettingTest(String name, ModeTest modeTest) {
        this.name = name;
        this.modeTest = modeTest;
    }

    public ModeTest mode() {
        return this.modeTest;
    }
}
