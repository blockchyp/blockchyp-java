package com.blockchyp.client.dto;

import com.fasterxml.jackson.annotation.JsonValue;

/**
 * CardType is used to differentiate between different card types.
 *
 */
public enum CardType {
    /**
     * A standard credit card.
     */
    CREDIT,

    /**
     * A debit card.
     */
    DEBIT,

    /**
     * An EBT card.
     */
    EBT,

    /**
     * A blockchain-based gift card.
     */
    BLOCKCHAIN_GIFT;

    /**
     * Convert the enum to a number for JSON serialization.
     * @return the enum as a number.
     */
    @JsonValue
    public int toValue() {
        return ordinal();
    }
}
