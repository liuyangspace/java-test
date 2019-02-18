package javaee.servlet;

import javax.servlet.ServletOutputStream;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Locale;

/**
 * Defines an object to assist a servlet in sending a response to the client.
 *  # getOutputStream和getWriter这两个方法互相排斥，调用了其中的任何一个方法后，就不能再调用另一方法
 *  # Serlvet的service方法结束后，Servlet引擎将检查getWriter或getOutputStream方法返回的输出流对象是否已经调用过close方法，
 *      如果没有，Servlet引擎将调用close方法关闭该输出流对象。
 *
 * @see javax.servlet.ServletResponse
 * @see javax.servlet.ServletOutputStream
 */
public interface ServletResponse extends javax.servlet.ServletResponse{

    public String getCharacterEncoding();
    public void setCharacterEncoding(String charset);
    public String getContentType();
    public void setContentType(String type);
    public void setContentLength(int len);
    public void setContentLengthLong(long length);

    public ServletOutputStream getOutputStream() throws IOException;
    public PrintWriter getWriter() throws IOException;

    public void setBufferSize(int size);
    public int getBufferSize();
    public void flushBuffer() throws IOException;
    public void resetBuffer();

    public boolean isCommitted();
    public void reset();

    public void setLocale(Locale loc);
    public Locale getLocale();

}
