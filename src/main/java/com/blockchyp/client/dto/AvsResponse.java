package com.blockchyp.client.dto;

import com.google.gson.annotations.SerializedName;

public enum AvsResponse {

    NOT_APPLICABLE(""),
    NOT_SUPPORTED("not_supported"),
    RETRY("retry"),
    NO_MATCH("no_match"),
    ADDRESS_MATCH("address_match"),
    POSTAL_CODE_MATCH("zip_match"),
    ADDRESS_AND_POSTAL_CODE_MATCH("match");

    private final String code;

    private AvsResponse(String code) {
        this.code = code;
    }

    // @JsonValue
    public String getCode() {
        return this.code;
    }

    @Override
    public String toString() {
        return code;
    }

}
