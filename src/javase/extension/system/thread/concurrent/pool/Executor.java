package javase.extension.system.thread.concurrent.pool;

/** 线程池工具类
 * An object that executes submitted {@link Runnable} tasks. This
 * interface provides a way of decoupling task submission from the
 * mechanics of how each task will be run, including details of thread
 * use, scheduling, etc.  An {@code Executor} is normally used
 * instead of explicitly creating threads. For example, rather than
 * invoking {@code new Thread(new RunnableTask()).start()} for each
 * of a set of tasks, you might use:
 *
 * @see java.util.concurrent.Executor
 * @see java.util.concurrent.Executors
 * @see java.util.concurrent.ExecutorService
 * @see java.util.concurrent.ThreadPoolExecutor
 */
public interface Executor {
    void execute(Runnable command);
}
