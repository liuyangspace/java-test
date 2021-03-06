package javase.data.object.clazz.throwable.exception;

import java.lang.RuntimeException;

/**
 * Thrown to indicate that an index of some sort (such as to an array, to a
 * string, or to a vector) is out of range.
 * <p>
 * Applications can subclass this class to indicate similar exceptions.
 *
 * @see java.lang.IndexOutOfBoundsException
 */
public class IndexOutOfBoundsException  extends RuntimeException {
    private static final long serialVersionUID = 234122996006267687L;

    /**
     * Constructs an {@code IndexOutOfBoundsException} with no detail message.
     */
    public IndexOutOfBoundsException() {
        super();
    }

    /**
     * Constructs an {@code IndexOutOfBoundsException} with the specified detail
     * message.
     *
     * @param s the detail message
     */
    public IndexOutOfBoundsException(String s) {
        super(s);
    }

    /**
     * Constructs a new {@code IndexOutOfBoundsException} class with an
     * argument indicating the illegal index.
     *
     * <p>The index is included in this exception's detail message.  The
     * exact presentation format of the detail message is unspecified.
     *
     * @param index the illegal index.
     * @since 9
     */
    public IndexOutOfBoundsException(int index) {
        super("Index out of range: " + index);
    }
}
