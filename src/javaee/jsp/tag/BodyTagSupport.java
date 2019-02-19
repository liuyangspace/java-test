package javaee.jsp.tag;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspWriter;
import javax.servlet.jsp.tagext.BodyContent;
import javax.servlet.jsp.tagext.BodyTag;

public class BodyTagSupport extends javax.servlet.jsp.tagext.BodyTagSupport implements BodyTag {

    public BodyTagSupport(){super();}
    @Override public int doStartTag() throws JspException { return super.doStartTag(); }
    @Override public int doEndTag() throws JspException { return super.doEndTag(); }
    @Override public void setBodyContent(BodyContent b) { super.setBodyContent(b); }
    @Override public void doInitBody() throws JspException { super.doInitBody(); }
    @Override public int doAfterBody() throws JspException { return super.doAfterBody(); }
    @Override public void release(){ super.release(); }
    public BodyContent getBodyContent(){ return super.getBodyContent(); }
    public JspWriter getPreviousOut(){ return super.getPreviousOut(); }

}
