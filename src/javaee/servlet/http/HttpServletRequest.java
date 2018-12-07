package javaee.servlet.http;

import javax.servlet.ServletException;
import javax.servlet.http.*;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.IOException;
import java.util.Collection;
import java.util.Collections;
import java.util.Enumeration;
import java.util.Map;

/**
 * Extends the {@link javax.servlet.ServletRequest} interface to provide request information for HTTP servlets.
 * @see javax.servlet.http.HttpServletRequest
 */
public interface HttpServletRequest extends javax.servlet.http.HttpServletRequest{

    public String getAuthType();
    public boolean authenticate(HttpServletResponse response) throws IOException, ServletException;
    public void login(String username, String password) throws ServletException;
    public void logout() throws ServletException;

    public String getRemoteUser();
    public boolean isUserInRole(String role);
    public java.security.Principal getUserPrincipal();

    public long getDateHeader(String name);
    public String getHeader(String name);
    public Enumeration<String> getHeaders(String name);
    public Enumeration<String> getHeaderNames();
    public int getIntHeader(String name);

    public default HttpServletMapping getHttpServletMapping() { return null; }
    public default PushBuilder newPushBuilder() { return null; }

    public String getMethod();
    public String getQueryString();
    public String getRequestURI();
    public StringBuffer getRequestURL();
    public Collection<javax.servlet.http.Part> getParts() throws IOException, ServletException;
    public Part getPart(String name) throws IOException, ServletException;

    public Cookie[] getCookies();
    public String getRequestedSessionId();
    public HttpSession getSession(boolean create);
    public HttpSession getSession();
    public String changeSessionId();
    public boolean isRequestedSessionIdValid();
    public boolean isRequestedSessionIdFromCookie();
    public boolean isRequestedSessionIdFromURL();
    @Deprecated public boolean isRequestedSessionIdFromUrl();

    public String getPathInfo();
    public String getPathTranslated();
    public String getContextPath();
    public String getServletPath();

    public <T extends javax.servlet.http.HttpUpgradeHandler> T upgrade(Class<T> httpUpgradeHandlerClass) throws java.io.IOException, ServletException;
    public default Map<String,String> getTrailerFields() { return Collections.emptyMap(); }
    public default boolean isTrailerFieldsReady() { return false; }

}
