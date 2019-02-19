package javaee.jsp.tag;

import javax.servlet.jsp.JspException;

/**
 * Lifecycle:
 *  Lifecycle details are described by the transition diagram below.
 *
 *
 * @see javax.servlet.jsp.tagext.IterationTag
 */
public interface IterationTag {

    int doAfterBody() throws JspException;

}
