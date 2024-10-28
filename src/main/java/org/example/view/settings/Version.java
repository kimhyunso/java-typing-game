package org.example.view.settings;

public enum Version {
    VERSION("0.0.1");
    private String name;

    private Version(String name) {
        this.name = name;
    }

    public String value() {
        return this.name;
    }
}
