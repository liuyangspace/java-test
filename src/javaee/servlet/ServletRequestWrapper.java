package javaee.servlet;

import javax.servlet.*;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletContext;
import javax.servlet.ServletInputStream;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import java.io.BufferedReader;
import java.io.IOException;
import java.util.Enumeration;
import java.util.Locale;
import java.util.Map;

/**
 * @see javax.servlet.ServletRequestWrapper
 */
public class ServletRequestWrapper extends javax.servlet.ServletRequestWrapper {

    public ServletRequestWrapper(ServletRequest request) { super(request);}

    public ServletRequest getRequest() { return super.getRequest(); }
    public void setRequest(ServletRequest request) { super.setRequest(request); }

    /** TODO SERVLET3 - Add comments */
    public boolean isWrapperFor(ServletRequest wrapped) { return super.isWrapperFor(wrapped); }
    public boolean isWrapperFor(Class<?> wrappedType) { return super.isWrapperFor(wrappedType); }

    @Override public Object getAttribute(String name) { return super.getAttribute(name); }
    @Override public Enumeration<String> getAttributeNames() { return super.getAttributeNames(); }
    @Override public String getCharacterEncoding() { return super.getCharacterEncoding(); }
    @Override public void setCharacterEncoding(String enc) throws java.io.UnsupportedEncodingException { super.setCharacterEncoding(enc); }
    @Override public int getContentLength() { return super.getContentLength(); }
    @Override public long getContentLengthLong() { return super.getContentLengthLong(); }
    @Override public String getContentType() { return super.getContentType(); }
    @Override public ServletInputStream getInputStream() throws IOException { return super.getInputStream(); }
    @Override public String getParameter(String name) { return super.getParameter(name); }
    @Override public Map<String, String[]> getParameterMap() { return super.getParameterMap(); }
    @Override public Enumeration<String> getParameterNames() { return super.getParameterNames(); }
    @Override public String[] getParameterValues(String name) { return super.getParameterValues(name); }
    @Override public String getProtocol() { return super.getProtocol(); }
    @Override public String getScheme() { return super.getScheme(); }
    @Override public String getServerName() { return super.getServerName(); }
    @Override public int getServerPort() { return super.getServerPort(); }
    @Override public BufferedReader getReader() throws IOException { return super.getReader(); }
    @Override public String getRemoteAddr() { return super.getRemoteAddr(); }
    @Override public String getRemoteHost() { return super.getRemoteHost(); }
    @Override public void setAttribute(String name, Object o) { super.setAttribute(name, o); }
    @Override public void removeAttribute(String name) { super.removeAttribute(name); }
    @Override public Locale getLocale() { return super.getLocale(); }
    @Override public Enumeration<Locale> getLocales() { return super.getLocales(); }
    @Override public boolean isSecure() { return super.isSecure(); }
    @Override public RequestDispatcher getRequestDispatcher(String path) { return super.getRequestDispatcher(path); }
    @Override @Deprecated public String getRealPath(String path) { return super.getRealPath(path); }
    @Override public int getRemotePort() { return super.getRemotePort(); }
    @Override public String getLocalName() { return super.getLocalName(); }
    @Override public String getLocalAddr() { return super.getLocalAddr(); }
    @Override public int getLocalPort() { return super.getLocalPort(); }
    @Override public ServletContext getServletContext() { return super.getServletContext(); }
    @Override public AsyncContext startAsync() throws IllegalStateException { return super.startAsync(); }
    @Override public AsyncContext startAsync(ServletRequest servletRequest, ServletResponse servletResponse) throws IllegalStateException { return super.startAsync(servletRequest, servletResponse); }
    @Override public boolean isAsyncStarted() { return super.isAsyncStarted(); }
    @Override public boolean isAsyncSupported() { return super.isAsyncSupported(); }
    @Override public AsyncContext getAsyncContext() { return super.getAsyncContext(); }
    @Override public DispatcherType getDispatcherType() { return super.getDispatcherType(); }
}
