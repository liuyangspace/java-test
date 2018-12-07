package javaee.servlet.http.listener;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;
import javax.servlet.http.HttpSessionEvent;

/**
 * Implementations of this interface are notified when an {@link HttpSession}'s
 * ID changes. To receive notification events, the implementation class must be
 * configured in the deployment descriptor for the web application, annotated
 * with {@link javax.servlet.annotation.WebListener} or registered by calling an
 * addListener method on the {@link javax.servlet.ServletContext}.
 *
 * @see javax.servlet.http.HttpSessionIdListener
 * @see HttpSessionEvent
 * @see HttpServletRequest#changeSessionId()
 */
public interface HttpSessionIdListener extends javax.servlet.http.HttpSessionIdListener{
    /**
     * Notification that a session ID has been changed.
     *
     * @param se the notification event
     * @param oldSessionId the old session ID
     */
    public void sessionIdChanged(HttpSessionEvent se, String oldSessionId);
}
