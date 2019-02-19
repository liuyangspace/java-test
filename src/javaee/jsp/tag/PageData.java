package javaee.jsp.tag;

import java.io.InputStream;

/**
 * Translation-time information on a JSP page.  The information
 * corresponds to the XML view of the JSP page.
 *
 * @see  javax.servlet.jsp.tagext.PageData
 */
public abstract class PageData {

    public PageData() { /* NOOP by default */ }
    public abstract InputStream getInputStream();

}
