package javase.data.object.clazz.throwable;

import java.lang.StackTraceElement;
import java.util.EnumSet;
import java.util.Set;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.stream.Stream;

/**
 * A stack walker.
 *
 * @see java.lang.StackWalker
 */
public class StackWalker
{
    public java.lang.StackWalker $this;

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
    public enum Option { RETAIN_CLASS_REFERENCE, SHOW_REFLECT_FRAMES, SHOW_HIDDEN_FRAMES; }
    enum ExtendedOption { LOCALS_AND_OPERANDS };
    static final EnumSet<java.lang.StackWalker.Option> DEFAULT_EMPTY_OPTION = EnumSet.noneOf(java.lang.StackWalker.Option.class);

    public static java.lang.StackWalker getInstance(java.lang.StackWalker.Option option) { return java.lang.StackWalker.getInstance(option); }
    public static java.lang.StackWalker getInstance(Set<java.lang.StackWalker.Option> options) {return java.lang.StackWalker.getInstance(options);}
    public static java.lang.StackWalker getInstance(Set<java.lang.StackWalker.Option> options, int estimateDepth) {return java.lang.StackWalker.getInstance(options,estimateDepth);}
    public <T> T walk(Function<? super Stream<java.lang.StackWalker.StackFrame>, ? extends T> function) {return $this.walk(function);}
    public void forEach(Consumer<? super java.lang.StackWalker.StackFrame> action) { $this.forEach(action);}
    public Class<?> getCallerClass() {return $this.getCallerClass();}
}
