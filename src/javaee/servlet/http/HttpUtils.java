package javaee.servlet.http;

import javax.servlet.ServletInputStream;
import javax.servlet.http.HttpServletRequest;
import java.util.Hashtable;

/**
 * @deprecated            As of Java(tm) Servlet API 2.3.
 *                        These methods were only useful
 *                        with the default encoding and have been moved
 *                        to the request interfaces.
 *
 * @see javax.servlet.http.HttpUtils
 */
@Deprecated
public class HttpUtils {

    public HttpUtils() { /* NOOP */ }

    public static Hashtable<String,String[]> parseQueryString(String s) { return javax.servlet.http.HttpUtils.parseQueryString(s); }
    public static Hashtable<String,String[]> parsePostData(int len, ServletInputStream in) { return javax.servlet.http.HttpUtils.parsePostData(len,in); }
    public static StringBuffer getRequestURL (HttpServletRequest req) { return javax.servlet.http.HttpUtils.getRequestURL(req); }

}
