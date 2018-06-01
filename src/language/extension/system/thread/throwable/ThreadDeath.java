package language.extension.system.thread.throwable;

import java.lang.Thread;

/**
 * An instance of {@code ThreadDeath} is thrown in the victim thread
 * when the (deprecated) {@link Thread#stop()} method is invoked.
 *
 * @see java.lang.ThreadDeath
 */
public class ThreadDeath extends Error{
}
