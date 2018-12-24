package javaee.jsp;

import javax.el.ELContextListener;
import javax.el.ELResolver;
import javax.el.ExpressionFactory;

/**
 * Stores <i>application</i>-scoped information for the JSP container
 *
 * @see javax.servlet.jsp.JspApplicationContext
 */
public interface JspApplicationContext extends javax.servlet.jsp.JspApplicationContext {

    public void addELContextListener(ELContextListener listener);
    public void addELResolver(ELResolver resolver) throws IllegalStateException;
    public ExpressionFactory getExpressionFactory();

}
