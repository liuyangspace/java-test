package javase.extension.system.thread;

/**
 * The <code>Runnable</code> interface should be implemented by any
 * class whose instances are intended to be executed by a thread. The
 * class must define a method of no arguments called <code>run</code>.
 *
 * @see     java.lang.Runnable
 * @see     java.lang.Thread
 * @see     java.util.concurrent.Callable
 */
public interface Runnable {
    public abstract void run();
}
