package javase.extension.system.thread.concurrent.future;

import java.util.concurrent.Executor;
import java.util.concurrent.Future;
import java.util.concurrent.FutureTask;

/**
 * @see java.util.concurrent.RunnableFuture
 * @see FutureTask
 * @see Executor
 */
public interface RunnableFuture<V> extends Runnable, Future<V> {
    void run();
}
