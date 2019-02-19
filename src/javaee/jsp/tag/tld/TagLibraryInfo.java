package javaee.jsp.tag.tld;

import javax.servlet.jsp.tagext.FunctionInfo;
import javax.servlet.jsp.tagext.TagFileInfo;
import javax.servlet.jsp.tagext.TagInfo;

/**
 * Translation-time information associated with a taglib directive, and its
 * underlying TLD file. Most of the information is directly from the TLD, except
 * for the prefix and the uri values used in the taglib directive
 * @see javax.servlet.jsp.tagext.TagLibraryInfo
 */
public abstract class TagLibraryInfo extends javax.servlet.jsp.tagext.TagLibraryInfo {

    protected TagLibraryInfo(String prefix, String uri) { super(prefix,uri); }

    public String getURI() { return super.getURI(); }
    public String getPrefixString() { return super.getPrefixString(); }
    public String getShortName() { return super.getShortName(); }
    public String getReliableURN() { return super.getReliableURN(); }
    public String getInfoString() { return super.getInfoString(); }
    public String getRequiredVersion() { return super.getRequiredVersion(); }
    public TagInfo[] getTags() { return super.getTags(); }
    public TagFileInfo[] getTagFiles() { return super.getTagFiles(); }
    public TagInfo getTag(String shortname) { return super.getTag(shortname); }
    public TagFileInfo getTagFile(String shortname) { return super.getTagFile(shortname); }
    public FunctionInfo[] getFunctions() { return super.getFunctions(); }
    public FunctionInfo getFunction(String name) { return super.getFunction(name); }

    public abstract javax.servlet.jsp.tagext.TagLibraryInfo[] getTagLibraryInfos();

}
