package javaee.jsp.tag.tld;

/**
 * Information on the attributes of a Tag, available at translation time. This
 * class is instantiated from the Tag Library Descriptor file (TLD).
 *
 * @see javax.servlet.jsp.tagext.TagAttributeInfo
 */
public class TagAttributeInfo extends javax.servlet.jsp.tagext.TagAttributeInfo{

    public TagAttributeInfo(String name, boolean required, String type, boolean reqTime) { super(name, required, type, reqTime); }
    public TagAttributeInfo(String name, boolean required, String type, boolean reqTime, boolean fragment) { super(name, required, type, reqTime, fragment); }
    public TagAttributeInfo(String name, boolean required, String type, boolean reqTime, boolean fragment, String description, boolean deferredValue, boolean deferredMethod, String expectedTypeName, String methodSignature)
        { super(name, required, type, reqTime, fragment, description, deferredValue, deferredMethod, expectedTypeName, methodSignature); }


    public String getName() { return super.getName(); }
    public String getTypeName() { return super.getTypeName(); }
    public String toString() { return super.toString(); }
    public boolean canBeRequestTime() { return super.canBeRequestTime(); }
    public boolean isRequired() { return super.isRequired(); }
    public boolean isFragment() { return super.isFragment(); }
    public static javax.servlet.jsp.tagext.TagAttributeInfo getIdAttribute(javax.servlet.jsp.tagext.TagAttributeInfo a[]) { return javax.servlet.jsp.tagext.TagAttributeInfo.getIdAttribute(a); }

}
