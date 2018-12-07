package javaee.servlet.http;

import javax.servlet.http.WebConnection;

/**
 * Interface between the HTTP upgrade process and the new protocol.
 *
 * @see javax.servlet.http.HttpUpgradeHandler
 */
public interface HttpUpgradeHandler extends javax.servlet.http.HttpUpgradeHandler{

    void init(WebConnection connection);
    void destroy();

}
