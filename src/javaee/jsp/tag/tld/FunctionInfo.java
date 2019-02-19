package javaee.jsp.tag.tld;

/**
 * Information for a function in a Tag Library.
 * This class is instantiated from the Tag Library Descriptor file (TLD)
 * and is available only at translation time.
 *
 * @see javax.servlet.jsp.tagext.FunctionInfo
 */
public class FunctionInfo extends javax.servlet.jsp.tagext.FunctionInfo{

    public FunctionInfo(String name, String klass, String signature) { super(name, klass, signature); }

    public String getName(){return super.getName();}
    public String getFunctionClass(){return super.getFunctionClass();}
    public String getFunctionSignature(){return super.getFunctionSignature();}

}
