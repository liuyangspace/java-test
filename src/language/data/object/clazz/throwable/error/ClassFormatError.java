package language.data.object.clazz.throwable.error;

import java.lang.LinkageError;

/**
 * @see java.lang.ClassFormatError
 */
public class ClassFormatError extends LinkageError {
    private static final long serialVersionUID = -8420114879011949195L;

    /**
     * Constructs a <code>ClassFormatError</code> with no detail message.
     */
    public ClassFormatError() {
        super();
    }

    /**
     * Constructs a <code>ClassFormatError</code> with the specified
     * detail message.
     *
     * @param   s   the detail message.
     */
    public ClassFormatError(String s) {
        super(s);
    }
}
