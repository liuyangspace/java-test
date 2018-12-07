package javaee.servlet.http;

import javax.servlet.http.HttpServletRequest;
import java.util.Set;

/**
 * Builds a push request based on the {@link javax.servlet.http.HttpServletRequest} from which this
 * builder was obtained. The push request will be constructed on the following basis:
 * <li>The request method is set to <code>GET</code>.</li>
 * <li>The path will not be set. This must be set explicitly via a call to
 *     {@link #path(String)}.</li>
 * <li>Conditional, range, expectation, authorization and referer headers will
 *     be removed.</li>
 * <li>Cookies added to the associated response will be added to the push
 *     request unless maxAge &lt;= 0 in which case any request cookie with the
 *     same name will be removed.</li>
 * <li>The referer header will be set to
 *     {@link javax.servlet.http.HttpServletRequest#getRequestURL()} plus, if present, the query
 *     string from {@link HttpServletRequest#getQueryString()}.
 *
 * @see javax.servlet.http.PushBuilder
 */
public interface PushBuilder extends javax.servlet.http.PushBuilder{

    javax.servlet.http.PushBuilder method(String method);
    javax.servlet.http.PushBuilder queryString(String queryString);
    javax.servlet.http.PushBuilder sessionId(String sessionId);
    javax.servlet.http.PushBuilder setHeader(String name, String value);
    javax.servlet.http.PushBuilder addHeader(String name, String value);
    javax.servlet.http.PushBuilder removeHeader(String name);
    javax.servlet.http.PushBuilder path(String path);

    void push();
    String getMethod();
    String getQueryString();
    String getSessionId();
    Set<String> getHeaderNames();
    /** TODO Servlet 4.0 */ String getHeader(String name);
    String getPath();

}
