package javaee.servlet;

import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import java.io.IOException;
import java.util.Enumeration;

/**
 * Defines a generic, protocol-independent servlet. To write an HTTP servlet for
 * use on the Web, extend {@link javax.servlet.http.HttpServlet} instead.
 *
 * @see     javax.servlet.GenericServlet
 */
public abstract class GenericServlet extends javax.servlet.GenericServlet implements Servlet, ServletConfig, java.io.Serializable {

    public GenericServlet() { /* NOOP */ }
    public void destroy() { /* NOOP by default */ }

    public String getInitParameter(String name) { return getServletConfig().getInitParameter(name); }
    public Enumeration<String> getInitParameterNames() { return getServletConfig().getInitParameterNames(); }
    public javax.servlet.ServletConfig getServletConfig() { return super.getServletConfig(); }
    public ServletContext getServletContext() { return getServletConfig().getServletContext(); }
    public String getServletName() { return getServletConfig().getServletName(); }

    public String getServletInfo() { return ""; }
    public void init(javax.servlet.ServletConfig config) throws ServletException { super.init(config); }
    public void init() throws ServletException { /* NOOP by default */ }
    public abstract void service(ServletRequest req, ServletResponse res) throws ServletException, IOException;

    public void log(String msg) { getServletContext().log(getServletName() + ": " + msg); }
    public void log(String message, Throwable t) { getServletContext().log(getServletName() + ": " + message, t); }

}
