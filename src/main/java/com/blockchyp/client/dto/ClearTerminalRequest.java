package com.blockchyp.client.dto;

/**
 * Used to reset a terminal.  Clears transactions in progress and line item display, returning
 * the terminal to the idle state.
 * 
 */
public class ClearTerminalRequest extends CoreRequest implements ITerminalReference {

    private String terminalName;

    /**
     * Returns the name of the target payment terminal.
     * @return payment terminal name.
     */
    public String getTerminalName() {
        return terminalName;
    }

    /**
     * Sets the target payment terminal.
     * @param terminalName payment terminal name.
     */
    public void setTerminalName(String terminalName) {
        this.terminalName = terminalName;
    }

}
