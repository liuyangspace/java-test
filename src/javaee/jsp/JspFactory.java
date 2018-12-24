package javaee.jsp;

import javax.servlet.Servlet;
import javax.servlet.ServletContext;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.jsp.JspApplicationContext;
import javax.servlet.jsp.JspEngineInfo;
import javax.servlet.jsp.PageContext;

/**
 * The JspFactory is an abstract class that defines a number of factory
 * methods available to a JSP page at runtime for the purposes of creating
 * instances of various interfaces and classes used to support the JSP
 * implementation.
 *
 * @see javax.servlet.jsp.JspFactory
 */
public abstract class JspFactory {

    public JspFactory() {/* NOOP by default */}

    public static void setDefaultFactory(javax.servlet.jsp.JspFactory deflt) { javax.servlet.jsp.JspFactory.setDefaultFactory(deflt); }
    public static javax.servlet.jsp.JspFactory getDefaultFactory() { return javax.servlet.jsp.JspFactory.getDefaultFactory(); }

    public abstract PageContext getPageContext(Servlet servlet,ServletRequest request, ServletResponse response,String errorPageURL,
                                               boolean needsSession, int buffer,boolean autoflush);
    public abstract void releasePageContext(PageContext pc);
    public abstract JspEngineInfo getEngineInfo();
    public abstract JspApplicationContext getJspApplicationContext(ServletContext context);
}
