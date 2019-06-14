package com.blockchyp.client.dto;

/**
 * This class models the raw parameters of an elliptic curve signature.  This is provided for 
 * situations where encoding abstractions are difficult to work with, which in Java is always.
 * 
 */
public class RawSignature {
    
    private String curve;
    private String r;
    private String s;
    
    /**
     * Returns the name of the standard curve.  This is almost always 'P256'.
     * @return - name of the standard curve.
     */
    public String getCurve() {
        return curve;
    }
    /**
     * Sets the name of the standard curve.
     * @param curve - name of the standard curve.
     */
    public void setCurve(String curve) {
        this.curve = curve;
    }
    /**
     * Returns the signature's 'R' parameter as hex.
     * @return - the R parameter
     */
    public String getR() {
        return r;
    }
    /**
     * Sets the signature's 'R' parameter as hex. 
     * @param r - the R parameter.
     */
    public void setR(String r) {
        this.r = r;
    }
    /**
     * Returns the signature's 'S' parameter as hex.
     * @return - the S parameter
     */
    public String getS() {
        return s;
    }
    /**
     * Sets the signature's 'S' parameter as hex. 
     * @param s - the S parameter.
     */
    public void setS(String s) {
        this.s = s;
    }
    
    

}
