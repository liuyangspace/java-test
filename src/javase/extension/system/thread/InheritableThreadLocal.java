package javase.extension.system.thread;

/**
 * This class extends {@code ThreadLocal} to provide inheritance of values
 * from parent thread to child thread: when a child thread is created, the
 * child receives initial values for all inheritable thread-local variables
 * for which the parent has values.
 *
 * @see java.lang.InheritableThreadLocal
 */
public class InheritableThreadLocal<T> extends java.lang.InheritableThreadLocal<T> // extends ThreadLocal<T>
{
    protected T childValue(T parentValue) { return parentValue; }
}
