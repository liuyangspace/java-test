package language.data.object.classtype.throwable.error;

/**
 * Thrown when an application tries to call an abstract method.
 *
 * @see java.lang.AbstractMethodError
 */
public class AbstractMethodError extends IncompatibleClassChangeError{
    private static final long serialVersionUID = -1654391082989018462L;

    /**
     * Constructs an <code>AbstractMethodError</code> with no detail  message.
     */
    public AbstractMethodError() {
        super();
    }

    /**
     * Constructs an <code>AbstractMethodError</code> with the specified
     * detail message.
     *
     * @param   s   the detail message.
     */
    public AbstractMethodError(String s) {
        super(s);
    }
}
