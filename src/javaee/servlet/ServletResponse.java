package javaee.servlet;

import javax.servlet.ServletOutputStream;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Locale;

/**
 * Defines an object to assist a servlet in sending a response to the client.
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
