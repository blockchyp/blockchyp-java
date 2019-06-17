package com.blockchyp.client.dto;

/**
 * This class models a request to update the transaction line item display on the terminal.
 * 
 */
public class TransactionDisplayRequest extends CoreRequest implements ITerminalReference {

    private String terminalName;
    private TransactionDisplayTransaction transaction;
    
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
     * Returns the transaction to be displayed on the terminal.
     * @return {@link TransactionDisplayTransaction}
     */
    public TransactionDisplayTransaction getTransaction() {
        return transaction;
    }

    /**
     * Sets the transaction to be displayed on the terminal.
     * @param transaction {@link TransactionDisplayTransaction}
     */
    public void setTransaction(TransactionDisplayTransaction transaction) {
        this.transaction = transaction;
    }

}
