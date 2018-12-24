package javaee.jsp;

import java.io.IOException;

/**
 * The actions and template data in a JSP page is written using the JspWriter
 * object that is referenced by the implicit variable out which is initialized
 * automatically using methods in the PageContext object.
 *
 * @see javax.servlet.jsp.JspWriter
 */
public abstract class JspWriter extends javax.servlet.jsp.JspWriter{

    protected JspWriter(int bufferSize, boolean autoFlush) { super(bufferSize, autoFlush); }

    public abstract void newLine() throws IOException;
    public abstract void print(boolean b) throws IOException;
    public abstract void print(char c) throws IOException;
    public abstract void print(int i) throws IOException;
    public abstract void print(long l) throws IOException;
    public abstract void print(float f) throws IOException;
    public abstract void print(double d) throws IOException;
    public abstract void print(char s[]) throws IOException;
    public abstract void print(String s) throws IOException;
    public abstract void print(Object obj) throws IOException;
    public abstract void println() throws IOException;
    public abstract void println(boolean x) throws IOException;
    public abstract void println(char x) throws IOException;
    public abstract void println(int x) throws IOException;
    public abstract void println(long x) throws IOException;
    public abstract void println(float x) throws IOException;
    public abstract void println(double x) throws IOException;
    public abstract void println(char x[]) throws IOException;
    public abstract void println(String x) throws IOException;
    public abstract void println(Object x) throws IOException;

    public abstract void clear() throws IOException;
    public abstract void clearBuffer() throws IOException;
    @Override public abstract void flush() throws IOException;
    @Override public abstract void close() throws IOException;

    public int getBufferSize(){ return super.getBufferSize(); }
    public boolean isAutoFlush(){ return super.isAutoFlush(); }

    public abstract int getRemaining();

}
