package javaee.jdbc.source.pooled;

import javax.sql.CommonDataSource;
import javax.sql.PooledConnection;
import javax.sql.PooledConnectionBuilder;
import java.sql.SQLException;
import java.sql.SQLFeatureNotSupportedException;
import java.sql.Wrapper;

/**
 * A factory for <code>PooledConnection</code>
 * objects.  An object that implements this interface will typically be
 * registered with a naming service that is based on the
 * Java&trade; Naming and Directory Interface
 * (JNDI).
 *
 * @see javax.sql.ConnectionPoolDataSource
 */
public interface ConnectionPoolDataSource extends javax.sql.DataSource,CommonDataSource, Wrapper {

    PooledConnection getPooledConnection() throws SQLException;
    PooledConnection getPooledConnection(String user, String password) throws SQLException;
    default PooledConnectionBuilder createPooledConnectionBuilder() throws SQLException {
        throw new SQLFeatureNotSupportedException("createPooledConnectionBuilder not implemented");
    }
}
