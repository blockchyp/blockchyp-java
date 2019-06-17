package com.blockchyp.client.dto;

/**
 * Models the information needed to call the text prompt API.
 * 
 */
public class TextPromptRequest extends CoreRequest implements ITerminalReference {

    private String terminalName;
    private String promptType;

    /**
     * Returns the target terminal name.
     * @return terminal name.
     */
    public String getTerminalName() {
        return terminalName;
    }

    /**
     * Sets the target terminal name.
     * @param terminalName terminal name.
     */
    public void setTerminalName(String terminalName) {
        this.terminalName = terminalName;
    }

    /**
     * Gets the prompt type.
     * @return prompt type.
     */
    public String getPromptType() {
        return promptType;
    }

    /**
     * Sets the type of prompt.  (e.g "email", "phone", etc.)
     * @param promptType prompt type.
     */
    public void setPromptType(String promptType) {
        this.promptType = promptType;
    }

}
