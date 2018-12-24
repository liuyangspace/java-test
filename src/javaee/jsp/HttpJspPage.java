package javaee.jsp;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

/**
 * @see javax.servlet.jsp.HttpJspPage
 * @see javax.servlet.jsp.JspPage
 */
public interface HttpJspPage extends javax.servlet.jsp.HttpJspPage{
    /**
     * The _jspService()method corresponds to the body of the JSP page. This
     * method is defined automatically by the JSP container and should never
     * be defined by the JSP page author.
     */
    public void _jspService(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException;
}
