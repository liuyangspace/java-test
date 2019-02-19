package javaee.jsp.tag.tld;

import javax.servlet.jsp.tagext.TagData;
import javax.servlet.jsp.tagext.ValidationMessage;
import javax.servlet.jsp.tagext.VariableInfo;

/**
 * Optional class provided by the tag library author to describe additional
 * translation-time information not described in the TLD.
 * The TagExtraInfo class is mentioned in the Tag Library Descriptor file (TLD).
 *
 * @see javax.servlet.jsp.tagext.TagExtraInfo
 */
public class TagExtraInfo extends javax.servlet.jsp.tagext.TagExtraInfo{

    public TagExtraInfo() { /* NOOP by default */ }
    public VariableInfo[] getVariableInfo(TagData data) { return super.getVariableInfo(data); }
    public boolean isValid(TagData data) { return super.isValid(data); }
    public ValidationMessage[] validate(TagData data ) { return super.validate(data); }

}
