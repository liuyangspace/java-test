package javase.extension.system.thread.stack;

import java.util.Set;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.stream.Stream;

/**
 * A stack walker.
 *
 * <p> The {@link java.lang.StackWalker#walk walk} method opens a sequential stream
 * of {@link java.lang.StackWalker.StackFrame StackFrame}s for the current thread and then applies
 * the given function to walk the {@code StackFrame} stream.
 *
 * <p>1. To find the first caller filtering a known list of implementation class:
 * <pre>{@code
 *     StackWalker walker = StackWalker.getInstance(Option.RETAIN_CLASS_REFERENCE);
 *     Optional<Class<?>> callerClass = walker.walk(s ->
 *         s.map(StackFrame::getDeclaringClass)
 *          .filter(interestingClasses::contains)
 *          .findFirst());
 * }</pre>
 *
 * <p>2. To snapshot the top 10 stack frames of the current thread,
 * <pre>{@code
 *     List<StackFrame> stack = StackWalker.getInstance().walk(s -> s.limit(10).collect(Collectors.toList()));
 * }</pre>
 *
 * @see java.lang.StackWalker
 */
public final class StackWalker {
    java.lang.StackWalker $this;
    public static interface StackFrame {
        public String getClassName();
        public String getMethodName();
        public Class<?> getDeclaringClass();
        public int getByteCodeIndex();
        public String getFileName();
        public int getLineNumber();
        public boolean isNativeMethod();
        public StackTraceElement toStackTraceElement();
    }
    public enum Option {
        RETAIN_CLASS_REFERENCE,SHOW_REFLECT_FRAMES,SHOW_HIDDEN_FRAMES;
    }
    enum ExtendedOption {
        LOCALS_AND_OPERANDS
    }

    public static java.lang.StackWalker getInstance(Option showHiddenFrames) { return (new StackWalker()).$this=java.lang.StackWalker.getInstance(); }
    public static java.lang.StackWalker getInstance(java.lang.StackWalker.Option option) {return (new StackWalker()).$this=java.lang.StackWalker.getInstance(option); }
    public static java.lang.StackWalker getInstance(Set<java.lang.StackWalker.Option> options) {return (new StackWalker()).$this=java.lang.StackWalker.getInstance(options); }
    public static java.lang.StackWalker getInstance(Set<java.lang.StackWalker.Option> options, int estimateDepth) {return (new StackWalker()).$this=java.lang.StackWalker.getInstance(options,estimateDepth); }

    public <T> T walk(Function<? super Stream<java.lang.StackWalker.StackFrame>, ? extends T> function) {return $this.walk(function);}
    public void forEach(Consumer<? super java.lang.StackWalker.StackFrame> action){$this.forEach(action);}
    public Class<?> getCallerClass() {return $this.getCallerClass();}

}
