package javaee.servlet.http.listener;

import javax.servlet.http.HttpSession;

/**
 * This is the class representing event notifications for changes to sessions
 * within a web application.
 *
 * @see javax.servlet.http.HttpSessionEvent
 */
public class HttpSessionEvent extends java.util.EventObject {
    private static final long serialVersionUID = 1L;

    /**
     * Construct a session event from the given source.
     *
     * @param source    The HTTP session where the change took place
     */
    public HttpSessionEvent(HttpSession source) {
        super(source);
    }

    /**
     * Get the session that changed.
     *
     * @return The session that changed
     */
    public HttpSession getSession() {
        return (HttpSession) super.getSource();
    }
}
