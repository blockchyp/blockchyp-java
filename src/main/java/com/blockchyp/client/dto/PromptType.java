package com.blockchyp.client.dto;

import com.fasterxml.jackson.annotation.JsonValue;

public enum PromptType {

    AMOUNT("amount"),
    EMAIL("email"),
    PHONE_NUMBER("phone"),
    CUSTOMER_NUMBER("customer-number"),
    REWARDS_NUMBER("rewards-number");

    private final String code;

    private PromptType(String code) {
        this.code = code;
    }

    @JsonValue
    public String getCode() {
        return this.code;
    }

}
