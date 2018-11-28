package javase.extension.system;

import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.util.List;
import java.util.Optional;

/**
 * Every Java application has a single instance of class
 * {@code Runtime} that allows the application to interface with
 * the environment in which the application is running. The current
 * runtime can be obtained from the {@code getRuntime} method.
 *
 * @see     java.lang.Runtime#getRuntime()
 *
 */
public class Runtime // extends java.lang.Runtime
{
    static java.lang.Runtime $this;
    private Runtime() {}
    public static java.lang.Runtime getRuntime() { return $this = java.lang.Runtime.getRuntime(); }

    public void exit(int status) { $this.exit(status);}
    public void halt(int status) { $this.halt(status);}
    public void addShutdownHook(Thread hook) { $this.addShutdownHook(hook);}
    public boolean removeShutdownHook(Thread hook) { return $this.removeShutdownHook(hook);}

    public Process exec(String command) throws IOException {return $this.exec(command);}
    public Process exec(String command, String[] envp) throws IOException { return $this.exec(command,envp); }
    public Process exec(String command, String[] envp, File dir) throws IOException { return $this.exec(command,envp,dir); }
    public Process exec(String cmdarray[]) throws IOException {return $this.exec(cmdarray);}
    public Process exec(String[] cmdarray, String[] envp) throws IOException { return $this.exec(cmdarray,envp); }
    public Process exec(String[] cmdarray, String[] envp, File dir) throws IOException { return $this.exec(cmdarray,envp,dir); }

    public native int availableProcessors();
    public native long freeMemory();
    public native long totalMemory();
    public native long maxMemory();
    public native void gc();

    public void load(String filename){$this.load(filename);}
    public void loadLibrary(String libname){$this.loadLibrary(libname);}
    public InputStream getLocalizedInputStream(InputStream in){return $this.getLocalizedInputStream(in);}
    public OutputStream getLocalizedOutputStream(OutputStream out){return $this.getLocalizedOutputStream(out);}

    public static java.lang.Runtime.Version version(){return java.lang.Runtime.version();}
    public static final class Version implements Comparable<java.lang.Runtime.Version> {
        static java.lang.Runtime.Version $this;
        private Version(){}
        public static java.lang.Runtime.Version parse(String s) {return $this = java.lang.Runtime.Version.parse(s);}
        public int major(){return $this.major();}
        public int minor(){return $this.minor();}
        public int security(){return $this.security();}
        public List<Integer> version(){return $this.version();}
        public Optional<String> pre(){return $this.pre();}
        public Optional<Integer> build(){return $this.build();}
        public Optional<String> optional(){return $this.optional();}
        public int compareTo(java.lang.Runtime.Version obj){return $this.compareTo(obj);}
        public int compareToIgnoreOptional(java.lang.Runtime.Version obj){return $this.compareToIgnoreOptional(obj);}
        public String toString() {return $this.toString();}
        public boolean equals(Object obj) {return $this.equals(obj);}
        public boolean equalsIgnoreOptional(Object obj) {return $this.equalsIgnoreOptional(obj);}
        public int hashCode(){return $this.hashCode();}
    }

    public void runFinalization() { $this.runFinalization(); }
    public void traceInstructions(boolean on) { }
    public void traceMethodCalls(boolean on) { }

    public static void runFinalizersOnExit(boolean value) { $this.runFinalizersOnExit(value);}
}
