package javaee.jsp.tag;

import javax.servlet.jsp.JspContext;
import javax.servlet.jsp.tagext.JspFragment;
import javax.servlet.jsp.tagext.JspTag;

/**
 * Interface for defining Simple Tag Handlers.
 *
 * Lifecycle:
 *  1) A new tag handler instance is created each time by the container by calling the provided zero-args constructor.
 *      Unlike classic tag handlers, simple tag handlers are never cached and reused by the JSP container.
 *  2) The setJspContext() and setParent() methods are called by the container.  The setParent() method is only called
 *      if the element is nested within another tag invocation.
 *  3) The setters for each attribute defined for this tag are called by the container.
 *  4) If a body exists, the setJspBody() method is called by the container to set the body of this tag, as a JspFragment .
 *      If the action element is empty in the page, this method is not called at all.
 *  5) The doTag() method is called by the container.  All tag logic, iteration, body evaluations, etc. occur in this
 *       method.
 *  6) The doTag() method returns and all variables are synchronized.
 *
 * @see javax.servlet.jsp.tagext.SimpleTag
 */
public interface SimpleTag extends javax.servlet.jsp.tagext.SimpleTag {

    public void doTag() throws javax.servlet.jsp.JspException, java.io.IOException;
    public void setParent( JspTag parent );
    public JspTag getParent();
    public void setJspContext( JspContext pc );
    public void setJspBody( JspFragment jspBody );

}
