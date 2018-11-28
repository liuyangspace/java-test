package javase.data.object.clazz.throwable.error;

import java.lang.Error;

/**
 * Thrown to indicate that the Java Virtual Machine is broken or has
 * run out of resources necessary for it to continue operating.
 *
 * @see java.lang.VirtualMachineError
 */
public class VirtualMachineError extends Error
{
    public VirtualMachineError() {
        super();
    }
    public VirtualMachineError(String message) {
        super(message);
    }
    public VirtualMachineError(String message, Throwable cause) {
        super(message, cause);
    }
    public VirtualMachineError(Throwable cause) {
        super(cause);
    }
}
