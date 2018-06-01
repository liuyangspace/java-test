package language.extension.system;

import java.io.Console;
import java.io.IOException;
import java.io.InputStream;
import java.io.PrintStream;
import java.nio.channels.Channel;
import java.util.Properties;
import java.util.ResourceBundle;
import java.util.function.Supplier;

/**
 * The <code>System</code> class contains several useful class fields and methods. It cannot be instantiated.
 *
 * <p>Among the facilities provided by the <code>System</code> class
 * are standard input, standard output, and error output streams;
 * access to externally defined properties and environment variables;
 * a means of loading files and libraries; and a utility method for
 * quickly copying a portion of an array.
 *
 * @see java.lang.System
 */
public final class System {

    private System() { }

    public static final InputStream in = null;
    public static final PrintStream out = null;
    public static final PrintStream err = null;

    public static void setIn(InputStream in) { java.lang.System.setIn(in); }
    public static void setOut(PrintStream out) { java.lang.System.setOut(out); }
    public static void setErr(PrintStream err) { java.lang.System.setErr(err); }

    public static native long currentTimeMillis();
    public static native long nanoTime();
    public static String lineSeparator(){return java.lang.System.lineSeparator();}
    public static native void arraycopy(Object src,  int  srcPos, Object dest, int destPos, int length);
    public static native int identityHashCode(Object x);
    public static void exit(int status){java.lang.System.exit(status);}

    public static String getenv(String name){return java.lang.System.getenv(name);}
    public static java.util.Map<String,String> getenv(){return java.lang.System.getenv();}

    public static Properties getProperties(){ return java.lang.System.getProperties(); }
    public static void setProperties(Properties props){ java.lang.System.setProperties(props); }
    public static String getProperty(String key){ return java.lang.System.getProperty(key); }
    public static String getProperty(String key, String def){ return java.lang.System.getProperty(key,def); }
    public static String setProperty(String key, String value){ return java.lang.System.setProperty(key,value); }
    public static String clearProperty(String key){ return java.lang.System.clearProperty(key); }

    public static Console console() { return java.lang.System.console(); }
    public static Channel inheritedChannel() throws IOException { return java.lang.System.inheritedChannel(); }
    public static void setSecurityManager(final SecurityManager s) {java.lang.System.setSecurityManager(s);}
    public static SecurityManager getSecurityManager(){return java.lang.System.getSecurityManager();}
    public static void gc(){java.lang.System.gc();}
    public static void runFinalizersOnExit(boolean value){java.lang.System.runFinalizersOnExit(value);}
    public static void load(String filename){java.lang.System.load(filename);}
    public static void loadLibrary(String libname){java.lang.System.loadLibrary(libname);}
    public static native String mapLibraryName(String libname);

    public static java.lang.System.Logger getLogger(String name){return java.lang.System.getLogger(name);}
    public static java.lang.System.Logger getLogger(String name, ResourceBundle bundle){return java.lang.System.getLogger(name,bundle);}
    public interface Logger {
        public enum Level {
            ALL(Integer.MIN_VALUE),TRACE(400),DEBUG(500),INFO(800),WARNING(900),ERROR(1000),OFF(Integer.MAX_VALUE);
            private final int severity;
            private Level(int severity) {this.severity = severity;}
            public final String getName() {return name();}
            public final int getSeverity() {return severity;}
        }
        public String getName();
        public boolean isLoggable(java.lang.System.Logger.Level level);
        public default void log(java.lang.System.Logger.Level level, String msg) { }
        public default void log(java.lang.System.Logger.Level level, Supplier<String> msgSupplier) { }
        public default void log(java.lang.System.Logger.Level level, Object obj) { }
        public default void log(java.lang.System.Logger.Level level, String msg, Throwable thrown) { }
        public default void log(java.lang.System.Logger.Level level, Supplier<String> msgSupplier, Throwable thrown){ }
        public default void log(java.lang.System.Logger.Level level, String format, Object... params){ }
        public void log(java.lang.System.Logger.Level level, ResourceBundle bundle, String msg, Throwable thrown);
        public void log(java.lang.System.Logger.Level level, ResourceBundle bundle, String format, Object... params);
    }
    public static abstract class LoggerFinder extends java.lang.System.LoggerFinder{
        static final RuntimePermission LOGGERFINDER_PERMISSION = new RuntimePermission("loggerFinder");
        public abstract java.lang.System.Logger getLogger(String name, Module module);
        public java.lang.System.Logger getLocalizedLogger(String name, ResourceBundle bundle, Module module) {return super.getLocalizedLogger(name,bundle,module);}
        public static java.lang.System.LoggerFinder getLoggerFinder() {return java.lang.System.LoggerFinder.getLoggerFinder();}
    }
}
