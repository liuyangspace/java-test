package javaee.servlet.http.listener;

import javax.servlet.http.HttpSessionEvent;
import java.util.EventListener;

/**
 * 监听 Session 序列化/反序列化
 * Tomcat 中无须配置也可被识别加载
 * Objects that are bound to a session may listen to container events notifying
 * them that sessions will be passivated and that session will be activated. A
 * container that migrates session between VMs or persists sessions is required
 * to notify all attributes bound to sessions implementing
 * HttpSessionActivationListener.
 *
 * @see javax.servlet.http.HttpSessionActivationListener
 */
public interface HttpSessionActivationListener extends javax.servlet.http.HttpSessionActivationListener,EventListener {
    /**
     * Notification that the session is about to be passivated.
     * The default implementation is a NO-OP.
     *
     * @param se Information about the session this is about to be passivated
     */
    public default void sessionWillPassivate(HttpSessionEvent se) {
    }

    /**
     * Notification that the session has just been activated.
     * The default implementation is a NO-OP.
     *
     * @param se Information about the session this has just been activated
     */
    public default void sessionDidActivate(HttpSessionEvent se) {
    }
}
