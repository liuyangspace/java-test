package javase.data.object.clazz.throwable.error;

import java.lang.Error;

/**
 * @see java.lang.InternalError
 */
public class InternalError extends Error
{
    private static final long serialVersionUID = -9062593416125562365L;
    public InternalError() {
        super();
    }
    public InternalError(String message) { super(message); }
    public InternalError(String message, Throwable cause) { super(message, cause); }
    public InternalError(Throwable cause) {
        super(cause);
    }
}
