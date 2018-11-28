package javase.extension.system.thread.concurrent.pool;

import java.util.Collection;
import java.util.List;
import java.util.concurrent.*;
import java.util.concurrent.Executor;

/**
 * An {@link Executor} that provides methods to manage termination and
 * methods that can produce a {@link Future} for tracking progress of
 * one or more asynchronous tasks.
 * <pre> {@code
 *      ExecutorService pool = Executors.newFixedThreadPool(poolSize);
 *      ServerSocket serverSocket = new ServerSocket(port);
 *      pool.execute(new Runnable(){
 *          private final Socket socket;
 *          Handler(Socket socket) { this.socket = socket; }
 *          public void run() {
 *              // read and service request on socket
 *          }
 *      });
 * }</pre>
 * @see java.util.concurrent.ExecutorService
 * @see java.util.concurrent.Future
 * @see java.util.concurrent.Executors
 */
public interface ExecutorService extends Executor {

    void shutdown();
    List<Runnable> shutdownNow();
    boolean isShutdown();
    boolean isTerminated();

    boolean awaitTermination(long timeout, TimeUnit unit) throws InterruptedException;

    <T> Future<T> submit(Callable<T> task);
    <T> Future<T> submit(Runnable task, T result);
    Future<?> submit(Runnable task);
    <T> List<Future<T>> invokeAll(Collection<? extends Callable<T>> tasks) throws InterruptedException;

    <T> List<Future<T>> invokeAll(Collection<? extends Callable<T>> tasks, long timeout, TimeUnit unit) throws InterruptedException;
    <T> T invokeAny(Collection<? extends Callable<T>> tasks) throws InterruptedException, ExecutionException;
    <T> T invokeAny(Collection<? extends Callable<T>> tasks, long timeout, TimeUnit unit) throws InterruptedException, ExecutionException, TimeoutException;

}
