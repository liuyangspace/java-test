package javaee.jsp.tag.tld;

import javax.servlet.jsp.tagext.*;
import javax.servlet.jsp.tagext.TagAttributeInfo;
import javax.servlet.jsp.tagext.TagExtraInfo;

/**
 * Tag information for a tag in a Tag Library;
 * This class is instantiated from the Tag Library Descriptor file (TLD)
 * and is available only at translation time.
 *
 * @see javax.servlet.jsp.tagext.TagInfo
 */
public class TagInfo extends javax.servlet.jsp.tagext.TagInfo{

    public TagInfo(String tagName, String tagClassName, String bodycontent, String infoString, TagLibraryInfo taglib, TagExtraInfo tagExtraInfo, TagAttributeInfo[] attributeInfo) {
        super(tagName, tagClassName, bodycontent, infoString, taglib, tagExtraInfo, attributeInfo);
    }
    public TagInfo(String tagName, String tagClassName, String bodycontent, String infoString, TagLibraryInfo taglib, TagExtraInfo tagExtraInfo, TagAttributeInfo[] attributeInfo, String displayName, String smallIcon, String largeIcon, TagVariableInfo[] tvi) {
        super(tagName, tagClassName, bodycontent, infoString, taglib, tagExtraInfo, attributeInfo, displayName, smallIcon, largeIcon, tvi);
    }
    public TagInfo(String tagName, String tagClassName, String bodycontent, String infoString, TagLibraryInfo taglib, TagExtraInfo tagExtraInfo, TagAttributeInfo[] attributeInfo, String displayName, String smallIcon, String largeIcon, TagVariableInfo[] tvi, boolean dynamicAttributes) {
        super(tagName, tagClassName, bodycontent, infoString, taglib, tagExtraInfo, attributeInfo, displayName, smallIcon, largeIcon, tvi, dynamicAttributes);
    }

    public String getTagName() { return super.getTagName(); }
    public TagAttributeInfo[] getAttributes() { return super.getAttributes(); }
    public VariableInfo[] getVariableInfo(TagData data){ return super.getVariableInfo(data); }
    public boolean isValid(TagData data) { return super.isValid(data); }
    public ValidationMessage[] validate( TagData data ) { return super.validate(data); }
    public void setTagExtraInfo(TagExtraInfo tei){ super.setTagExtraInfo(tei); }
    public TagExtraInfo getTagExtraInfo(){ return super.getTagExtraInfo(); }
    public String getTagClassName(){ return super.getTagClassName(); }
    public String getBodyContent(){ return super.getBodyContent(); }
    public String getInfoString(){ return super.getInfoString(); }
    public void setTagLibrary(TagLibraryInfo tl){ super.setTagLibrary(tl);}
    public TagLibraryInfo getTagLibrary(){ return super.getTagLibrary(); }
    public String getDisplayName(){ return super.getDisplayName(); }
    public String getSmallIcon(){ return super.getSmallIcon(); }
    public String getLargeIcon(){ return super.getLargeIcon(); }
    public TagVariableInfo[] getTagVariableInfos(){ return super.getTagVariableInfos(); }
    public boolean hasDynamicAttributes(){ return super.hasDynamicAttributes(); }


}
