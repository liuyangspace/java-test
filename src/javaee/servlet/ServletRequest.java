package javaee.servlet;

import javax.servlet.*;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletContext;
import javax.servlet.ServletResponse;
import java.io.BufferedReader;
import java.io.IOException;
import java.util.Enumeration;
import java.util.Locale;
import java.util.Map;

/**
 * Defines an object to provide client request information to a servlet.
 *
 * @see javax.servlet.ServletRequest
 * @see javax.servlet.http.HttpServletRequest
 */
public interface ServletRequest extends javax.servlet.ServletRequest{

    public Object getAttribute(String name);
    public Enumeration<String> getAttributeNames();
    public void setAttribute(String name, Object o);
    public void removeAttribute(String name);

    public String getCharacterEncoding();
    public void setCharacterEncoding(String env) throws java.io.UnsupportedEncodingException;

    public int getContentLength();
    public long getContentLengthLong();
    public String getContentType();

    public ServletInputStream getInputStream() throws IOException;
    public String getParameter(String name);
    public Enumeration<String> getParameterNames();
    public String[] getParameterValues(String name);
    public Map<String, String[]> getParameterMap();
    public BufferedReader getReader() throws IOException;

    public String getProtocol();
    public String getScheme();
    public String getServerName();
    public int getServerPort();
    public String getRemoteAddr();
    public String getRemoteHost();
    public int getRemotePort();
    public Locale getLocale();
    public Enumeration<Locale> getLocales();
    public String getLocalName();
    public String getLocalAddr();
    public int getLocalPort();
    public boolean isSecure();// is https

    public RequestDispatcher getRequestDispatcher(String path);
    public String getRealPath(String path);

    /** @since Servlet 3.0 TODO SERVLET3 - Add comments */
    public AsyncContext startAsync() throws IllegalStateException;
    public ServletContext getServletContext();
    public AsyncContext startAsync(javax.servlet.ServletRequest servletRequest, ServletResponse servletResponse) throws IllegalStateException;
    public boolean isAsyncStarted();
    public boolean isAsyncSupported();
    public AsyncContext getAsyncContext();
    public DispatcherType getDispatcherType();

}
