package javase.extension.io;

import java.io.IOException;

/**
 * A {@code Flushable} is a destination of data that can be flushed.  The
 * flush method is invoked to write any buffered output to the underlying
 * stream.
 *
 * @see java.io.Flushable
 */
public interface Flushable {
    void flush() throws IOException;
}
