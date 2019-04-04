package javaee.jdbc.driver;

import java.sql.Driver;
import java.sql.DriverManager;

/**
 * An interface that must be implemented when a {@linkplain Driver} wants to be
 * notified by {@code DriverManager}.
 * {@linkplain DriverManager#registerDriver(java.sql.Driver, java.sql.DriverAction) }
 *
 * @see java.sql.DriverAction
 */
public interface DriverAction extends java.sql.DriverAction{
    /**
     * Method called by
     * {@linkplain DriverManager#deregisterDriver(Driver) }
     *  to notify the JDBC driver that it was de-registered.
     */
    void deregister();
}
