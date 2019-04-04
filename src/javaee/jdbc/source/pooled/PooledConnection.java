package javaee.jdbc.source.pooled;

import javax.sql.ConnectionEventListener;
import javax.sql.StatementEventListener;
import java.sql.Connection;
import java.sql.SQLException;

/**
 * An object that provides hooks for connection pool management.
 * A <code>PooledConnection</code> object
 * represents a physical connection to a data source.  The connection
 * can be recycled rather than being closed when an application is
 * finished with it, thus reducing the number of connections that
 * need to be made.
 *
 * @see javax.sql.PooledConnection
 * @see javax.sql.PooledConnectionBuilder
 */
public interface PooledConnection extends javax.sql.PooledConnection{

    Connection getConnection() throws SQLException;
    void close() throws SQLException;

    void addConnectionEventListener(ConnectionEventListener listener);
    void removeConnectionEventListener(ConnectionEventListener listener);
    void addStatementEventListener(StatementEventListener listener);
    void removeStatementEventListener(StatementEventListener listener);

}
