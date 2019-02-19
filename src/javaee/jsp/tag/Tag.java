package javaee.jsp.tag;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.PageContext;

/**
 * The Tag interface defines the basic protocol between a Tag handler and JSP page implementation class.
 * Methods: There are two main actions: doStartTag and doEndTag
 * Lifecycle:
 *      [1] This transition is intended to be for releasing long-term data.
 *      [2] This transition happens if and only if the tag ends normally without raising an exception
 *      [3] Some setters may be called again before a tag handler is reused.
 *
 *
 * @see javax.servlet.jsp.tagext.JspTag
 * @see javax.servlet.jsp.tagext.Tag
 */
public interface Tag extends javax.servlet.jsp.tagext.Tag{

    void setPageContext(PageContext pc);
    void setParent(Tag t);
    Tag getParent();
    int doStartTag() throws JspException;
    int doEndTag() throws JspException;
    void release();

}
