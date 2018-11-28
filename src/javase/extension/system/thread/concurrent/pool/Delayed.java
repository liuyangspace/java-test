package javase.extension.system.thread.concurrent.pool;

import java.util.concurrent.TimeUnit;

/**
 * A mix-in style interface for marking objects that should be acted upon after a given delay.
 *
 * @see java.util.concurrent.Delayed
 */
public interface Delayed extends Comparable<java.util.concurrent.Delayed> {
    long getDelay(TimeUnit unit);
}
