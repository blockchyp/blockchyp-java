package com.blockchyp.client.dto;

/**
 * Common abstraction for DTO's with terminal references.
 * @author jeffreydpayne
 *
 */
public interface ITerminalReference {

    /**
     * Returns the name of a payment terminal.
     * @return - payment terminal name.
     */
    String getTerminalName();

}
