package com.blockchyp.client.dto;

import com.google.gson.annotations.SerializedName;

public enum CardType {

    CREDIT(0),
    DEBIT(1),
    EBT(2),
    BLOCKCHAIN_GIFT(3),
    HEALTHCARE(4);


    private final int code;

    private CardType(int code) {
        this.code = code;
    }
    
    // @JsonValue
    public int getCode() {
        return this.code;
    }
   
    
    
}
