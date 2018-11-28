package javase.extension.system.thread.concurrent.future;

import java.util.concurrent.Delayed;
import java.util.concurrent.Future;
import java.util.concurrent.ScheduledExecutorService;

/**
 * A delayed result-bearing action that can be cancelled.
 * Usually a scheduled future is the result of scheduling
 * a task with a {@link ScheduledExecutorService}.
 *
 * @see java.util.concurrent.ScheduledFuture
 * @param <V>
 */
public interface ScheduledFuture<V> extends Delayed, Future<V> {

}
