package language.data.object.classtype.throwable.error;

import java.lang.Error;

/**
 * Subclasses of {@code LinkageError} indicate that a class has
 * some dependency on another class; however, the latter class has
 * incompatibly changed after the compilation of the former class.
 *
 * @see java.lang.LinkageError
 */
public class LinkageError extends Error
{
    private static final long serialVersionUID = 3579600108157160122L;
    public LinkageError() {
        super();
    }
    public LinkageError(String s) {
        super(s);
    }
    public LinkageError(String s, Throwable cause) {
        super(s, cause);
    }
}
