package javaee.servlet;

import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import java.io.IOException;

/**
 * Defines an object that receives requests from the client and sends them to any resource (such as a servlet, HTML file,
 * or JSP file) on the server.
 *
 * @see javax.servlet.ServletContext#getRequestDispatcher(java.lang.String)
 * @see ServletContext#getNamedDispatcher(java.lang.String)
 * @see ServletRequest#getRequestDispatcher(java.lang.String)
 * @see javax.servlet.RequestDispatcher
 */
public interface RequestDispatcher extends javax.servlet.RequestDispatcher {

    public void forward(ServletRequest request, ServletResponse response) throws ServletException, IOException;
    public void include(ServletRequest request, ServletResponse response) throws ServletException, IOException;

}
