package javase.extension.system.thread.concurrent.pool;

import java.util.concurrent.ThreadPoolExecutor;

/**
 * A handler for tasks that cannot be executed by a {@link ThreadPoolExecutor}.
 *
 * @see java.util.concurrent.RejectedExecutionHandler
 * @see java.util.concurrent.ThreadPoolExecutor
 */
public interface RejectedExecutionHandler {
    /**
     * Method that may be invoked by a {@link ThreadPoolExecutor} when
     * {@link ThreadPoolExecutor#execute execute} cannot accept a
     * task.  This may occur when no more threads or queue slots are
     * available because their bounds would be exceeded, or upon
     * shutdown of the Executor.
     */
    void rejectedExecution(Runnable r, ThreadPoolExecutor executor);
}
