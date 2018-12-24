package javaee.jsp;

import javax.servlet.*;
import javax.servlet.http.HttpSession;
import javax.servlet.jsp.ErrorData;
import javax.servlet.jsp.tagext.BodyContent;
import java.io.IOException;

/**
 * PageContext extends JspContext to provide useful context information for
 * when JSP technology is used in a Servlet environment.
 * PageContext instance provides access to all the namespaces associated
 * with a JSP page, provides access to several page attributes,
 *
 * @see javax.servlet.jsp.JspFactory#getPageContext
 * @see javax.servlet.jsp.JspFactory#releasePageContext
 * @see javax.servlet.jsp.PageContext
 */
public abstract class PageContext extends javax.servlet.jsp.PageContext{

    public PageContext() { /* NOOP by default */ }

    public abstract void initialize(Servlet servlet, ServletRequest request, ServletResponse response, String errorPageURL, boolean needsSession,
                                    int bufferSize, boolean autoFlush) throws IOException, IllegalStateException, IllegalArgumentException;
    public abstract void release();

    public abstract HttpSession getSession();
    public abstract Object getPage();
    public abstract ServletRequest getRequest();
    public abstract ServletResponse getResponse();
    public abstract Exception getException();
    public abstract ServletConfig getServletConfig();
    public abstract ServletContext getServletContext();

    public abstract void forward(String relativeUrlPath) throws ServletException, IOException;
    public abstract void include(String relativeUrlPath) throws ServletException, IOException;
    public abstract void include(String relativeUrlPath, boolean flush) throws ServletException, IOException;

    public abstract void handlePageException(Exception e) throws ServletException, IOException;
    public abstract void handlePageException(Throwable t) throws ServletException, IOException;
    public BodyContent pushBody() { return null; /* XXX to implement */ }

    public ErrorData getErrorData() { return super.getErrorData(); }

}
