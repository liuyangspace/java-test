package test.javaee.servlet.listener;

import javax.servlet.ServletContext;
import javax.servlet.ServletRequestEvent;

public class RequestListener implements javax.servlet.ServletRequestListener {
    /**
     * The request is about to go out of scope of the web application.
     * The default implementation is a NO-OP.
     * @param sre Information about the request
     */
    public void requestDestroyed (ServletRequestEvent sre) {
        System.out.println("requestDestroyed");
    }

    /**
     * The request is about to come into scope of the web application.
     * The default implementation is a NO-OP.
     * @param sre Information about the request
     */
    public void requestInitialized (ServletRequestEvent sre) {
        // 统计访问次数
        ServletContext servletContext = (ServletContext)sre.getSource();
        String requestCountKey = "RequestCount";
        int requestCount = 0;
        if(servletContext.getAttribute(requestCountKey)!=null){
            requestCount = (int)servletContext.getAttribute(requestCountKey);
        }
        servletContext.setAttribute(requestCountKey,requestCount+1);

        System.out.println("requestInitialized");
    }
}
