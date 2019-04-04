package javaee.jdbc.source;

import java.sql.SQLException;
import java.sql.SQLFeatureNotSupportedException;
import java.sql.ShardingKeyBuilder;
import java.util.logging.Logger;

/**
 * Interface that defines the methods which are common between <code>DataSource</code>,
 * <code>XADataSource</code> and <code>ConnectionPoolDataSource</code>.
 *
 * @see javax.sql.DataSource
 * @see javax.sql.XADataSource
 * @see javax.sql.ConnectionPoolDataSource
 * @see javax.sql.CommonDataSource
 */
public interface CommonDataSource extends javax.sql.CommonDataSource {

    java.io.PrintWriter getLogWriter() throws SQLException;
    void setLogWriter(java.io.PrintWriter out) throws SQLException;
    int getLoginTimeout() throws SQLException;
    void setLoginTimeout(int seconds) throws SQLException;
    //------------------------- JDBC 4.1 -----------------------------------
    public Logger getParentLogger() throws SQLFeatureNotSupportedException;
    //------------------------- JDBC 4.3 -----------------------------------
    default ShardingKeyBuilder createShardingKeyBuilder() throws SQLException {
        throw new SQLFeatureNotSupportedException("createShardingKeyBuilder not implemented");
    }
}
