package com.blockchyp.client.dto;

/**
 * Models a ping request to test connectivity with a terminal.
 * 
 */
public class PingRequest extends CoreRequest implements ITerminalReference {

    private String terminalName;


    /**
     * Returns the name of the target payment terminal.
     * @return - payment terminal name.
     */
    public String getTerminalName() {
        return terminalName;
    }

    /**
     * Sets the target payment terminal.
     * @param terminalName - payment terminal name.
     */
    public void setTerminalName(String terminalName) {
        this.terminalName = terminalName;
    }

}
