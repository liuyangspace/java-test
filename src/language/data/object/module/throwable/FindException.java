package language.data.object.module.throwable;

import java.lang.module.Configuration;
import java.lang.module.ModuleFinder;

/**
 * Thrown by a {@link ModuleFinder ModuleFinder} when an error occurs finding
 * a module. Also thrown by {@link
 * Configuration#resolve(ModuleFinder,java.util.List,ModuleFinder,java.util.Collection)
 * Configuration.resolve} when resolution fails for observability-related
 * reasons.
 *
 * @since 9
 * @spec JPMS
 *
 * @see java.lang.module.FindException
 */
public class FindException extends RuntimeException
{
    private static final long serialVersionUID = -5817081036963388391L;
    public FindException() {}
    public FindException(String msg) {
        super(msg);
    }
    public FindException(Throwable cause) {
        super(cause);
    }
    public FindException(String msg, Throwable cause) {
        super(msg, cause);
    }
}
