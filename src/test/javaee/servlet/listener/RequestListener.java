package test.javaee.servlet.listener;

import javax.servlet.ServletRequestEvent;

public class RequestListener implements javax.servlet.ServletRequestListener {
    /**
     * The request is about to go out of scope of the web application.
     * The default implementation is a NO-OP.
     * @param sre Information about the request
     */
    public void requestDestroyed (ServletRequestEvent sre) {
        System.out.println("requestDestroyed");
    }

    /**
     * The request is about to come into scope of the web application.
     * The default implementation is a NO-OP.
     * @param sre Information about the request
     */
    public void requestInitialized (ServletRequestEvent sre) {
        System.out.println("requestInitialized");
    }
}
