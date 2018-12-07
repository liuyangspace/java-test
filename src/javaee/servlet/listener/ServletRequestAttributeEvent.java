package javaee.servlet.listener;

import javax.servlet.ServletContext;
import javax.servlet.ServletRequest;

/**
 * This is the event class for notifications of changes to the attributes of the
 * servlet request in an application.
 *
 * @see javax.servlet.ServletRequestAttributeEvent
 */
public class ServletRequestAttributeEvent extends javax.servlet.ServletRequestAttributeEvent{

    public ServletRequestAttributeEvent(ServletContext sc, ServletRequest request, String name, Object value) { super(sc, request,name,value);}

    /**
     * Return the name of the attribute that changed on the ServletRequest.
     *
     * @return the name of the changed request attribute
     */
    public String getName() {
        return super.getName();
    }

    /**
     * Returns the value of the attribute that has been added, removed or
     * replaced. If the attribute was added, this is the value of the attribute.
     * If the attribute was removed, this is the value of the removed attribute.
     * If the attribute was replaced, this is the old value of the attribute.
     *
     * @return the value of the changed request attribute
     */
    public Object getValue() {
        return super.getValue();
    }

}
