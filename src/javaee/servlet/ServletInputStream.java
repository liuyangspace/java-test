package javaee.servlet;

import javax.servlet.ReadListener;
import java.io.IOException;

/**
 * Provides an input stream for reading binary data from a client request,
 * including an efficient <code>readLine</code> method for reading data one line
 * at a time. With some protocols, such as HTTP POST and PUT, a
 * <code>ServletInputStream</code> object can be used to read data sent from the
 * client.
 *
 * @see javax.servlet.ServletRequest#getInputStream
 * @see javax.servlet.ServletInputStream
 */
public abstract class ServletInputStream extends javax.servlet.ServletInputStream {

    protected ServletInputStream() { /* NOOP */ }

    public int readLine(byte[] b, int off, int len) throws IOException { return super.readLine(b,off,len); }

    public abstract boolean isFinished();
    public abstract boolean isReady();
    public abstract void setReadListener(ReadListener listener);

}
