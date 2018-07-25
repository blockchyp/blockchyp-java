package com.blockchyp.client.dto;

import java.util.Date;

public class HeartbeatResponse extends Acknowledgement {
    
    private Date timestamp;
    private String latestTick;
    private String merchantPk;
    public Date getTimestamp() {
        return timestamp;
    }
    public void setTimestamp(Date timestamp) {
        this.timestamp = timestamp;
    }
    public String getLatestTick() {
        return latestTick;
    }
    public void setLatestTick(String latestTick) {
        this.latestTick = latestTick;
    }
    public String getMerchantPk() {
        return merchantPk;
    }
    public void setMerchantPk(String merchantPk) {
        this.merchantPk = merchantPk;
    }
    
    
    

}
