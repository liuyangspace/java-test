package language.data.object.classtype.throwable.error;

import java.lang.LinkageError;

/**
 * Thrown when an incompatible class change has occurred to some class
 * definition.
 *
 * @see java.lang.IncompatibleClassChangeError
 */
public class IncompatibleClassChangeError extends LinkageError {
    private static final long serialVersionUID = -4914975503642802119L;

    /**
     * Constructs an <code>IncompatibleClassChangeError</code> with no
     * detail message.
     */
    public IncompatibleClassChangeError () {
        super();
    }

    /**
     * Constructs an <code>IncompatibleClassChangeError</code> with the
     * specified detail message.
     *
     * @param   s   the detail message.
     */
    public IncompatibleClassChangeError(String s) {
        super(s);
    }
}
