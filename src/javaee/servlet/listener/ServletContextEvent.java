package javaee.servlet.listener;

import javax.servlet.ServletContext;

public class ServletContextEvent extends javax.servlet.ServletContextEvent {

    /**
     * Construct a ServletContextEvent from the given context.
     *
     * @param source - the ServletContext that is sending the event.
     */
    public ServletContextEvent(ServletContext source) {
        super(source);
    }
}
