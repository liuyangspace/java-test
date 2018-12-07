package javaee.servlet;

import javax.servlet.ServletContext;
import java.util.Enumeration;

/**
 * A servlet configuration object used by a servlet container to pass information to a servlet during initialization.
 *
 * @see javax.servlet.ServletConfig
 */
public interface ServletConfig extends javax.servlet.ServletConfig{

    public String               getServletName();
    public ServletContext       getServletContext();
    public String               getInitParameter(String name);
    public Enumeration<String>  getInitParameterNames();

}