package javaee.servlet.http;

import javax.servlet.http.HttpServletResponse;
import java.util.Map;
import java.util.function.Supplier;

/**
 * Provides a convenient implementation of the HttpServletResponse interface
 * that can be subclassed by developers wishing to adapt the response from a
 * Servlet. This class implements the Wrapper or Decorator pattern. Methods
 * default to calling through to the wrapped response object.
 *
 * @see javax.servlet.http.HttpServletResponseWrapper
 */
public class HttpServletResponseWrapper extends javax.servlet.http.HttpServletResponseWrapper implements HttpServletResponse {

    public HttpServletResponseWrapper(HttpServletResponse response) { super(response); }

    /*
    @Override ...
    public void sendError(int sc, String msg) throws IOException;
    public void sendError(int sc) throws IOException;
    public void sendRedirect(String location) throws IOException;

    public void addCookie(Cookie cookie);

    public void setStatus(int sc);
    public void setStatus(int sc, String sm);
    public int getStatus();
    public String getHeader(String name);
    public Collection<String> getHeaders(String name);
    public Collection<String> getHeaderNames();
    public void setIntHeader(String name, int value);
    public void addIntHeader(String name, int value);
    public void setHeader(String name, String value);
    public void addHeader(String name, String value);
    public boolean containsHeader(String name);
    public void setDateHeader(String name, long date);
    public void addDateHeader(String name, long date);

    public String encodeURL(String url);
    public String encodeRedirectURL(String url);
    @Deprecated public String encodeUrl(String url);
    @Deprecated public String encodeRedirectUrl(String url);

    public default void setTrailerFields(Supplier<Map<String, String>> supplier)
    public default Supplier<Map<String, String>> getTrailerFields() {return null;}
     */
}
