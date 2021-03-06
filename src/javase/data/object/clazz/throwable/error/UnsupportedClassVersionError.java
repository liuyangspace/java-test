package javase.data.object.clazz.throwable.error;

import java.lang.ClassFormatError;

/**
 * Thrown when the Java Virtual Machine attempts to read a class
 * file and determines that the major and minor version numbers
 * in the file are not supported.
 *
 * @see java.lang.UnsupportedClassVersionError
 */
public class UnsupportedClassVersionError  extends ClassFormatError {

    /**
     * Constructs a <code>UnsupportedClassVersionError</code>
     * with no detail message.
     */
    public UnsupportedClassVersionError() {
        super();
    }

    /**
     * Constructs a <code>UnsupportedClassVersionError</code> with
     * the specified detail message.
     *
     * @param   s   the detail message.
     */
    public UnsupportedClassVersionError(String s) {
        super(s);
    }

}
