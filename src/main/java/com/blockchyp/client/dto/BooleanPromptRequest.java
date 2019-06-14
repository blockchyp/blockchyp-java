package com.blockchyp.client.dto;

/**
 * Models information needed for boolean prompt support.
 */
public class BooleanPromptRequest extends CoreRequest implements ITerminalReference {

    private String terminalName;
    private String prompt;
    private String yesCaption;
    private String noCaption;


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

    /**
     * Returns the text to be displayed on the terminal.
     * @return - text to be displayed as the terminal prompt.
     */
    public String getPrompt() {
        return prompt;
    }

    /**
     * Sets the text to be displayed on the terminal.  Typically a yes or no question.
     * @param prompt - text to be displayed as the terminal prompt.
     */
    public void setPrompt(String prompt) {
        this.prompt = prompt;
    }

    
    /**
     * Gets the preferred caption for the 'yes' button.
     * @return - caption for the 'yes' button.
     */
    public String getYesCaption() {
        return yesCaption;
    }

    /**
     * Sets the preferred caption for the 'yes' button.  Defaults to 'YES'.
     * @param yesCaption - caption for the 'yes' button.
     */
    public void setYesCaption(String yesCaption) {
        this.yesCaption = yesCaption;
    }

    /**
     * Gets the preferred caption for the 'no' button.
     * @return - caption for the no button.
     */
    public String getNoCaption() {
        return noCaption;
    }

    /**
     * Sets the preferred caption for the 'no' button.  Defaults to 'NO'.
     * @param noCaption - caption for the 'no' button.
     */
    public void setNoCaption(String noCaption) {
        this.noCaption = noCaption;
    }

}
