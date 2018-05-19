package language.extension.math.concurrent;

/**
 * A task that returns a result and may throw an exception.
 *
 * @see java.util.concurrent.Callable
 * @param <V>
 */
public interface Callable<V>
{
    V call() throws Exception;
}
