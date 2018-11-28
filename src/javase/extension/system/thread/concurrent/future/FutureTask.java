package javase.extension.system.thread.concurrent.future;

import java.util.concurrent.*;
import java.util.concurrent.Future;
import java.util.concurrent.RunnableFuture;

/**
 * A cancellable asynchronous computation.  This class provides a base
 * implementation of {@link Future}, with methods to start and cancel
 * a computation, query to see if the computation is complete, and
 * retrieve the result of the computation.
 *
 * @see java.util.concurrent.FutureTask
 */
public class FutureTask<V> extends java.util.concurrent.FutureTask<V> implements RunnableFuture<V> {

    public FutureTask(Callable<V> callable) { super(callable); }
    public FutureTask(Runnable runnable, V result) { super(runnable, result); }

    public boolean isCancelled(){return super.isCancelled();}
    public boolean isDone(){return super.isDone();}
    public boolean cancel(boolean mayInterruptIfRunning){return super.cancel(mayInterruptIfRunning);}
    public V get() throws InterruptedException, ExecutionException{return super.get();}
    public V get(long timeout, TimeUnit unit) throws InterruptedException, ExecutionException, TimeoutException {return super.get(timeout,unit);}

    protected void done() { }
    protected void set(V v) {super.set(v);}
    protected void setException(Throwable t){super.setException(t);}

    public void run() {super.run();}
    protected boolean runAndReset() {return super.runAndReset();}

}
