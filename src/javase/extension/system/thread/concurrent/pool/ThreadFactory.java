package javase.extension.system.thread.concurrent.pool;

/**
 * An object that creates new threads on demand.  Using thread factories
 * removes hardwiring of calls to {@link Thread#Thread(Runnable) new Thread},
 * enabling applications to use special thread subclasses, priorities, etc.
 *
 * <p>
 * The simplest implementation of this interface is just:
 * <pre> {@code
 * class SimpleThreadFactory implements ThreadFactory {
 *   public Thread newThread(Runnable r) {
 *     return new Thread(r);
 *   }
 * }}</pre>
 *
 * @see java.util.concurrent.ThreadFactory
 * @see java.util.concurrent.Executors#defaultThreadFactory
 */
public interface ThreadFactory {
    Thread newThread(Runnable r);
}
