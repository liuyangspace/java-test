package javaee.jsp.tag;

import javax.servlet.jsp.JspException;

/**
 * @see javax.servlet.jsp.tagext.DynamicAttributes
 */
public interface DynamicAttributes extends javax.servlet.jsp.tagext.DynamicAttributes{

    public void setDynamicAttribute(String uri, String localName, Object value ) throws JspException;

}
