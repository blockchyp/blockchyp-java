package com.blockchyp.client.dto;

import com.fasterxml.jackson.annotation.JsonIgnore;

/**
 * Models requests that include payment method information.
 * 
 * We recommend that you never use PAN and track data as this would put you in
 * PCI scope.
 * 
 */

public class PaymentRequest extends AmountRequest implements ITerminalReference {

    private String terminalName;
    private String token;
    private String track1;
    private String track2;
    private String pan;
    private String routingNumber;
    private String cardholderName;
    private String expMonth;
    private String expYear;
    private String cvv;
    private String address;
    private String postalCode;
    private boolean manualEntry;
    private boolean cashBackEnabled;
    private String sigFormat;
    private int sigWidth;
    private String sigFile; // local SDK only

    /**
     * Sets the target terminal name to which the transaction will be routed.
     * @return terminal name assigned to the terminal upon activation.
     */
    public String getTerminalName() {
        return terminalName;
    }

    /**
     * Sets the target terminal name to which the transaction will be routed.
     * @param terminalName terminal name assigned to the terminal upon activation.
     */
    public void setTerminalName(String terminalName) {
        this.terminalName = terminalName;
    }

    /**
     * Gets the payment token to be used with this transaction.
     * @return recurring payment token.
     */
    public String getToken() {
        return token;
    }

    /**
     * Sets the payment token to be used with this transaction.  Recommended for recurring payment transactions.
     * @param token recurring payment token.
     */
    public void setToken(String token) {
        this.token = token;
    }

    /**
     * Gets track 1 data.
     * @return the first track of a payment card's magnetic stripe.
     */
    public String getTrack1() {
        return track1;
    }

    /**
     * Sets track 1 data.  This is only provided as a fall back for developers who have to integrate legacy MSR support.
     * @param track1 the first track of a payment card's magnetic stripe.
     */
    public void setTrack1(String track1) {
        this.track1 = track1;
    }

    /**
     * Gets track 2 data.
     * @return the second track of a payment card's magnetic stripe.
     */
    public String getTrack2() {
        return track2;
    }

    /**
     * Sets track 2 data.  This is only provided as a fall back for developers who have to integrate legacy MSR support.
     * @param track2 the second track of a payment card's magnetic stripe.
     */
    public void setTrack2(String track2) {
        this.track2 = track2;
    }
    
    /**
     * Gets the primary account number (PAN).
     * @return Primary Account Number.
     */
    public String getPan() {
        return pan;
    }

    /**
     * Sets the primary account number (PAN).  We recommend using the terminal or e-commerce tokenization libraries instead of passing
     * account numbers in directly as it will put your application in PCI scope.
     * @param pan Primary Account Number.
     */
    public void setPan(String pan) {
        this.pan = pan;
    }

    /**
     * Sets the ACH routing number if this is an ACH transaction.
     * @return nine digit ACH routing number
     */
    public String getRoutingNumber() {
        return routingNumber;
    }

    /**
     * Sets the ACH routing number if this is an ACH transaction.
     * @param routingNumber nine digit ACH routing number.
     */
    public void setRoutingNumber(String routingNumber) {
        this.routingNumber = routingNumber;
    }
    
    /**
     * Gets the cardholder name for use with PAN based transaction authorization.  
     * @return cardholder's name.
     */

    public String getCardholderName() {
        return cardholderName;
    }

    /**
     * Sets the cardholder name for use with PAN based transaction authorization.  Only needed if you're sending a PAN or track data, which 
     * you really shouldn't do because it will put you in PCI scope.
     * @param cardholderName cardholder's name.
     */
    public void setCardholderName(String cardholderName) {
        this.cardholderName = cardholderName;
    }
    
    /**
     * Gets the card expiration month for use with PAN based transaction authorization.
     * @return card expiration month. 
     */
    public String getExpMonth() {
        return expMonth;
    }

    /**
     * Sets the card expiration month for use with PAN based transaction authorization.  
     * Only needed if you're sending a PAN or track data, which 
     * you really shouldn't do because it will put you in PCI scope.
     * @param expMonth card expiration month.  Leading zeros preferred for january through september.
     */
    public void setExpMonth(String expMonth) {
        this.expMonth = expMonth;
    }
    
