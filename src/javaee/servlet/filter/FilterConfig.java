package javaee.servlet.filter;

import javax.servlet.ServletContext;
import java.util.Enumeration;

/**
 * A filter configuration object used by a servlet container to pass information
 * to a filter during initialization.
 *
 * @see javax.servlet.Filter#init(javax.servlet.FilterConfig)
 * @see javax.servlet.FilterConfig
 */
public interface FilterConfig extends javax.servlet.FilterConfig {

    public String getFilterName();
    public ServletContext getServletContext();
    public String getInitParameter(String name);
    public Enumeration<String> getInitParameterNames();

}
