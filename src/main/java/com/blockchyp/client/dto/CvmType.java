package com.blockchyp.client.dto;

import com.fasterxml.jackson.annotation.JsonValue;

public enum CvmType {

    SIGNATURE("Signature"),
    OFFLINE_PIN("Offline PIN"),
    ONLINE_PIN("Online PIN"),
    CDCVM("CDCVM"),
    NO_CVM("No CVM"),

    private final String code;

    private CvmType(String code) {
        this.code = code;
    }

    @JsonValue
    public String getCode() {
        return this.code;
    }

}
