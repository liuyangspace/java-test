package language.data.object.classtype.throwable;

import java.io.PrintStream;
import java.io.PrintWriter;
import java.io.Serializable;
import java.util.Collections;
import java.util.List;

/**
 * The {@code Throwable} class is the superclass of all errors and
 * exceptions in the Java language.
 *
 * @see java.lang.Throwable
 * @see java.lang.Error
 * @see java.lang.Exception
 */
public class Throwable extends java.lang.Throwable implements Serializable
{
    private static final long serialVersionUID = -3042686055658047285L;
    private transient Object backtrace;
    private String detailMessage;
    private java.lang.Throwable cause = this;
    private static final StackTraceElement[] UNASSIGNED_STACK = new StackTraceElement[0];
    private StackTraceElement[] stackTrace = UNASSIGNED_STACK;
    private transient int depth;
    private static final List<java.lang.Throwable> SUPPRESSED_SENTINEL = Collections.emptyList();
    private List<java.lang.Throwable> suppressedExceptions = SUPPRESSED_SENTINEL;
    /** Message for trying to suppress a null exception. */
    private static final String NULL_CAUSE_MESSAGE = "Cannot suppress a null exception.";
    /** Message for trying to suppress oneself. */
    private static final String SELF_SUPPRESSION_MESSAGE = "Self-suppression not permitted";
    /** Caption  for labeling causative exception stack traces */
    private static final String CAUSE_CAPTION = "Caused by: ";
    /** Caption for labeling suppressed exception stack traces */
    private static final String SUPPRESSED_CAPTION = "Suppressed: ";

    public Throwable() {
        fillInStackTrace();
    }
    public Throwable(String message) { fillInStackTrace(); detailMessage = message; }
    public Throwable(String message, java.lang.Throwable cause) { fillInStackTrace(); detailMessage = message; this.cause = cause; }
    public Throwable(java.lang.Throwable cause) { fillInStackTrace(); detailMessage = (cause==null ? null : cause.toString()); this.cause = cause; }
    protected Throwable(String message, java.lang.Throwable cause, boolean enableSuppression, boolean writableStackTrace) {super(message,cause,enableSuppression,writableStackTrace);}

    public String getMessage() {
        return detailMessage;
    }
    public String getLocalizedMessage() {
        return getMessage();
    }
    public synchronized java.lang.Throwable getCause() { return (cause==this ? null : cause); }
    public synchronized java.lang.Throwable initCause(java.lang.Throwable cause) {return super.initCause(cause);}
    public String toString() {return super.toString();}
    public void printStackTrace() {
        printStackTrace(System.err);
    }
    public void printStackTrace(PrintStream s) {
        super.printStackTrace(s);
    }
    public void printStackTrace(PrintWriter s) {
        super.printStackTrace(s);
    }
    public synchronized java.lang.Throwable fillInStackTrace() {return super.fillInStackTrace();}
    public java.lang.StackTraceElement[] getStackTrace() { return super.getStackTrace(); }
    public void setStackTrace(java.lang.StackTraceElement[] stackTrace) {super.setStackTrace(stackTrace);}
    // public final synchronized void addSuppressed(java.lang.Throwable exception) {}

}
