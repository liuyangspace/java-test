package javaee.jdbc.driver;

import java.sql.*;
import java.util.logging.Logger;

/**
 * The interface that every driver class must implement.
 * <P>The Java SQL framework allows for multiple database drivers.
 * A JDBC driver may create：
 *      {@code Class.forName("foo.bah.Driver")}
 *      {@linkplain java.sql.DriverManager#deregisterDriver}
 * @see java.sql.Driver
 * @see java.sql
 * @see java.sql.DriverManager#registerDriver(java.sql.Driver)
 * @see DriverManager
 * @see Connection
 * @see DriverAction
 */
public interface Driver extends java.sql.Driver{

    Connection connect(String url, java.util.Properties info) throws SQLException;
    boolean acceptsURL(String url) throws SQLException;
    DriverPropertyInfo[] getPropertyInfo(String url, java.util.Properties info) throws SQLException;
    int getMajorVersion();
    int getMinorVersion();
    boolean jdbcCompliant();
    public Logger getParentLogger() throws SQLFeatureNotSupportedException;

}
