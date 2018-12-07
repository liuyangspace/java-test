package javaee.servlet.http;

import javax.servlet.ServletInputStream;
import javax.servlet.ServletOutputStream;
import javax.servlet.http.HttpUpgradeHandler;
import java.io.IOException;

/**
 * The interface used by a {@link HttpUpgradeHandler} to interact with an upgraded
 * HTTP connection.
 *
 * @see javax.servlet.http.WebConnection
 */
public interface WebConnection extends javax.servlet.http.WebConnection{

    ServletInputStream getInputStream() throws IOException;
    ServletOutputStream getOutputStream() throws IOException;

}