    /**
     * Gets the card expiration year for use with PAN based transaction authorization.
     * @return card expiration year.  
     */
    public String getExpYear() {
        return expYear;
    }

    /**
     * Sets the card expiration year for use with PAN based transaction authorization.  
     * Only needed if you're sending a PAN or track data, which 
     * you really shouldn't do because it will put you in PCI scope.
     * 
     * @param expYear card expiration year.  2 or 4 digit values accepted, but 4 is recommended.
     */
    public void setExpYear(String expYear) {
        this.expYear = expYear;
    }

    /**
     * Gets the CVV for use with PAN based transaction authorization.
     * 
     * @return cardholder verification code.
     */
    public String getCvv() {
        return cvv;
    }

    /**
     * Sets the CVV for use with PAN based transaction authorization.  Only needed if you're sending a PAN or track data, which 
     * you really shouldn't do because it will put you in PCI scope.
     * 
     * @param cvv cardholder verification code.
     */
    public void setCvv(String cvv) {
        this.cvv = cvv;
    }
    
    
    /**
     * Gets the address for use with address verification.
     * @return cardholder's street address.
     */
    public String getAddress() {
        return address;
    }

    /**
     * Sets the address for use with address verification.  Only needed if you're sending a PAN or track data, which 
     * you really shouldn't do because it will put you in PCI scope.
     * 
     * @param address cardholder's street address.
     */
    public void setAddress(String address) {
        this.address = address;
    }

    /**
     * Gets the postal code for use with address verification. 
     * @return cardholder's postal code.
     */
    public String getPostalCode() {
        return postalCode;
    }

    /**
     * Sets the postal code for use with address verification.  Only needed if you're sending a PAN or track data, which 
     * you really shouldn't do because it will put you in PCI scope.
     * 
     * @param postalCode cardholder's postal code.
     */
    public void setPostalCode(String postalCode) {
        this.postalCode = postalCode;
    }

    /**
     * Gets manual entry mode.
     * @return true if manual entry mode is enabled.
     */
    public boolean isManualEntry() {
        return manualEntry;
    }

    /**
     * Sets manual entry mode.  If true, the terminal will prompt for manual PAN entry instead of the standard present card flow.
     * @param manualEntry boolean
     */
    public void setManualEntry(boolean manualEntry) {
        this.manualEntry = manualEntry;
    }

    /**
     * Gets whether or not cash back is enabled.
     * @return true if cash back is enabled.
     */
    public boolean isCashBackEnabled() {
        return cashBackEnabled;
    }

    /**
     * Sets whether or not cash back is enabled.
     * @param cashBackEnabled whether or not cash back is enabled.
     */
    public void setCashBackEnabled(boolean cashBackEnabled) {
        this.cashBackEnabled = cashBackEnabled;
    }
    
    /**
     * Gets the preferred output format for signature images.
     * @return signature file format (PNG, JPEG, etc)
     */
    public String getSigFormat() {
        return sigFormat;
    }

    /**
     * Sets the preferred output format for signature images.  As of this writing, PNG and JPEG are supported.  Case insensitive.
     * @param sigFormat signature file format (PNG, JPEG, etc)
     */
    public void setSigFormat(String sigFormat) {
        this.sigFormat = sigFormat;
    }

    /**
     * Gets the maximum width of the signature image in pixels.
     * @return max width of the image in pixels.
     */
    public int getSigWidth() {
        return sigWidth;
    }

    /**
     * Sets the maximum width of the signature image in pixels.  The aspect ratio of the original image will be preserved.
     * @param sigWidth max width of the image in pixels.
     */
    public void setSigWidth(int sigWidth) {
        this.sigWidth = sigWidth;
    }

    /**
     * Sets the desired output location of a signature image file, if there is one.
     * @return local file path
     */
    @JsonIgnore
    public String getSigFile() {
        return sigFile;
    }

    /**
     * Sets the desired output location of a signature image file, if there is one.
     * @param sigFile local file path
     */
    public void setSigFile(String sigFile) {
        this.sigFile = sigFile;
    }

}
