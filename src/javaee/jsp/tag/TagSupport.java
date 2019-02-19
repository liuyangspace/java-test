package javaee.jsp.tag;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.PageContext;
import javax.servlet.jsp.tagext.IterationTag;
import javax.servlet.jsp.tagext.Tag;
import java.io.Serializable;
import java.util.Enumeration;

/**
 * @see javax.servlet.jsp.tagext.TagSupport
 */
public class TagSupport extends javax.servlet.jsp.tagext.TagSupport implements IterationTag, Serializable {

    public TagSupport() { /* NOOP by default */ }
    @Override public int doStartTag() throws JspException { return super.doStartTag(); }
    @Override public int doEndTag() throws JspException { return super.doEndTag(); }
    @Override public int doAfterBody() throws JspException { return super.doAfterBody(); }
    @Override public void release() { super.release(); }
    @Override public void setParent(Tag t) { super.setParent(t); }
    @Override public Tag getParent() { return super.getParent(); }
    public void setId(String id) { super.setId(id); }
    public String getId() { return super.getId(); }
    public void setPageContext(PageContext pageContext) { super.setPageContext(pageContext); }
    public void setValue(String k, Object o) { super.setValue(k,o); }
    public Object getValue(String k){ return  super.getValue(k); }
    public void removeValue(String k){ super.removeValue(k); }
    public Enumeration<String> getValues(){ return super.getValues(); }

}
