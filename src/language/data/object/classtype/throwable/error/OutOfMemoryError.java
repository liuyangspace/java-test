package language.data.object.classtype.throwable.error;

import java.lang.VirtualMachineError;

/**
 * Thrown when the Java Virtual Machine cannot allocate an object
 * because it is out of memory, and no more memory could be made
 * available by the garbage collector.
 *
 * @see java.lang.OutOfMemoryError
 */
public class OutOfMemoryError extends VirtualMachineError {
    private static final long serialVersionUID = 8228564086184010517L;

    /**
     * Constructs an {@code OutOfMemoryError} with no detail message.
     */
    public OutOfMemoryError() {
        super();
    }

    /**
     * Constructs an {@code OutOfMemoryError} with the specified
     * detail message.
     *
     * @param   s   the detail message.
     */
    public OutOfMemoryError(String s) {
        super(s);
    }
}