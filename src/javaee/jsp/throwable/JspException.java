package javaee.jsp.throwable;

/**
 * A generic exception known to the JSP engine; uncaught
 * JspExceptions will result in an invocation of the errorpage
 * machinery.
 * @see javax.servlet.jsp.JspException
 */
public class JspException  extends Exception {
    /**
     * Construct a JspException.
     */
    public JspException() {
        // NOOP
    }


    /**
     * Constructs a new JSP exception with the
     * specified message. The message can be written
     * to the server log and/or displayed for the user.
     *
     * @param msg   a <code>String</code> specifying the text of the exception
     *              message
     */
    public JspException(String msg) {
        super(msg);
    }


    /**
     * Constructs a new <code>JSPException</code> with the specified detail
     * message and cause. The cause is saved for later retrieval by the
     * <code>java.lang.Throwable.getCause()</code> and {@link #getRootCause()}
     * methods.
     *
     * @see java.lang.Exception#Exception(String, Throwable)
     *
     * @param message       a <code>String</code> containing the text of the
     *                      exception message
     *
     * @param cause         the <code>Throwable</code> exception that
     *                      interfered with the JSP's normal operation,
     *                      making this JSP exception necessary
     */

    public JspException(String message, Throwable cause) {
        super(message, cause);
    }


    /**
     * Constructs a new <code>JSPException</code> with the specified cause.
     * The cause is saved for later retrieval by the
     * <code>java.lang.Throwable.getCause()</code> and {@link #getRootCause()}
     * methods.
     *
     * @see java.lang.Exception#Exception(Throwable)
     *
     * @param cause         the <code>Throwable</code> exception that
     *                      interfered with the JSP's normal operation, making
     *                      the JSP exception necessary
     */

    public JspException(Throwable cause) {
        super(cause);
    }


    /**
     * Returns the exception that caused this JSP exception.
     *
     * @return  the <code>Throwable</code> that caused this JSP exception
     *
     * @deprecated As of JSP 2.1, replaced by
     * <code>java.lang.Throwable.getCause()</code>
     */
    @SuppressWarnings("dep-ann") // TCK signature test fails with annotation
    public Throwable getRootCause() {
        return getCause();
    }
}
