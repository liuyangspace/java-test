package javaee.servlet.http.listener;

import javax.servlet.http.HttpSessionEvent;
import java.util.EventListener;

/**
 * 监听 Session 创建
 * Implementations of this interface are notified of changes to the list of
 * active sessions in a web application. To receive notification events, the
 * implementation class must be configured in the deployment descriptor for the
 * web application.
 *
 * @see javax.servlet.http.HttpSessionListener
 */
public interface HttpSessionListener extends javax.servlet.http.HttpSessionListener,EventListener {

    /**
     * Notification that a session was created.
     * The default implementation is a NO-OP.
     *
     * @param se
     *            the notification event
     */
    public default void sessionCreated(HttpSessionEvent se) {
    }

    /**
     * Notification that a session is about to be invalidated.
     * The default implementation is a NO-OP.
     *
     * @param se
     *            the notification event
     */
    public default void sessionDestroyed(HttpSessionEvent se) {
    }
}
