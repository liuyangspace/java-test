package javaee.servlet.http.listener;

import javax.servlet.http.HttpSessionBindingEvent;

/**
 * 监听 Session 对象绑定
 * Tomcat 中无须配置也可被识别加载
 * 常用于 被javaBean  ,当 javaBean 存放至session时 触发监听的事件
 * Causes an object to be notified when it is bound to or unbound from a
 * session. The object is notified by an {@link HttpSessionBindingEvent} object.
 * This may be as a result of a servlet programmer explicitly unbinding an
 * attribute from a session, due to a session being invalidated, or due to a
 * session timing out.
 *
 * @see javax.servlet.http.HttpSessionBindingListener
 */
public interface HttpSessionBindingListener extends javax.servlet.http.HttpSessionBindingListener{

    /**
     * Notifies the object that it is being bound to a session and identifies
     * the session.
     * The default implementation is a NO-OP.
     *
     * @param event
     *            the event that identifies the session
     * @see #valueUnbound
     */
    public default void valueBound(HttpSessionBindingEvent event) {
    }

    /**
     * Notifies the object that it is being unbound from a session and
     * identifies the session.
     * The default implementation is a NO-OP.
     *
     * @param event
     *            the event that identifies the session
     * @see #valueBound
     */
    public default void valueUnbound(HttpSessionBindingEvent event) {
    }
}
