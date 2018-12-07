package javaee.servlet.listener;

import javax.servlet.ServletInputStream;
import java.io.IOException;

/**
 * Receives notification of read events when using non-blocking IO.
 *
 * @since Servlet 3.1
 * @see javax.servlet.ReadListener
 * @see javax.servlet.ServletInputStream#setReadListener
 */
public interface ReadListener extends javax.servlet.ReadListener {
    /**
     * Invoked when data is available to read. The container will invoke this
     * method the first time for a request as soon as there is data to read.
     * Subsequent invocations will only occur if a call to
     * {@link ServletInputStream#isReady()} has returned false and data has
     * subsequently become available to read.
     *
     * @throws IOException id an I/O error occurs while processing the event
     */
    public abstract void onDataAvailable() throws IOException;

    /**
     * Invoked when the request body has been fully read.
     *
     * @throws IOException id an I/O error occurs while processing the event
     */
    public abstract void onAllDataRead() throws IOException;

    /**
     * Invoked if an error occurs while reading the request body.
     *
     * @param throwable The exception that occurred
     */
    public abstract void onError(java.lang.Throwable throwable);
}
