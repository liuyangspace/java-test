package javaee.jsp.tag.tld;

import javax.servlet.jsp.tagext.PageData;
import javax.servlet.jsp.tagext.ValidationMessage;
import java.util.Map;

/**
 * Translation-time validator class for a JSP page.
 * A validator operates on the XML view associated with the JSP page.
 *
 * @see javax.servlet.jsp.tagext.TagLibraryValidator
 */
public abstract class TagLibraryValidator extends javax.servlet.jsp.tagext.TagLibraryValidator{

    public TagLibraryValidator() { /* NOOP by default */ }

    public void setInitParameters(Map<String, Object> map){ super.setInitParameters(map); }
    public Map<String, Object> getInitParameters(){ return super.getInitParameters(); }
    public ValidationMessage[] validate(String prefix, String uri, PageData page){ return super.validate(prefix,uri,page); }
    public void release(){ super.release(); }


}
