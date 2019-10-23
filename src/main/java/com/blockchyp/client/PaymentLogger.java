package com.blockchyp.client;

/**
 * This is a simple logging abstraction following the conventions from Jakarta
 * commons-logging. We don't want to make any assumptions about what logging
 * framework you're using or cause classpath problems. You can inject an
 * implementation of this interface for whatever logging framework you like
 * best. By default, we'll just dump everything to stdout.
 * 
 */

public interface PaymentLogger {

    /**
     * Logs the message at the debug log level.
     * @param message the message to be logged.
     */
    void debug(Object message);

    /**
     * Logs the message and throwable at the debug log level.
     * @param message the message to be logged.
     * @param t a throwable for which the stack trace should be logged.
     */
    void debug(Object message, Throwable t);

    /**
     * Logs the message at the error log level.
     * @param message the message to be logged.
     */
    void error(Object message);

    /**
     * Logs the message and throwable at the error log level.
     * @param message the message to be logged.
     * @param t a throwable for which the stack trace should be logged.
     */
    void error(Object message, Throwable t);

    /**
     * Logs the message at the fatal log level.
     * @param message the message to be logged.
     */
    void fatal(Object message);

    /**
     * Logs the message and throwable at the fatal log level.
     * @param message the message to be logged.
     * @param t a throwable for which the stack trace should be logged.
     */
    void fatal(Object message, Throwable t);

    /**
     * Logs the message at the info log level.
     * @param message the message to be logged.
     */
    void info(Object message);
    
    
    /**
     * Logs the message and throwable at the info log level.
     * @param message the message to be logged.
     * @param t a throwable for which the stack trace should be logged.
     */
    void info(Object message, Throwable t);

}
