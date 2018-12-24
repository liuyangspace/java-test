package javaee.jsp;

/**
 * The JspPage interface describes the generic interaction that a JSP Page
 * Implementation class must satisfy; pages that use the HTTP protocol
 * are described by the HttpJspPage interface.
 *
 * @see javax.servlet.jsp.JspPage
 */
public interface JspPage extends javax.servlet.jsp.JspPage {

    public void jspInit();
    public void jspDestroy();

    /**
     * The jspInit() and jspDestroy() methods can be defined by a JSP
     * author, but the _jspService() method is defined automatically
     * by the JSP processor based on the contents of the JSP page.
     * The _jspService()method corresponds to the body of the JSP page. This
     * method is defined automatically by the JSP container and should never
     * be defined by the JSP page author.
     * _jspService()
     * public void _jspService(ServletRequestSubtype request, ServletResponseSubtype response)
     *        throws ServletException, IOException;
     */

}
