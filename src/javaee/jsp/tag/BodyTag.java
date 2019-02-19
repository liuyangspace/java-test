package javaee.jsp.tag;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.tagext.BodyContent;
import javax.servlet.jsp.tagext.IterationTag;

/**
 * The BodyTag interface extends IterationTag by defining additional methods that let a tag handler manipulate the
 * content of evaluating its body.
 *
 * @see javax.servlet.jsp.tagext.BodyTag
 */
public interface BodyTag extends javax.servlet.jsp.tagext.BodyTag,IterationTag {

    void setBodyContent(BodyContent b);
    void doInitBody() throws JspException;

}
