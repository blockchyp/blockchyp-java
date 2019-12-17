package com.blockchyp.client;

/**
 * This class models the raw parameters of an elliptic curve public key.  This is provided for 
 * situations where Base58 encoding is unavailable or difficult to work with.
 * 
 */
public class RawPublicKey {
    
    private String curve;
    private String x;
    private String y;
    
    /**
     * Returns the name of the standard curve.  This is almost always 'P256'.
     * @return name of the standard curve.
     */
    public String getCurve() {
        return curve;
    }
    /**
     * Sets the name of the standard curve.
     * @param curve name of the standard curve.
     */
    public void setCurve(String curve) {
        this.curve = curve;
    }
    
    /**
     * Returns the X coordinate as hex.
     * @return the X coordinate.
     */
    public String getX() {
        return x;
    }
    /**
     * Sets the X coordinate in hex.
     * @param x the X coordinate.
     */
    public void setX(String x) {
        this.x = x;
    }
    /**
     * Returns the Y coordinate as hex.
     * @return the Y coordinate.
     */
    public String getY() {
        return y;
    }
    /**
     * Sets the Y coordinate in hex.
     * @param y the Y coordinate.
     */
    public void setY(String y) {
        this.y = y;
    }
    
    
    

}
