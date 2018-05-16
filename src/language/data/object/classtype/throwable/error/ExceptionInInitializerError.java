package language.data.object.classtype.throwable.error;

import java.lang.LinkageError;

/**
 * @see java.lang.ExceptionInInitializerError
 */
public class ExceptionInInitializerError extends LinkageError {
    /**
     * Use serialVersionUID from JDK 1.1.X for interoperability
     */
    private static final long serialVersionUID = 1521711792217232256L;

    /**
     * This field holds the exception if the
     * ExceptionInInitializerError(Throwable thrown) constructor was
     * used to instantiate the object
     *
     * @serial
     *
     */
    private Throwable exception;

    /**
     * Constructs an <code>ExceptionInInitializerError</code> with
     * <code>null</code> as its detail message string and with no saved
     * throwable object.
     * A detail message is a String that describes this particular exception.
     */
    public ExceptionInInitializerError() {
        initCause(null);  // Disallow subsequent initCause
    }

    /**
     * Constructs a new <code>ExceptionInInitializerError</code> class by
     * saving a reference to the <code>Throwable</code> object thrown for
     * later retrieval by the {@link #getException()} method. The detail
     * message string is set to <code>null</code>.
     *
     * @param thrown The exception thrown
     */
    public ExceptionInInitializerError(Throwable thrown) {
        initCause(null);  // Disallow subsequent initCause
        this.exception = thrown;
    }

    /**
     * Constructs an ExceptionInInitializerError with the specified detail
     * message string.  A detail message is a String that describes this
     * particular exception. The detail message string is saved for later
     * retrieval by the {@link Throwable#getMessage()} method. There is no
     * saved throwable object.
     *
     *
     * @param s the detail message
     */
    public ExceptionInInitializerError(String s) {
        super(s);
        initCause(null);  // Disallow subsequent initCause
    }

    /**
     * Returns the exception that occurred during a static initialization that
     * caused this error to be created.
     *
     * <p>This method predates the general-purpose exception chaining facility.
     * The {@link Throwable#getCause()} method is now the preferred means of
     * obtaining this information.
     *
     * @return the saved throwable object of this
     *         <code>ExceptionInInitializerError</code>, or <code>null</code>
     *         if this <code>ExceptionInInitializerError</code> has no saved
     *         throwable object.
     */
    public Throwable getException() {
        return exception;
    }

    /**
     * Returns the cause of this error (the exception that occurred
     * during a static initialization that caused this error to be created).
     *
     * @return  the cause of this error or <code>null</code> if the
     *          cause is nonexistent or unknown.
     * @since   1.4
     */
    public Throwable getCause() {
        return exception;
    }
}