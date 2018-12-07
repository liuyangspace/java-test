package javaee.servlet.http.listener;

import javax.servlet.http.HttpSession;
import javax.servlet.http.HttpSessionAttributeListener;
import javax.servlet.http.HttpSessionBindingListener;
import javax.servlet.http.HttpSessionEvent;

/**
 * Events of this type are either sent to an object that implements
 * {@link javax.servlet.http.HttpSessionBindingListener} when it is bound or unbound from a
 * session, or to a {@link javax.servlet.http.HttpSessionAttributeListener} that has been
 * configured in the deployment descriptor when any attribute is bound, unbound
 * or replaced in a session.
 * <p>
 * The session binds the object by a call to
 * <code>HttpSession.setAttribute</code> and unbinds the object by a call to
 * <code>HttpSession.removeAttribute</code>.
 *
 * @see HttpSession
 * @see HttpSessionBindingListener
 * @see HttpSessionAttributeListener
 * @see javax.servlet.http.HttpSessionBindingEvent
 */
public class HttpSessionBindingEvent extends HttpSessionEvent {

    private static final long serialVersionUID = 1L;
    /* The name to which the object is being bound or unbound */
    private final String name;
    /* The object is being bound or unbound */
    private final Object value;

    public HttpSessionBindingEvent(HttpSession session, String name) {
        super(session);
        this.name = name;
        this.value = null;
    }

    public HttpSessionBindingEvent(HttpSession session, String name, Object value) {
        super(session);
        this.name = name;
        this.value = value;
    }

    public HttpSession getSession() { return super.getSession(); }
    public String getName() { return name; }
    public Object getValue() { return this.value; }
}
