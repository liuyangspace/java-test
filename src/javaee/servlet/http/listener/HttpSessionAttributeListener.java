package javaee.servlet.http.listener;

import javax.servlet.http.HttpSessionBindingEvent;
import java.util.EventListener;

/**
 * 监听 Session 属性变化
 * This listener interface can be implemented in order to get notifications of
 * changes to the attribute lists of sessions within this web application.
 *
 * @see javax.servlet.http.HttpSessionAttributeListener
 */
public interface HttpSessionAttributeListener extends javax.servlet.http.HttpSessionAttributeListener,EventListener {
    /**
     * Notification that an attribute has been added to a session. Called after
     * the attribute is added.
     * The default implementation is a NO-OP.
     *
     * @param se Information about the added attribute
     */
    public default void attributeAdded(HttpSessionBindingEvent se) {
    }

    /**
     * Notification that an attribute has been removed from a session. Called
     * after the attribute is removed.
     * The default implementation is a NO-OP.
     *
     * @param se Information about the removed attribute
     */
    public default void attributeRemoved(HttpSessionBindingEvent se) {
    }

    /**
     * Notification that an attribute has been replaced in a session. Called
     * after the attribute is replaced.
     * The default implementation is a NO-OP.
     *
     * @param se Information about the replaced attribute
     */
    public default void attributeReplaced(HttpSessionBindingEvent se) {
    }
}
