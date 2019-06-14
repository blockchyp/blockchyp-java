package com.blockchyp.client;

/**
 * Very minimal implementation of PaymentLogger. We recommend you provide your
 * own implementation that hooks into your existing logging framework.
 * 
 */

public class SystemOutPaymentLogger implements PaymentLogger {

    @Override
    public void debug(Object message) {

        System.out.println(message);

    }

    @Override
    public void debug(Object message, Throwable t) {

        System.out.println(message);
        t.printStackTrace(System.out);

    }

    @Override
    public void error(Object message) {

        System.out.println(message);

    }

    @Override
    public void error(Object message, Throwable t) {

        System.out.println(message);
        t.printStackTrace(System.out);

    }

    @Override
    public void fatal(Object message) {

        System.out.println(message);

    }

    @Override
    public void fatal(Object message, Throwable t) {

        System.out.println(message);
        t.printStackTrace(System.out);

    }

    @Override
    public void info(Object message) {

        System.out.println(message);

    }

    @Override
    public void info(Object message, Throwable t) {

        System.out.println(message);
        t.printStackTrace(System.out);

    }

}
