package javase.extension.system.thread.stack;

import java.lang.StackWalker;

/**
 * <em>UNSUPPORTED</em> This interface is intended to be package-private
 * or move to an internal package.<p>
 *
 * {@code LiveStackFrame} represents a frame storing data and partial results.
 * Each frame has its own array of local variables (JVMS section 2.6.1),
 * its own operand stack (JVMS section 2.6.2) for a method invocation.
 *
 * @see java.lang.LiveStackFrame
 */
interface LiveStackFrame extends StackWalker.StackFrame {

}
