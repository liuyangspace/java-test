package language.extension.io;

import java.io.IOException;
import java.lang.AutoCloseable;

/**
 * A {@code Closeable} is a source or destination of data that can be closed.
 *
 * @see java.io.Closeable
 */
public interface Closeable extends AutoCloseable
{
    public void close() throws IOException;
}
