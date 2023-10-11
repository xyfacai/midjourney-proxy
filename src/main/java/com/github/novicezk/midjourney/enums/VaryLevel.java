package com.github.novicezk.midjourney.enums;

public enum VaryLevel {

    HIGH("high_variation"),

    LOW("low_variation");

    private final String value;

    VaryLevel(String value) {
        this.value = value;
    }

    public String getValue() {
        return this.value;
    }
}
