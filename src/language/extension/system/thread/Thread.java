package language.extension.system.thread;

import java.lang.Runnable;
import java.lang.ThreadGroup;
import java.util.Map;

/**
 * A <i>thread</i> is a thread of execution in a program.
 * create:
 * <hr><blockquote><pre>
 *     class PrimeThread extends Thread {
 *         long minPrime;
 *         PrimeThread(long minPrime) {
 *             this.minPrime = minPrime;
 *         }
 *
 *         public void run() {
 *             // compute primes larger than minPrime
 *             &nbsp;.&nbsp;.&nbsp;.
 *         }
 *     }
 *     PrimeThread p = new PrimeThread(143);
 *     p.start();
 * </pre></blockquote><hr>
 * <hr><blockquote><pre>
 *     class PrimeRun implements Runnable {
 *         long minPrime;
 *         PrimeRun(long minPrime) {
 *             this.minPrime = minPrime;
 *         }
 *
 *         public void run() {
 *             // compute primes larger than minPrime
 *             &nbsp;.&nbsp;.&nbsp;.
 *         }
 *     }
 *     PrimeRun p = new PrimeRun(143);
 *     new Thread(p).start();
 * </pre></blockquote><hr>
 * @see java.lang.Thread
 * @see     Runnable
 * @see     Runtime#exit(int)
 * @see     #run()
 * @see     #stop()
 */
public class Thread extends java.lang.Thread implements Runnable{
    public static final int MIN_PRIORITY = 1;
    public static final int NORM_PRIORITY = 5;
    public static final int MAX_PRIORITY = 10;

    public Thread(){super();}
    public Thread(Runnable target){super(target);}
    public Thread(String name){super(name);}
    public Thread(ThreadGroup group, Runnable target){super(group,target);}
    public Thread(ThreadGroup group, String name){super(group,name);}
    public Thread(Runnable target, String name){super(target,name);}
    public Thread(ThreadGroup group, Runnable target, String name){super(group,target,name);}
    public Thread(ThreadGroup group, Runnable target, String name, long stackSize){super(group,target,name,stackSize);}
    public Thread(ThreadGroup group, Runnable target, String name, long stackSize, boolean inheritThreadLocals){super(group,target,name,stackSize,inheritThreadLocals);}

    public static native java.lang.Thread currentThread();
    public static native void yield();
    public long getId(){return super.getId();}
    // public final void setPriority(int newPriority){}
    // public final int getPriority(){}
    // public final synchronized void setName(String name){}
    // public final String getName(){}
    // public final void setDaemon(boolean on){}
    // public final boolean isDaemon() {}
    // public final ThreadGroup getThreadGroup(){}

    // public final void checkAccess(){}
    public static native boolean holdsLock(Object obj);

    public synchronized void start(){super.start();}
    public void run(){super.run();}
    // public final void stop(){super.stop();}
    // public final synchronized void stop(Throwable obj) { throw new UnsupportedOperationException(); }

    // 休眠
    public static native void sleep(long millis) throws InterruptedException;
    public static void sleep(long millis, int nanos) throws InterruptedException { java.lang.Thread.sleep(millis,nanos); }
    public static void onSpinWait() {}

    // public final void join() throws InterruptedException {}
    // public final synchronized void join(long millis) throws InterruptedException{}
    // public final synchronized void join(long millis, int nanos) throws InterruptedException {}

    // public final native void wait(long timeout) throws InterruptedException;
    // public final void wait(long timeout, int nanos) throws InterruptedException;
    // public final void wait() throws InterruptedException;

    // public final native void notify();
    // public final native void notifyAll();

    // 中断
    public void interrupt(){super.interrupt();}
    public boolean isInterrupted(){return super.isInterrupted();}
    public static boolean interrupted(){return java.lang.Thread.interrupted();}
    // public final void suspend() {} // 挂起
    // public final void resume() {} // 恢复

    @Deprecated(since="1.5", forRemoval=true) public void destroy(){super.destroy();}

    public enum State {
        NEW,RUNNABLE,BLOCKED,WAITING,TIMED_WAITING,TERMINATED;
    }
    public java.lang.Thread.State getState(){return super.getState();}

    // public final native boolean isAlive();
    public static int activeCount(){return java.lang.Thread.activeCount();}
    public static int enumerate(java.lang.Thread tarray[]){return java.lang.Thread.enumerate(tarray);}

    public native int countStackFrames();
    public static void dumpStack(){java.lang.Thread.dumpStack();}
    public StackTraceElement[] getStackTrace(){return super.getStackTrace();}
    public static Map<java.lang.Thread, StackTraceElement[]> getAllStackTraces(){return java.lang.Thread.getAllStackTraces();}

    public ClassLoader getContextClassLoader(){return super.getContextClassLoader();}
    public void setContextClassLoader(ClassLoader cl){super.setContextClassLoader(cl);}

    public String toString(){return super.toString();}

    public interface UncaughtExceptionHandler {
        void uncaughtException(java.lang.Thread t, Throwable e);
    }
    public static void setDefaultUncaughtExceptionHandler(java.lang.Thread.UncaughtExceptionHandler eh) {java.lang.Thread.setDefaultUncaughtExceptionHandler(eh);}
    public static java.lang.Thread.UncaughtExceptionHandler getDefaultUncaughtExceptionHandler(){return java.lang.Thread.getDefaultUncaughtExceptionHandler();}
    public java.lang.Thread.UncaughtExceptionHandler getUncaughtExceptionHandler(){return super.getUncaughtExceptionHandler();}
    public void setUncaughtExceptionHandler(java.lang.Thread.UncaughtExceptionHandler eh){super.setUncaughtExceptionHandler(eh);}
}
