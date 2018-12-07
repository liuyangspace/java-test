package javaee.servlet.listener;

import javax.servlet.ServletContext;

/**
 * @see javax.servlet.ServletContextEvent
 */
public class ServletContextEvent extends javax.servlet.ServletContextEvent {

    /**
     * Construct a ServletContextEvent from the given context.
     *
     * @param source
     *            - the ServletContext that is sending the event.
     */
    public ServletContextEvent(ServletContext source) {
        super(source);
    }

    /**
     * Return the ServletContext that changed.
     *
     * @return the ServletContext that sent the event.
     */
    public ServletContext getServletContext() {
        return (ServletContext) super.getSource();
    }

}
