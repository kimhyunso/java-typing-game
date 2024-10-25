package org.example.view.components;

import org.example.view.components.listener.ActionListenerTest;

import java.util.Arrays;

public enum ModeSettingTest {
    EMPTY_MODE("0", null), SINGLE_MODE("1", new SingleButtonTest()),
    MULTI_MODE("2", new MultiButtonTest()), SETTING_MODE("3", new SettingButtonTest()),
    HONOR_MODE("4", new HonorButtonTest()), EXIT_MODE("5", new ExitButtonTest());
    private String name;
    private ActionListenerTest modeTest;

    private ModeSettingTest(String name, ActionListenerTest modeTest) {
        this.name = name;
        this.modeTest = modeTest;
    }

    public ActionListenerTest mode(String name) {
        return Arrays.stream(ModeSettingTest.values())
        .filter(item -> item.name.equals(name))
        .findFirst()
        .get()
        .getModeTest();
    }

    private ActionListenerTest getModeTest() {
        return this.modeTest;
    }
}
