package javaee.servlet.servlet3;

import javax.servlet.*;
import javax.servlet.ServletContext;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;

/**
 * TODO SERVLET3 - Add comments
 *
 * {@link javax.servlet.http.HttpServletRequest#startAsync()} or
 * {@link javax.servlet.http.HttpServletRequest#startAsync(ServletRequest,ServletResponse)}
 *
 * @see javax.servlet.AsyncContext
 */
public interface AsyncContext extends javax.servlet.AsyncContext{
    public static final String ASYNC_REQUEST_URI = "javax.servlet.async.request_uri";
    public static final String ASYNC_CONTEXT_PATH  = "javax.servlet.async.context_path";
    public static final String ASYNC_MAPPING = "javax.servlet.async.mapping";
    public static final String ASYNC_PATH_INFO = "javax.servlet.async.path_info";
    public static final String ASYNC_SERVLET_PATH = "javax.servlet.async.servlet_path";
    public static final String ASYNC_QUERY_STRING = "javax.servlet.async.query_string";

    ServletRequest getRequest();
    ServletResponse getResponse();

    void dispatch();
    void dispatch(String path);
    void dispatch(ServletContext context, String path);
    void complete();
    void start(Runnable run);
    void addListener(AsyncListener listener);
    void addListener(AsyncListener listener, ServletRequest request, ServletResponse response);
    <T extends AsyncListener> T createListener(Class<T> clazz) throws ServletException;
    void setTimeout(long timeout);
    long getTimeout();

}
