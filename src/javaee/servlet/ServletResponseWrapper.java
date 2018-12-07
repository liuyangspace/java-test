package javaee.servlet;

import javax.servlet.ServletResponse;

/**
 * Provides a convenient implementation of the ServletResponse interface that
 * can be subclassed by developers wishing to adapt the response from a Servlet.
 * This class implements the Wrapper or Decorator pattern. Methods default to
 * calling through to the wrapped response object.
 *
 * @see javax.servlet.ServletResponseWrapper
 */
public class ServletResponseWrapper extends javax.servlet.ServletResponseWrapper implements ServletResponse {

    public ServletResponseWrapper(ServletResponse response) { super(response);}

    public ServletResponse getResponse() { return super.getResponse(); }
    public void setResponse(ServletResponse response) { super.setResponse(response); }

    /** TODO SERVLET3 */
    public boolean isWrapperFor(ServletResponse wrapped) { return isWrapperFor(wrapped); }
    public boolean isWrapperFor(Class<?> wrappedType) { return isWrapperFor(wrappedType); }

    /*
        @Override ...
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

     */
}
