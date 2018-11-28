package javase.data.object.clazz.throwable.error;

import java.lang.IncompatibleClassChangeError;

/**
 * @see java.lang.IllegalAccessError
 */
public class IllegalAccessError extends IncompatibleClassChangeError {
    private static final long serialVersionUID = -8988904074992417891L;

    /**
     * Constructs an <code>IllegalAccessError</code> with no detail message.
     */
    public IllegalAccessError() {
        super();
    }

    /**
     * Constructs an <code>IllegalAccessError</code> with the specified
     * detail message.
     *
     * @param   s   the detail message.
     */
    public IllegalAccessError(String s) {
        super(s);
    }
}
