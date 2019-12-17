package com.blockchyp.client;

public enum CardType {

    CREDIT(0),  
    DEBIT(1),  
    EBT(2),
    BLOCKCHAIN_GIFT(3);


    private final int code;

    private CardType(int code) {
        this.code = code;
    }
    
    public int getCode() {
        return this.code;
    }
    
}
