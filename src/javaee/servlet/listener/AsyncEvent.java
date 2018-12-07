package javaee.servlet.listener;

import javax.servlet.AsyncContext;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;

/**
 * TODO SERVLET3 - Add comments
 *
 * @see javax.servlet.AsyncEvent
 */
public class AsyncEvent extends javax.servlet.AsyncEvent {

    public AsyncEvent(AsyncContext context) { super(context); }
    public AsyncEvent(AsyncContext context, ServletRequest request, ServletResponse response) { super(context,request,response); }
    public AsyncEvent(AsyncContext context, Throwable throwable) { super(context,throwable); }
    public AsyncEvent(AsyncContext context, ServletRequest request, ServletResponse response, Throwable throwable) { super(context,request,response,throwable); }

    public AsyncContext getAsyncContext() { return super.getAsyncContext(); }
    public ServletRequest getSuppliedRequest() { return super.getSuppliedRequest(); }
    public ServletResponse getSuppliedResponse() { return super.getSuppliedResponse(); }
    public Throwable getThrowable() { return super.getThrowable(); }

}
