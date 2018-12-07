package javaee.servlet.throwable;

import javax.servlet.Servlet;

/**
 * Defines an exception that a servlet or filter throws to indicate that it is
 * permanently or temporarily unavailable.
 *
 * @see javax.servlet.UnavailableException
 */
public class UnavailableException extends javax.servlet.UnavailableException {

    public UnavailableException(String msg) { super(msg); }
    public UnavailableException(String msg, int seconds) { super(msg, seconds); }
    @Deprecated public UnavailableException(Servlet servlet, String msg) { super(servlet, msg); }
    @Deprecated public UnavailableException(int seconds, Servlet servlet, String msg) { super(seconds, servlet, msg); }

    public boolean isPermanent() { return super.isPermanent(); }
    @Deprecated public Servlet getServlet() { return super.getServlet(); }
    public int getUnavailableSeconds() { return super.getUnavailableSeconds(); }

}
