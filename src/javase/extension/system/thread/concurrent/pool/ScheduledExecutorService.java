package javase.extension.system.thread.concurrent.pool;

import java.util.concurrent.Callable;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;

/**
 * An {@link ExecutorService} that can schedule commands to run after a given
 * delay, or to execute periodically.
 *
 * Here is a class with a method that sets up a ScheduledExecutorService
 * to beep every ten seconds for an hour:
 * <pre> {@code
 * import static java.util.concurrent.TimeUnit.*;
 * class BeeperControl {
 *   private final ScheduledExecutorService scheduler = Executors.newScheduledThreadPool(1);
 *
 *   public void beepForAnHour() {
 *     Runnable beeper = () -> System.out.println("beep");
 *     ScheduledFuture<?> beeperHandle = scheduler.scheduleAtFixedRate(beeper, 10, 10, SECONDS);
 *     Runnable canceller = () -> beeperHandle.cancel(true);
 *     scheduler.schedule(canceller, 1, HOURS);
 *   }
 * }}</pre>
 *
 * @see java.util.concurrent.ScheduledExecutorService
 */
public interface ScheduledExecutorService extends ExecutorService  {

    public ScheduledFuture<?> schedule(Runnable command, long delay, TimeUnit unit);
    public <V> ScheduledFuture<V> schedule(Callable<V> callable, long delay, TimeUnit unit);
    public ScheduledFuture<?> scheduleAtFixedRate(Runnable command, long initialDelay, long period, TimeUnit unit);
    public ScheduledFuture<?> scheduleWithFixedDelay(Runnable command, long initialDelay, long delay, TimeUnit unit);

}
