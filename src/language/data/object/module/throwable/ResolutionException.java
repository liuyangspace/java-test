package language.data.object.module.throwable;

/**
 * @see java.lang.module.ResolutionException
 */
public class ResolutionException extends RuntimeException
{
    private static final long serialVersionUID = -1031186845316729450L;
    public ResolutionException() { }
    public ResolutionException(String msg) {
        super(msg);
    }
    public ResolutionException(Throwable cause) {
        super(cause);
    }
    public ResolutionException(String msg, Throwable cause) {
        super(msg, cause);
    }
}
