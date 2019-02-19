package javaee.jsp.tag;

import javax.servlet.jsp.JspContext;
import javax.servlet.jsp.JspException;
import java.io.IOException;
import java.io.Writer;

/**
 * @see javax.servlet.jsp.tagext.JspFragment
 */
public abstract class JspFragment extends javax.servlet.jsp.tagext.JspFragment{

    public abstract void invoke( Writer out ) throws JspException, IOException;
    public abstract JspContext getJspContext();

}
