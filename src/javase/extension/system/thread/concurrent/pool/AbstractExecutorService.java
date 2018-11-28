package javase.extension.system.thread.concurrent.pool;

import java.util.Collection;
import java.util.List;
import java.util.concurrent.*;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.ThreadPoolExecutor;

/**
 * Provides default implementations of {@link ExecutorService}
 * execution methods. This class implements the {@code submit},
 * {@code invokeAny} and {@code invokeAll} methods using a
 * {@link RunnableFuture} returned by {@code newTaskFor}, which defaults
 * to the {@link FutureTask} class provided in this package.
 *
 * <p><b>Extension example</b>. Here is a sketch of a class that customizes {@link ThreadPoolExecutor} to use
 * a {@code CustomTask} class instead of the default {@code FutureTask}:
 * <pre> {@code
 * public class CustomThreadPoolExecutor extends ThreadPoolExecutor {
 *
 *   static class CustomTask<V> implements RunnableFuture<V> {...}
 *
 *   protected <V> RunnableFuture<V> newTaskFor(Callable<V> c) { return new CustomTask<V>(c); }
 *   protected <V> RunnableFuture<V> newTaskFor(Runnable r, V v) { return new CustomTask<V>(r, v); }
 *   // ... add constructors, etc.
 * }}</pre>
 *
 * @see java.util.concurrent.AbstractExecutorService
 */
public abstract class AbstractExecutorService extends java.util.concurrent.AbstractExecutorService implements ExecutorService {

    protected <T> RunnableFuture<T> newTaskFor(Runnable runnable, T value) { return new FutureTask<T>(runnable, value); }
    protected <T> RunnableFuture<T> newTaskFor(Callable<T> callable){ return new FutureTask<T>(callable); }

    public Future<?> submit(Runnable task){return super.submit(task);}
    public <T> Future<T> submit(Runnable task, T result){return super.submit(task,result);}
    public <T> Future<T> submit(Callable<T> task){return super.submit(task);}

    public <T> T invokeAny(Collection<? extends Callable<T>> tasks) throws InterruptedException, ExecutionException {return super.invokeAny(tasks);}
    public <T> T invokeAny(Collection<? extends Callable<T>> tasks, long timeout, TimeUnit unit) throws InterruptedException, ExecutionException, TimeoutException
        {return super.invokeAny(tasks,timeout,unit);}
    public <T> List<Future<T>> invokeAll(Collection<? extends Callable<T>> tasks) throws InterruptedException {return super.invokeAll(tasks);}
    public <T> List<Future<T>> invokeAll(Collection<? extends Callable<T>> tasks, long timeout, TimeUnit unit) throws InterruptedException
        {return super.invokeAll(tasks,timeout,unit);}

}
