package com.blockchyp.client;

/**
 * This is a simple logging abstraction following the conventions from Jakarta commons-logging.
 * We don't want to make any assumptions about what logging framework you're using or cause 
 * classpath problems.  You can inject an implementation of this interface for whatever logging
 * framework you like best. By default, we'll just dump everything to stdout.
 * 
 * @author jeffreydpayne
 *
 */

public interface PaymentLogger {
	
	void debug(Object message);
	void debug(Object message, Throwable t);
	void error(Object message);
	void error(Object message, Throwable t);
	void fatal(Object message);
	void fatal(Object message, Throwable t);
	void info(Object message);
	void info(Object message, Throwable t);
	
}
