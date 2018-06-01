package language.extension.math.throwable;

/**
 * Thrown when an exceptional arithmetic condition has occurred. For
 * example, an integer "divide by zero" throws an
 * instance of this class.
 *
 * @see java.lang.ArithmeticException
 */
public class ArithmeticException extends RuntimeException {
    private static final long serialVersionUID = 2256477558314496007L;

    /**
     * Constructs an {@code ArithmeticException} with no detail
     * message.
     */
    public ArithmeticException() {
        super();
    }

    /**
     * Constructs an {@code ArithmeticException} with the specified
     * detail message.
     *
     * @param   s   the detail message.
     */
    public ArithmeticException(String s) {
        super(s);
    }
}
