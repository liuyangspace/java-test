package language.extension.system.process;

import java.io.InputStream;
import java.io.OutputStream;
import java.util.concurrent.CompletableFuture;
import java.util.concurrent.TimeUnit;
import java.util.stream.Stream;

/**
 * {@code Process} provides control of native processes started by
 * ProcessBuilder.start and Runtime.exec.
 * The class provides methods for
 *      performing input from the process,
 *      performing output to the process,
 *      waiting for the process to complete,
 *      checking the exit status of the process, and
 *      destroying (killing) the process.
 * @see java.lang.Process
 * @see ProcessBuilder#start()
 * @see java.lang.Runtime#exec(String)
 */
public abstract class Process extends java.lang.Process{

    public Process() {}

    public abstract OutputStream getOutputStream();
    public abstract InputStream getInputStream();
    public abstract InputStream getErrorStream();

    public long pid(){return super.pid();}
    public CompletableFuture<java.lang.Process> onExit(){return super.onExit();}

    public abstract int waitFor() throws InterruptedException;
    public boolean waitFor(long timeout, TimeUnit unit) throws InterruptedException {return super.waitFor(timeout,unit);}
    public abstract int exitValue();
    public Stream<ProcessHandle> children(){return super.children();}
    public Stream<ProcessHandle> descendants(){return super.descendants();}

    public boolean supportsNormalTermination(){return super.supportsNormalTermination();}
    public boolean isAlive(){return super.isAlive();}

    public abstract void destroy();
    public java.lang.Process destroyForcibly(){return super.destroyForcibly();}

    public ProcessHandle toHandle(){throw new UnsupportedOperationException(this.getClass() + ".toHandle() not supported");}
    public ProcessHandle.Info info(){return super.info();}

}
