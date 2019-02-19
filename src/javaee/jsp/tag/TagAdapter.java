package javaee.jsp.tag;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.PageContext;
import javax.servlet.jsp.tagext.JspTag;
import javax.servlet.jsp.tagext.SimpleTag;
import javax.servlet.jsp.tagext.Tag;

/**
 * Wraps any SimpleTag and exposes it using a Tag interface. This is used to
 * allow collaboration between classic Tag handlers and SimpleTag handlers.
 *
 * @see javax.servlet.jsp.tagext.TagAdapter
 */
public class TagAdapter extends javax.servlet.jsp.tagext.TagAdapter implements Tag {

    public TagAdapter(SimpleTag adaptee) { super(adaptee); }

    @Override public void setPageContext(PageContext pc) { throw new UnsupportedOperationException("Illegal to invoke setPageContext() on TagAdapter wrapper"); }
    @Override public void setParent(Tag parentTag) { throw new UnsupportedOperationException("Illegal to invoke setPageContext() on TagAdapter wrapper"); }
    @Override public int doStartTag() throws JspException { throw new UnsupportedOperationException("Illegal to invoke setPageContext() on TagAdapter wrapper"); }
    @Override public int doEndTag() throws JspException { throw new UnsupportedOperationException("Illegal to invoke setPageContext() on TagAdapter wrapper"); }
    @Override public void release() { throw new UnsupportedOperationException("Illegal to invoke setPageContext() on TagAdapter wrapper"); }
    @Override public Tag getParent() { return super.getParent(); }
    public JspTag getAdaptee() { return super.getAdaptee(); }

}
