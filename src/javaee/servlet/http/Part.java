package javaee.servlet.http;

import java.io.IOException;
import java.io.InputStream;
import java.util.Collection;

/**
 * This class represents a part as uploaded to the server as part of a
 * <code>multipart/form-data</code> request body. The part may represent either
 * an uploaded file or form data.
 *
 * @see javax.servlet.http.Part
 * @see javax.servlet.http.HttpServletRequest#getPart
 * @see javax.servlet.http.HttpServletRequest#getParts
 */
public interface Part extends javax.servlet.http.Part{

    public InputStream getInputStream() throws IOException;
    public String getContentType();
    public String getName();
    public String getSubmittedFileName();
    public long getSize();
    public void write(String fileName) throws IOException;
    public void delete() throws IOException;
    public String getHeader(String name);
    public Collection<String> getHeaders(String name);
    public Collection<String> getHeaderNames();

}
