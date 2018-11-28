package javase.extension.system.thread.concurrent.throwable;

import java.util.concurrent.FutureTask;

/**
 * Exception indicating that the result of a value-producing task,
 * such as a {@link FutureTask}, cannot be retrieved because the task
 * was cancelled.
 *
 * @see java.util.concurrent.CancellationException
 */
public class CancellationException extends IllegalStateException {
    private static final long serialVersionUID = -9202173006928992231L;

    /**
     * Constructs a {@code CancellationException} with no detail message.
     */
    public CancellationException() {}

    /**
     * Constructs a {@code CancellationException} with the specified detail
     * message.
     *
     * @param message the detail message
     */
    public CancellationException(String message) {
        super(message);
    }
}
