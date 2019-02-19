package javaee.jsp.tag.tld;

/**
 * Variable information for a tag in a Tag Library; This class is instantiated
 * from the Tag Library Descriptor file (TLD) and is available only at
 * translation time. This object should be immutable. This information is only
 * available in JSP 1.2 format TLDs or above.
 *
 * @see javax.servlet.jsp.tagext.TagVariableInfo
 */
public class TagVariableInfo extends javax.servlet.jsp.tagext.TagVariableInfo {

    public TagVariableInfo(String nameGiven, String nameFromAttribute, String className, boolean declare, int scope) {
        super(nameGiven, nameFromAttribute, className, declare, scope);
    }

    public String getNameGiven(){ return super.getNameGiven(); }
    public String getNameFromAttribute(){ return super.getNameFromAttribute(); }
    public String getClassName(){ return super.getClassName(); }
    public boolean getDeclare(){ return super.getDeclare(); }
    public int getScope(){ return super.getScope(); }

}
