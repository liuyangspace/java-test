package javaee.servlet;

import javax.servlet.ServletResponse;
import java.io.IOException;

/**
 * Provides an output stream for sending binary data to the client. A
 * <code>ServletOutputStream</code> object is normally retrieved via the
 * {@link ServletResponse#getOutputStream} method.
 *
 * @see java.io.OutputStream
 * @see ServletResponse#getOutputStream
 * @see javax.servlet.ServletOutputStream
 */
public abstract class ServletOutputStream extends javax.servlet.ServletOutputStream{

    protected ServletOutputStream() { /* NOOP */ }

    public void print(String s) throws IOException { super.print(s); }
    public void print(boolean b) throws IOException { super.print(b); }
    public void print(char c) throws IOException { super.print(c); }
    public void print(int i) throws IOException { super.print(i); }
    public void print(long l) throws IOException { super.print(l); }
    public void print(float f) throws IOException { super.print(f); }
    public void print(double d) throws IOException { super.print(d); }

    public void println() throws IOException { super.println(); }
    public void println(String s) throws IOException { super.println(s); }
    public void println(boolean b) throws IOException { super.println(b); }
    public void println(char c) throws IOException { super.println(c); }
    public void println(int i) throws IOException { super.println(i); }
    public void println(long l) throws IOException { super.println(l); }
    public void println(float f) throws IOException { super.println(f); }
    public void println(double d) throws IOException { super.println(d); }

    public abstract boolean isReady();
    public abstract void setWriteListener(javax.servlet.WriteListener listener);

}
