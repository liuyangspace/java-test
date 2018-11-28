package javase.data.object.clazz.throwable.error;

/**
 * An {@code Error} is a subclass of {@code Throwable}
 * that indicates serious problems that a reasonable application
 * should not try to catch.
 *
 * @see java.lang.Error
 */
public class Error extends java.lang.Error // extends Throwable
{
    static final long serialVersionUID = 4980196508277280342L;

    public Error() {
        super();
    }
    public Error(String message) {
        super(message);
    }
    public Error(String message, Throwable cause) {
        super(message, cause);
    }
    public Error(Throwable cause) {
        super(cause);
    }
    protected Error(String message, Throwable cause, boolean enableSuppression, boolean writableStackTrace) {
        super(message, cause, enableSuppression, writableStackTrace);
    }
}
