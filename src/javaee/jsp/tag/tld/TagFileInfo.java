package javaee.jsp.tag.tld;

import javax.servlet.jsp.tagext.TagInfo;

/**
 * Tag information for a tag file in a Tag Library;
 * This class is instantiated from the Tag Library Descriptor file (TLD)
 * and is available only at translation time.
 *
 * @see javax.servlet.jsp.tagext.TagFileInfo
 */
public class TagFileInfo extends javax.servlet.jsp.tagext.TagFileInfo{

    /**
     * Constructor for TagFileInfo from data in the JSP 2.0 format for TLD.
     * This class is to be instantiated only from the TagLibrary code
     * under request from some JSP code that is parsing a
     * TLD (Tag Library Descriptor).
     * <p>
     * Note that, since TagLibraryInfo reflects both TLD information
     * and taglib directive information, a TagFileInfo instance is
     * dependent on a taglib directive.  This is probably a
     * design error, which may be fixed in the future.
     *
     * @param name    The unique action name of this tag
     * @param path    Where to find the .tag file implementing this
     *                action, relative to the location of the TLD file.
     * @param tagInfo The detailed information about this tag, as parsed
     */
    public TagFileInfo(String name, String path, TagInfo tagInfo) {
        super(name, path, tagInfo);
    }

    public String getName() { return super.getName(); }
    public String getPath() { return super.getPath(); }
    public TagInfo getTagInfo() { return super.getTagInfo(); }

}
