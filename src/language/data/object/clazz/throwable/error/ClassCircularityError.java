package language.data.object.clazz.throwable.error;

import java.lang.LinkageError;

/**
 * Thrown when the Java Virtual Machine detects a circularity in the
 * superclass hierarchy of a class being loaded.
 *
 * @see java.lang.ClassFormatError
 */
public class ClassCircularityError extends LinkageError {
    private static final long serialVersionUID = 1054362542914539689L;

    /**
     * Constructs a {@code ClassCircularityError} with no detail message.
     */
    public ClassCircularityError() {
        super();
    }

    /**
     * Constructs a {@code ClassCircularityError} with the specified detail
     * message.
     *
     * @param  s
     *         The detail message
     */
    public ClassCircularityError(String s) {
        super(s);
    }
}
