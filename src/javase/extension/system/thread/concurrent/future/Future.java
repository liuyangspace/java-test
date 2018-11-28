package javase.extension.system.thread.concurrent.future;

import javase.extension.system.thread.concurrent.TimeUnit;

import java.util.concurrent.*;
import java.util.concurrent.FutureTask;

/**
 * A {@code Future} represents the result of an asynchronous computation.
 *
 * <pre> {@code
 * interface ArchiveSearcher { String search(String target); }
 * class App {
 *   ExecutorService executor = ...
 *   ArchiveSearcher searcher = ...
 *   void showSearch(String target) throws InterruptedException {
 *     Callable<String> task = () -> searcher.search(target);
 *     Future<String> future = executor.submit(task);
 *     displayOtherThings(); // do other things while searching
 *     try {
 *       displayText(future.get()); // use future
 *     } catch (ExecutionException ex) { cleanup(); return; }
 *   }
 * }}</pre>
 *
 * @see java.util.concurrent.Future
 * @see java.util.concurrent.ExecutorService#submit
 * @see FutureTask
 * @see Executor
 */
public interface Future<V> {
    boolean cancel(boolean mayInterruptIfRunning);
    boolean isCancelled();
    boolean isDone();
    V get() throws InterruptedException, ExecutionException;
    V get(long timeout, TimeUnit unit) throws InterruptedException, ExecutionException, TimeoutException;
}
