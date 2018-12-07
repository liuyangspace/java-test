package javaee.servlet.listener;

import javax.servlet.ServletContext;
import javax.servlet.ServletRequest;

/**
 * Events of this kind indicate lifecycle events for a ServletRequest. The
 * source of the event is the ServletContext of this web application.
 *
 * @see javax.servlet.ServletRequestEvent
 */
public class ServletRequestEvent extends javax.servlet.ServletRequestEvent{

    public ServletRequestEvent(ServletContext sc, ServletRequest request) { super(sc,request); }

    /**
     * Get the associated ServletRequest.
     * @return the ServletRequest that is changing.
     */
    public ServletRequest getServletRequest() {
        return super.getServletRequest();
    }

    /**
     * Get the associated ServletContext.
     * @return the ServletContext that is changing.
     */
    public ServletContext getServletContext() {
        return (ServletContext) super.getSource();
    }

}
