package com.blockchyp.client.dto;

import com.google.gson.annotations.SerializedName;

public enum RoundingMode {

    UP("up"),
    NEAREST("nearest"),
    DOWN("down");

    private final String code;

    private RoundingMode(String code) {
        this.code = code;
    }

    // @JsonValue
    public String getCode() {
        return this.code;
    }

}
