package com.github.novicezk.midjourney.enums;

public enum PanWhich {
    PAN_LEFT("pan_left"),

    PAN_RIGHT("pan_right"),
    PAN_UP("pan_up"),

    PAN_DOWN("pan_down");

    private final String value;

    PanWhich(String value) {
        this.value = value;
    }

    public String getValue() {
        return this.value;
    }
}
