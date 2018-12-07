package javaee.servlet.http;

import javax.servlet.ServletContext;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSessionContext;
import java.util.Enumeration;

/**
 * Provides a way to identify a user across more than one page request or visit
 * to a Web site and to store information about that user.
 *
 * @see javax.servlet.http.HttpServletRequest#getSession()
 * @see javax.servlet.http.HttpSession
 * @see javax.servlet.http.HttpSessionBindingListener
 * @see javax.servlet.http.HttpSessionActivationListener
 */
public interface HttpSession extends javax.servlet.http.HttpSession{

    public Object getAttribute(String name);
    @Deprecated public Object getValue(String name);
    public Enumeration<String> getAttributeNames();
    @Deprecated public String[] getValueNames();
    public void setAttribute(String name, Object value);
    @Deprecated public void putValue(String name, Object value);
    public void removeAttribute(String name);
    @Deprecated public void removeValue(String name);

    public String getId();
    public long getCreationTime();
    public long getLastAccessedTime();

    public void setMaxInactiveInterval(int interval);
    public int getMaxInactiveInterval();

    public ServletContext getServletContext();
    @Deprecated public HttpSessionContext getSessionContext();

    public void invalidate();
    public boolean isNew();
}
