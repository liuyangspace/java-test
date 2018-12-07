package javaee.servlet.http;

import javax.servlet.http.HttpSession;
import javax.servlet.http.HttpSessionBindingEvent;
import javax.servlet.http.HttpSessionBindingListener;
import java.util.Enumeration;

/**
 * @see HttpSession
 * @see HttpSessionBindingEvent
 * @see HttpSessionBindingListener
 * @see javax.servlet.http.HttpSessionContext
 */
@Deprecated
public interface HttpSessionContext extends javax.servlet.http.HttpSessionContext{

    @Deprecated public HttpSession getSession(String sessionId);
    @Deprecated public Enumeration<String> getIds();

}
