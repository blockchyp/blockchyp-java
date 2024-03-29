package com.blockchyp.client.dto;

import com.fasterxml.jackson.annotation.JsonValue;

public enum HealthcareType {

    HEALTHCARE("healthcare"),
    PRESCRIPTION("prescription"),
    VISION("vision"),
    CLINIC("clinic"),
    DENTAL("dental");

    private final String code;

    private HealthcareType(String code) {
        this.code = code;
    }

    @JsonValue
    public String getCode() {
        return this.code;
    }

}
