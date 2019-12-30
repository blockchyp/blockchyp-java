package com.blockchyp.client;

public enum SignatureFormat {

    NONE(""),
    PNG("png"),
    JPG("jpg"),
    GIF("gif");

    private final String code;

    private SignatureFormat(String code) {
        this.code = code;
    }

    public String getCode() {
        return this.code;
    }

}
