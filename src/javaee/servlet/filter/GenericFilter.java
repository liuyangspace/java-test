package javaee.servlet.filter;

import javax.servlet.Filter;
import javax.servlet.FilterConfig;
import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import java.io.Serializable;
import java.util.Enumeration;

/**
 * @see javax.servlet.GenericFilter
 */
public abstract class GenericFilter extends  javax.servlet.GenericFilter implements Filter, FilterConfig, Serializable {

    @Override public String getInitParameter(String name) { return getFilterConfig().getInitParameter(name); }
    @Override public Enumeration<String> getInitParameterNames() { return getFilterConfig().getInitParameterNames(); }

    public FilterConfig getFilterConfig() { return super.getFilterConfig(); }
    @Override public ServletContext getServletContext() { return getFilterConfig().getServletContext(); }

    @Override public void init(FilterConfig filterConfig) throws ServletException { super.init(filterConfig); }
    public void init() throws ServletException { /* NO-OP */ }

    @Override public String getFilterName() { return getFilterConfig().getFilterName(); }

}
