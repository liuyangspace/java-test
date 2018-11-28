package javase.data.object.clazz.throwable.exception;

import java.lang.RuntimeException;

/**
 * 类型转换异常
 *
 * @see java.lang.ClassCastException
 */
public class ClassCastException extends RuntimeException {
    private static final long serialVersionUID = -9223365651070458532L;

    /**
     * Constructs a <code>ClassCastException</code> with no detail message.
     */
    public ClassCastException() {
        super();
    }

    /**
     * Constructs a <code>ClassCastException</code> with the specified
     * detail message.
     *
     * @param   s   the detail message.
     */
    public ClassCastException(String s) {
        super(s);
    }
}
