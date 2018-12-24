package javaee.jsp;

import javax.servlet.jsp.PageContext;

/**
 * Contains information about an error, for error pages. The information
 * contained in this instance is meaningless if not used in the context of an
 * error page. To indicate a JSP is an error page, the page author must set the
 * isErrorPage attribute of the page directive to "true".
 *
 * @see PageContext#getErrorData
 * @see javax.servlet.jsp.ErrorData
 */
public final class ErrorData {
    javax.servlet.jsp.ErrorData $this;

    public ErrorData(Throwable throwable, int statusCode, String uri, String servletName)
        { this.$this = new javax.servlet.jsp.ErrorData(throwable, statusCode, uri, servletName); }

    public Throwable getThrowable() { return $this.getThrowable(); }
    public int getStatusCode() { return $this.getStatusCode(); }
    public String getRequestURI() { return $this.getRequestURI(); }
    public String getServletName() { return $this.getServletName(); }

}
