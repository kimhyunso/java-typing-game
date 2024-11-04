package org.example.model.image;

public enum Status {
    ATTACK("attack"),
    MOVE("walk"),
    RUN("run"),
    IDLE("idle");
    private final String status;

    private Status(String status) {
        this.status = status;
    }

    public String status() {
        return status;
    }
}
