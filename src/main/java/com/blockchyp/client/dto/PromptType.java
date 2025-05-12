package com.blockchyp.client.dto;

import com.google.gson.annotations.SerializedName;

public enum PromptType {

    AMOUNT("amount"),
    EMAIL("email"),
    PHONE_NUMBER("phone"),
    CUSTOMER_NUMBER("customer-number"),
    REWARDS_NUMBER("rewards-number"),
    FIRST_NAME("first-name"),
    LAST_NAME("last-name");

    private final String code;

    private PromptType(String code) {
        this.code = code;
    }

//    // @JsonValue
    public String getCode() {
        return this.code;
    }

}
