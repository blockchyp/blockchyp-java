package com.blockchyp.client;

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

    public String getCode() {
        return this.code;
    }

}
