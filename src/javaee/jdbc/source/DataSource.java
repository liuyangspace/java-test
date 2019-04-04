package javaee.jdbc.source;

import javax.sql.CommonDataSource;
import java.sql.*;

/**
 * 数据源,A factory for connections to the physical data source that this
 * {@code DataSource} object represents.
 *
 * @see javax.sql.XADataSource
 * @see javax.sql.ConnectionPoolDataSource
 * @see javax.sql.CommonDataSource
 * @see javax.sql.DataSource
 */
public interface DataSource extends javax.sql.DataSource,CommonDataSource, Wrapper {

    Connection getConnection() throws SQLException;
    Connection getConnection(String username, String password) throws SQLException;
    // JDBC 4.3
    default ConnectionBuilder createConnectionBuilder() throws SQLException {
        throw new SQLFeatureNotSupportedException("createConnectionBuilder not implemented");
    }

}
