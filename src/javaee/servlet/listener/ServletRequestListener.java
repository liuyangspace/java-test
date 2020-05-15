package javaee.servlet.listener;

import javax.servlet.ServletRequestEvent;

/**
 * A ServletRequestListener can be implemented by the developer
 * interested in being notified of requests coming in and out of
 * scope in a web component-1. A request is defined as coming into
 * scope when it is about to enter the first servlet or filter
 * in each web application, as going out of scope when it exits
 * the last servlet or the first filter in the chain.
 *
 * @see javax.servlet.ServletRequestListener
 */
public interface ServletRequestListener extends javax.servlet.ServletRequestListener{
    /**
     * The request is about to go out of scope of the web application.
     * The default implementation is a NO-OP.
     * @param sre Information about the request
     */
    public default void requestDestroyed (ServletRequestEvent sre) {
    }

    /**
     * The request is about to come into scope of the web application.
     * The default implementation is a NO-OP.
     * @param sre Information about the request
     */
    public default void requestInitialized (ServletRequestEvent sre) {
    }
}
