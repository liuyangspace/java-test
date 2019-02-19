package javaee.jsp.tag;

import javax.servlet.jsp.JspContext;
import javax.servlet.jsp.JspException;
import javax.servlet.jsp.tagext.JspFragment;
import javax.servlet.jsp.tagext.JspTag;
import javax.servlet.jsp.tagext.SimpleTag;
import java.io.IOException;

/**
 * @see javax.servlet.jsp.tagext.SimpleTagSupport
 */
public class SimpleTagSupport extends javax.servlet.jsp.tagext.SimpleTagSupport implements SimpleTag {

    public SimpleTagSupport() { /* NOOP by default */ }
    @Override public void doTag() throws JspException, IOException { /* NOOP by default */ }
    @Override public void setParent( JspTag parent ) { super.setParent(parent); }
    @Override public JspTag getParent() { return super.getParent(); }
    @Override public void setJspContext( JspContext pc ) { super.setJspContext(pc); }
    protected JspContext getJspContext(){ return super.getJspContext(); }
    @Override public void setJspBody( JspFragment jspBody ){ super.setJspBody(jspBody); }
    protected JspFragment getJspBody(){ return super.getJspBody(); }

    // public static final JspTag findAncestorWithClass( JspTag from, Class<?> klass )

}
