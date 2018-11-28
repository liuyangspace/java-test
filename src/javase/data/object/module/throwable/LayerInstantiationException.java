package javase.data.object.module.throwable;

/**
 * @see java.lang.LayerInstantiationException
 */
public class LayerInstantiationException extends RuntimeException
{
    public LayerInstantiationException() { }
    public LayerInstantiationException(String msg) {
        super(msg);
    }
    public LayerInstantiationException(Throwable cause) {
        super(cause);
    }
    public LayerInstantiationException(String msg, Throwable cause) {
        super(msg, cause);
    }
}
