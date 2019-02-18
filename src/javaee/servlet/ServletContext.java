package javaee.servlet;

import javax.servlet.*;
import javax.servlet.RequestDispatcher;
import javax.servlet.Servlet;
import javax.servlet.ServletConfig;
import javax.servlet.descriptor.JspConfigDescriptor;
import java.io.InputStream;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.Enumeration;
import java.util.EventListener;
import java.util.Map;
import java.util.Set;

/**
 * ServletContext 是web工程的，所有Servlet共享, 多个Servlet通过ServletContext对象实现数据共享
 *
 * @see javax.servlet.ServletContext
 * @see javax.servlet.ServletConfig#getServletContext
 * @see javax.servlet.ServletRequest#getServletContext
 * @see javax.servlet.FilterConfig#getServletContext
 */
public interface ServletContext extends javax.servlet.ServletContext{

    public String getContextPath();
    public ServletContext getContext(String uripath);

    public int getMajorVersion();
    public int getMinorVersion();
    public int getEffectiveMajorVersion();
    public int getEffectiveMinorVersion();

    public String getMimeType(String file);
    public Set<String> getResourcePaths(String path);
    public URL getResource(String path) throws MalformedURLException;
    public InputStream getResourceAsStream(String path);

    public RequestDispatcher getRequestDispatcher(String path);
    public RequestDispatcher getNamedDispatcher(String name);
    public JspConfigDescriptor getJspConfigDescriptor();

    public void log(String msg);
    public void log(Exception exception, String msg);
    public void log(String message, Throwable throwable);

    public String getRealPath(String path);

    public String getInitParameter(String name);
    public Enumeration<String> getInitParameterNames();
    public boolean setInitParameter(String name, String value);
    public Object getAttribute(String name);
    public Enumeration<String> getAttributeNames();
    public void setAttribute(String name, Object object);
    public void removeAttribute(String name);

    public String getServletContextName();
    public String getServerInfo();
    public String getVirtualServerName();
    // Servlet
    public javax.servlet.ServletRegistration.Dynamic addServlet(String servletName, String className);
    public javax.servlet.ServletRegistration.Dynamic addServlet(String servletName, Servlet servlet);
    public javax.servlet.ServletRegistration.Dynamic addServlet(String servletName, Class<? extends Servlet> servletClass);
    public javax.servlet.ServletRegistration.Dynamic addJspFile(String jspName, String jspFile);
    public <T extends Servlet> T createServlet(Class<T> c) throws ServletException;
    public ServletRegistration getServletRegistration(String servletName);
    public Map<String, ? extends ServletRegistration> getServletRegistrations();
    // Filter
    public FilterRegistration.Dynamic addFilter(String filterName, String className);
    public FilterRegistration.Dynamic addFilter(String filterName, Filter filter);
    public FilterRegistration.Dynamic addFilter(String filterName, Class<? extends Filter> filterClass);
    public <T extends Filter> T createFilter(Class<T> c) throws ServletException;
    public FilterRegistration getFilterRegistration(String filterName);
    public Map<String, ? extends FilterRegistration> getFilterRegistrations();
    // Session
    public int getSessionTimeout();
    public void setSessionTimeout(int sessionTimeout);
    public SessionCookieConfig getSessionCookieConfig();
    public void setSessionTrackingModes( Set<SessionTrackingMode> sessionTrackingModes);
    public Set<SessionTrackingMode> getDefaultSessionTrackingModes();
    public Set<SessionTrackingMode> getEffectiveSessionTrackingModes();
    // Listener
    public void addListener(String className);
    public <T extends EventListener> void addListener(T t);
    public void addListener(Class<? extends EventListener> listenerClass);
    public <T extends EventListener> T createListener(Class<T> c) throws ServletException;
    // Request Response Character
    public String getRequestCharacterEncoding();
    public void setRequestCharacterEncoding(String encoding);
    public String getResponseCharacterEncoding();
    public void setResponseCharacterEncoding(String encoding);

    public void declareRoles(String... roleNames);

    public ClassLoader getClassLoader();

    @Deprecated public Servlet getServlet(String name) throws ServletException;
    @Deprecated public Enumeration<Servlet> getServlets();
    @Deprecated public Enumeration<String> getServletNames();
}
