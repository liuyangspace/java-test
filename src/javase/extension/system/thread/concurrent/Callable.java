package javase.extension.system.thread.concurrent;

/**
 * A task that returns a result and may throw an exception.
 * Implementors define a single method with no arguments called
 * {@code call}.
 *
 * @see java.util.concurrent.Callable
 */
@FunctionalInterface
public interface Callable<V> {
    V call() throws Exception;
}
