package javaee.jsp.tag;

import javax.servlet.jsp.JspWriter;
import java.io.IOException;
import java.io.Reader;
import java.io.Writer;

/**
 * @see javax.servlet.jsp.tagext.BodyTagSupport
 * @see javax.servlet.jsp.tagext.BodyContent
 * @see javax.servlet.jsp.JspWriter
 */
public abstract class BodyContent extends javax.servlet.jsp.tagext.BodyContent{

    protected BodyContent(JspWriter e) { super(e); }
    @Override public void flush() throws IOException{ super.flush(); }
    @Override public void clearBody(){ super.clearBody(); }
    public abstract Reader getReader();
    public abstract String getString();
    public abstract void writeOut(Writer out) throws IOException;
    public JspWriter getEnclosingWriter(){ return super.getEnclosingWriter(); }

}
