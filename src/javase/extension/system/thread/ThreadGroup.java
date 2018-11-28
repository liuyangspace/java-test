package javase.extension.system.thread;

import java.lang.Thread;

/**
 * A thread group represents a set of threads.
 *
 * @see java.lang.ThreadGroup
 */
public class ThreadGroup /** extends java.lang.ThreadGroup */ implements Thread.UncaughtExceptionHandler{
    java.lang.ThreadGroup $this;
    public ThreadGroup(String name) { $this = new java.lang.ThreadGroup(name); }
    public ThreadGroup(java.lang.ThreadGroup parent, String name) {  $this = new java.lang.ThreadGroup(parent,name); }

    public final String getName(){return $this.getName();}

    public final java.lang.ThreadGroup getParent() {return $this.getParent();}
    public final boolean parentOf(java.lang.ThreadGroup g){return $this.parentOf(g);}

    public final void setMaxPriority(int pri){$this.setMaxPriority(pri);}
    public final int getMaxPriority(){return $this.getMaxPriority();}

    public final void setDaemon(boolean daemon){$this.setDaemon(daemon);}
    public final boolean isDaemon(){return $this.isDaemon();}

    public final void interrupt(){$this.interrupt();}

    public final void suspend(){$this.suspend();}
    public final void resume() {$this.resume();}

    public synchronized boolean isDestroyed(){return $this.isDestroyed();}

    public final void checkAccess(){$this.checkAccess();}
    public int activeCount(){return $this.activeCount();}
    public int activeGroupCount(){return $this.activeGroupCount();}
    public int enumerate(Thread list[]) {return $this.enumerate(list);}
    public int enumerate(Thread list[], boolean recurse){return $this.enumerate(list,recurse);}
    public int enumerate(java.lang.ThreadGroup list[]){return $this.enumerate(list);}
    public int enumerate(java.lang.ThreadGroup list[], boolean recurse){return $this.enumerate(list,recurse);}

    public void list() {list();}

    public final void stop(){$this.stop();}
    public final void destroy() {$this.destroy();}

    public void uncaughtException(Thread t, Throwable e){$this.uncaughtException(t,e);}
    public boolean allowThreadSuspension(boolean b){return $this.allowThreadSuspension(b);}

    public String toString(){return $this.toString();}
}
