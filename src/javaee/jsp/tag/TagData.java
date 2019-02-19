package javaee.jsp.tag;

import javax.servlet.jsp.tagext.TagAttributeInfo;
import java.util.Hashtable;

/**
 * The (translation-time only) attribute/value information for a tag instance.
 *
 * TagData is only used as an argument to the isValid, validate, and
 * getVariableInfo methods of TagExtraInfo, which are invoked at
 * translation time.
 *
 * @see javax.servlet.jsp.tagext.TagData;
 */
public class TagData extends javax.servlet.jsp.tagext.TagData implements Cloneable {

    public TagData(Object[][] atts) { super(atts); }
    public TagData(Hashtable<String, Object> attrs) { super(attrs); }

    public String getId() { return getAttributeString(TagAttributeInfo.ID); }
    public Object getAttribute(String attName) { return super.getAttribute(attName); }
    public String getAttributeString(String attName) { return super.getAttributeString(attName); }
    public void setAttribute(String attName, Object value) { super.setAttribute(attName, value); }
    public java.util.Enumeration<String> getAttributes() { return super.getAttributes(); }


}
