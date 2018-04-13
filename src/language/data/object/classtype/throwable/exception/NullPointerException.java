package language.data.object.classtype.throwable.exception;

import java.lang.RuntimeException;

/**
 *
 *
 * @see java.lang.NullPointerException
 */
public class NullPointerException extends RuntimeException
{
    private static final long serialVersionUID = 5162710183389028792L;

    public NullPointerException() {
        super();
    }
    public NullPointerException(String s) {
        super(s);
    }
}
