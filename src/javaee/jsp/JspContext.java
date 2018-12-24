package javaee.jsp;

import javax.el.ELContext;
import javax.servlet.jsp.JspWriter;
import java.util.Enumeration;

/**
 * The JspContext provides a number of facilities to the page/component author and page implementor, including:
 *      1) a single API to manage the various scoped namespaces
 *      2) a mechanism to obtain the JspWriter for output
 *      3) a mechanism to expose page directive attributes to the scripting environment
 *      4) a mechanism to expose page directive attributes to the scripting environment
 * Methods Intended for Container Generated Code:
 *      JspWriter.pushBody()
 *      JspWriter.popBody()
 * Methods Intended for JSP authors:
 *      setAttribute()/getAttribute()
 *      findAttribute()/removeAttribute()
 *      getAttributesScope()
 *      getAttributeNamesInScope()
 * methods for convenient access:
 *      getOut()
 * methods for programmatic access:
 *      getExpressionEvaluator()
 *      getVariableResolver()
 * @see javax.servlet.jsp.JspContext
 */
public abstract class JspContext extends javax.servlet.jsp.JspContext {

    public JspContext() {/* NOOP by default */}

    //
    public abstract void setAttribute(String name, Object value);
    public abstract void setAttribute(String name, Object value, int scope);
    public abstract Object getAttribute(String name);
    public abstract Object getAttribute(String name, int scope);
    public abstract Object findAttribute(String name);
    public abstract void removeAttribute(String name);
    public abstract void removeAttribute(String name, int scope);
    public abstract int getAttributesScope(String name);
    public abstract Enumeration<String> getAttributeNamesInScope(int scope);
    public abstract JspWriter getOut();

    public abstract javax.servlet.jsp.el.ExpressionEvaluator getExpressionEvaluator();
    public abstract javax.servlet.jsp.el.VariableResolver getVariableResolver();

    public abstract ELContext getELContext();

    public JspWriter pushBody( java.io.Writer writer ) { return null; /* XXX to implement */ }
    public JspWriter popBody() { return null; /* XXX to implement */ }

}
