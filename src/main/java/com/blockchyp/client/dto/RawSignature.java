package com.blockchyp.client.dto;

public class RawSignature {
    
    private String curve;
    private String r;
    private String s;
    public String getCurve() {
        return curve;
    }
    public void setCurve(String curve) {
        this.curve = curve;
    }
    public String getR() {
        return r;
    }
    public void setR(String r) {
        this.r = r;
    }
    public String getS() {
        return s;
    }
    public void setS(String s) {
        this.s = s;
    }
    
    

}
