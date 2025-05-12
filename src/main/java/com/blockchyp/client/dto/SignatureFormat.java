package com.blockchyp.client.dto;

import com.google.gson.annotations.SerializedName;

public enum SignatureFormat {

    NONE(""),
    PNG("png"),
    JPG("jpg"),
    GIF("gif");

    private final String code;

    private SignatureFormat(String code) {
        this.code = code;
    }

    // @JsonValue
    public String getCode() {
        return this.code;
    }

}
