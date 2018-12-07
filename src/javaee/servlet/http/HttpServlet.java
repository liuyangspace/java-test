package javaee.servlet.http;

import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

/**
 * Provides an abstract class to be subclassed to create an HTTP servlet suitable for a Web site. A subclass of
 * <code>HttpServlet</code> must override at least one method, usually one of these:
 *  <li> <code>doGet</code>, if the servlet supports HTTP GET requests
 *  <li> <code>doPost</code>, for HTTP POST requests
 *  <li> <code>doPut</code>, for HTTP PUT requests
 *  <li> <code>doDelete</code>, for HTTP DELETE requests
 *  <li> <code>init</code> and <code>destroy</code>,
 *
 * @see javax.servlet.http.HttpServlet
 */
public abstract class HttpServlet extends javax.servlet.http.HttpServlet {

    public HttpServlet() { /* NOOP */ }

    public void service(ServletRequest req, ServletResponse res) throws ServletException, IOException {super.service(req,res);}
    protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {super.service(req,resp);}
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {super.doGet(req,resp);}
    protected void doHead(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {super.doHead(req,resp);}
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {super.doPost(req,resp);}
    protected void doPut(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {super.doPut(req,resp);}
    protected void doDelete(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {super.doDelete(req,resp);}
    protected void doOptions(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {super.doOptions(req,resp);}
    protected void doTrace(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {super.doTrace(req,resp);}

    protected long getLastModified(HttpServletRequest req) { return -1; }
}
