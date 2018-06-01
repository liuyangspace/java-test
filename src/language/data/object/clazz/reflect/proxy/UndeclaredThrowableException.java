package language.data.object.clazz.reflect.proxy;

/**
 * @see java.lang.reflect.UndeclaredThrowableException;
 */
public class UndeclaredThrowableException extends RuntimeException  {
    static final long serialVersionUID = 330127114055056639L;

    /**
     * the undeclared checked exception that was thrown
     * @serial
     */
    private Throwable undeclaredThrowable;

    /**
     * Constructs an {@code UndeclaredThrowableException} with the
     * specified {@code Throwable}.
     *
     * @param   undeclaredThrowable the undeclared checked exception
     *          that was thrown
     */
    public UndeclaredThrowableException(Throwable undeclaredThrowable) {
        super((Throwable) null);  // Disallow initCause
        this.undeclaredThrowable = undeclaredThrowable;
    }

    /**
     * Constructs an {@code UndeclaredThrowableException} with the
     * specified {@code Throwable} and a detail message.
     *
     * @param   undeclaredThrowable the undeclared checked exception
     *          that was thrown
     * @param   s the detail message
     */
    public UndeclaredThrowableException(Throwable undeclaredThrowable,
                                        String s)
    {
        super(s, null);  // Disallow initCause
        this.undeclaredThrowable = undeclaredThrowable;
    }

    /**
     * Returns the {@code Throwable} instance wrapped in this
     * {@code UndeclaredThrowableException}, which may be {@code null}.
     *
     * <p>This method predates the general-purpose exception chaining facility.
     * The {@link Throwable#getCause()} method is now the preferred means of
     * obtaining this information.
     *
     * @return the undeclared checked exception that was thrown
     */
    public Throwable getUndeclaredThrowable() {
        return undeclaredThrowable;
    }

    /**
     * Returns the cause of this exception (the {@code Throwable}
     * instance wrapped in this {@code UndeclaredThrowableException},
     * which may be {@code null}).
     *
     * @return  the cause of this exception.
     * @since   1.4
     */
    public Throwable getCause() {
        return undeclaredThrowable;
    }
}
