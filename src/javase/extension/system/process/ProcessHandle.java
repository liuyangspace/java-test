package javase.extension.system.process;

import java.time.Duration;
import java.time.Instant;
import java.util.Optional;
import java.util.concurrent.CompletableFuture;
import java.util.stream.Stream;

/**
 * ProcessHandle identifies and provides control of native processes. Each
 * individual process can be monitored for liveness, list its children,
 * get information about the process or destroy it.
 *
 * @see java.lang.ProcessHandle
 */
public interface ProcessHandle extends Comparable<java.lang.ProcessHandle> {

    long pid();
    Optional<java.lang.ProcessHandle> parent();
    Stream<java.lang.ProcessHandle> children();
    Stream<java.lang.ProcessHandle> descendants();

    public static Optional<java.lang.ProcessHandle> of(long pid) { return java.lang.ProcessHandle.of(pid); }
    public static java.lang.ProcessHandle current(){ return java.lang.ProcessHandle.current(); }
    static Stream<java.lang.ProcessHandle> allProcesses() { return java.lang.ProcessHandle.allProcesses(); }

    CompletableFuture<java.lang.ProcessHandle> onExit();
    boolean supportsNormalTermination();

    java.lang.ProcessHandle.Info info();
    public interface Info {
        public Optional<String> command();
        public Optional<String> commandLine();
        public Optional<String[]> arguments();
        public Optional<Instant> startInstant();
        public Optional<Duration> totalCpuDuration();
        public Optional<String> user();
    }

    boolean destroy();
    boolean destroyForcibly();
    boolean isAlive();

    int hashCode();
    boolean equals(Object other);
    int compareTo(java.lang.ProcessHandle other);
}
