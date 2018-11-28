package javase.extension.io;

/**
 * An object that may hold resources (such as file or socket handles)
 * until it is closed.
 *
 * @see java.lang.AutoCloseable
 */
public interface AutoCloseable extends java.lang.AutoCloseable
{
    void close() throws Exception;
}
