package javaee.jsp;

/**
 * The JspEngineInfo is an abstract class that provides information on the
 * current JSP engine.
 *
 * @see javax.servlet.jsp.JspEngineInfo
 */
public abstract class JspEngineInfo {

    public JspEngineInfo() { /* NOOP by default */ }
    public abstract String getSpecificationVersion();

}
