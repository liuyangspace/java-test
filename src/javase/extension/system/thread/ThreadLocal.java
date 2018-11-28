package javase.extension.system.thread;

import java.util.function.Supplier;

/**
 * This class provides thread-local variables.(线程安全局部变量)
 *  # 内部存储为 key -> value 对，key为当前线程标识，value为线程局部变量
 * <pre>
 * import java.util.concurrent.atomic.AtomicInteger;
 * public class ThreadId {
 *     // Atomic integer containing the next thread ID to be assigned
 *     private static final AtomicInteger nextId = new AtomicInteger(0);
 *
 *     // Thread local variable containing each thread's ID
 *     private static final ThreadLocal<Integer> threadId = new ThreadLocal<Integer> () {
 *          @Override protected Integer initialValue() { return nextId.getAndIncrement(); }
 *     };
 *
 *     // Returns the current thread's unique ID, assigning it if necessary
 *     public static int get() { return threadId.get(); }
 * }
 * </pre>
 *
 * @see java.lang.ThreadLocal
 */
public class ThreadLocal<T> extends java.lang.ThreadLocal<T> {
    public ThreadLocal() { }

    protected T initialValue() { return null; }
    public static <S> java.lang.ThreadLocal<S> withInitial(Supplier<? extends S> supplier) { return java.lang.ThreadLocal.withInitial(supplier); }

    public T get() {return super.get(); }
    public void set(T value){super.set(value); }
    public void remove(){super.remove(); }

}
