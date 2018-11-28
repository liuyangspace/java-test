package javase.extension.system.thread.concurrent.pool;

import java.security.PrivilegedAction;
import java.security.PrivilegedExceptionAction;
import java.util.concurrent.Callable;
import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ThreadFactory;

/**
 * Factory and utility methods for {@link Executor}, {@link
 * java.util.concurrent.ExecutorService}, {@link ScheduledExecutorService}, {@link
 * ThreadFactory}, and {@link Callable} classes defined in this
 * package. This class supports the following kinds of methods:
 *
 * <ul>
 *   <li>Methods that create and return an {@link ExecutorService}
 *       set up with commonly useful configuration settings.
 *   <li>Methods that create and return a {@link ScheduledExecutorService}
 *       set up with commonly useful configuration settings.
 *   <li>Methods that create and return a "wrapped" ExecutorService, that
 *       disables reconfiguration by making implementation-specific methods
 *       inaccessible.
 *   <li>Methods that create and return a {@link ThreadFactory}
 *       that sets newly created threads to a known state.
 *   <li>Methods that create and return a {@link Callable}
 *       out of other closure-like forms, so they can be used
 *       in execution methods requiring {@code Callable}.
 * </ul>
 *
 * newFixedThreadPool : 固定个数的线程池
 * newCachedThreadPool : 缓存线程池，开始线程数0
 *         如果需要线程，当前线程池没有，那么创建线程池
 *         如果需要线程，线程池中有没有使用的线程，那么使用已经存在的线程
 *         如果线程池中线程超过60秒(默认)没有使用，那么该线程停止
 * newSingleThreadExecutor : 只有1个线程的线程池
 *         保证线程执行的先后顺序
 * ScheduledPool
 *          和DelayedQueue类似,定时执行
 * newWorkStealingPool : WorkStealingPool(任务窃取，都是守护线程)
 *          每个线程都有要处理的队列中的任务，如果其中的线程完成自己队列中的任务，
 *          那么它可以去其他线程中获取其他线程的任务去执行
 *
 * @see java.util.concurrent.Executors
 * @see java.util.concurrent.Executor
 * @see java.util.concurrent.ExecutorService
 * @see java.util.concurrent.ScheduledExecutorService
 * @see java.util.concurrent.ThreadFactory
 * @see java.util.concurrent.Callable
 */
public class Executors {

    public static ExecutorService newFixedThreadPool(int nThreads){return java.util.concurrent.Executors.newFixedThreadPool(nThreads);}
    public static ExecutorService newFixedThreadPool(int nThreads, ThreadFactory threadFactory) {return java.util.concurrent.Executors.newFixedThreadPool(nThreads,threadFactory);}
    public static ExecutorService newWorkStealingPool(){return java.util.concurrent.Executors.newWorkStealingPool();}
    public static ExecutorService newWorkStealingPool(int parallelism){return java.util.concurrent.Executors.newWorkStealingPool(parallelism);}
    public static ExecutorService newSingleThreadExecutor() {return java.util.concurrent.Executors.newSingleThreadExecutor();}
    public static ExecutorService newSingleThreadExecutor(ThreadFactory threadFactory) {return java.util.concurrent.Executors.newSingleThreadExecutor(threadFactory);}
    public static ExecutorService newCachedThreadPool() {return java.util.concurrent.Executors.newCachedThreadPool();}
    public static ExecutorService newCachedThreadPool(ThreadFactory threadFactory){return java.util.concurrent.Executors.newCachedThreadPool(threadFactory);}
    public static ExecutorService unconfigurableExecutorService(ExecutorService executor) {return java.util.concurrent.Executors.unconfigurableExecutorService(executor);}

    public static ScheduledExecutorService newSingleThreadScheduledExecutor(){return java.util.concurrent.Executors.newSingleThreadScheduledExecutor();}
    public static ScheduledExecutorService newSingleThreadScheduledExecutor(ThreadFactory threadFactory){return java.util.concurrent.Executors.newSingleThreadScheduledExecutor(threadFactory);}
    public static ScheduledExecutorService newScheduledThreadPool(int corePoolSize){return java.util.concurrent.Executors.newScheduledThreadPool(corePoolSize);}
    public static ScheduledExecutorService newScheduledThreadPool(int corePoolSize, ThreadFactory threadFactory){return java.util.concurrent.Executors.newScheduledThreadPool(corePoolSize,threadFactory);}
    public static ScheduledExecutorService unconfigurableScheduledExecutorService(ScheduledExecutorService executor) {return java.util.concurrent.Executors.unconfigurableScheduledExecutorService(executor);}

    public static ThreadFactory defaultThreadFactory() { return java.util.concurrent.Executors.defaultThreadFactory(); }
    public static ThreadFactory privilegedThreadFactory() { return java.util.concurrent.Executors.privilegedThreadFactory(); }

    public static <T> Callable<T> callable(Runnable task, T result) {return java.util.concurrent.Executors.callable(task,result);}
    public static Callable<Object> callable(Runnable task) {return java.util.concurrent.Executors.callable(task);}
    public static Callable<Object> callable(final PrivilegedAction<?> action) {return java.util.concurrent.Executors.callable(action);}
    public static Callable<Object> callable(final PrivilegedExceptionAction<?> action) {return java.util.concurrent.Executors.callable(action);}
    public static <T> Callable<T> privilegedCallable(Callable<T> callable){return java.util.concurrent.Executors.privilegedCallable(callable);}
    public static <T> Callable<T> privilegedCallableUsingCurrentClassLoader(Callable<T> callable){return java.util.concurrent.Executors.privilegedCallableUsingCurrentClassLoader(callable);}

}
