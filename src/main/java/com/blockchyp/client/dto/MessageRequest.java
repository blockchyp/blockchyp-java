package com.blockchyp.client.dto;

/**
 * Models the settings needed to display a message on the screen.
 * 
 * @author jeffreydpayne
 */
public class MessageRequest extends CoreRequest implements ITerminalReference {

    private String terminalName;
    private String message;

    /**
     * Returns the target terminal name.
     * @return - terminal name.
     */
    public String getTerminalName() {
        return terminalName;
    }

    /**
     * Sets the target terminal name.
     * @param terminalName - terminal name.
     */
    public void setTerminalName(String terminalName) {
        this.terminalName = terminalName;
    }

    /**
     * Returns the message to be displayed on the terminal.
     * @return - message to be displayed on the terminal.
     */
    public String getMessage() {
        return message;
    }

    /**
     * Sets the message to be displayed on the terminal.
     * @param message - message to be displayed on the terminal.
     */
    public void setMessage(String message) {
        this.message = message;
    }

}
