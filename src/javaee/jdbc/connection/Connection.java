package javaee.jdbc.connection;

import java.sql.*;
import java.util.Properties;
import java.util.concurrent.Executor;

/**
 * A connection (session) with a specific database.
 *
 * @see javax.sql.DataSource#getConnection()
 * @see java.sql.DriverManager#getConnection
 * @see java.sql.Driver#connect(String, Properties)
 * @see java.sql.Connection
 * @see Statement
 * @see ResultSet
 * @see DatabaseMetaData
 */
public interface Connection extends java.sql.Connection,Wrapper, AutoCloseable {

    Statement createStatement() throws SQLException;
    Statement createStatement(int resultSetType, int resultSetConcurrency) throws SQLException;
    Statement createStatement(int resultSetType, int resultSetConcurrency, int resultSetHoldability) throws SQLException;
    PreparedStatement prepareStatement(String sql) throws SQLException;
    PreparedStatement prepareStatement(String sql, int autoGeneratedKeys) throws SQLException;
    PreparedStatement prepareStatement(String sql, int columnIndexes[]) throws SQLException;
    PreparedStatement prepareStatement(String sql, String columnNames[]) throws SQLException;
    PreparedStatement prepareStatement(String sql, int resultSetType, int resultSetConcurrency) throws SQLException;
    PreparedStatement prepareStatement(String sql, int resultSetType, int resultSetConcurrency, int resultSetHoldability) throws SQLException;
    CallableStatement prepareCall(String sql) throws SQLException;
    CallableStatement prepareCall(String sql, int resultSetType, int resultSetConcurrency) throws SQLException;
    CallableStatement prepareCall(String sql, int resultSetType, int resultSetConcurrency, int resultSetHoldability) throws SQLException;
    DatabaseMetaData getMetaData() throws SQLException;

    // transactions
    void setAutoCommit(boolean autoCommit) throws SQLException;
    boolean getAutoCommit() throws SQLException;
    void commit() throws SQLException;
    void rollback() throws SQLException;
    void setTransactionIsolation(int level) throws SQLException;
    int getTransactionIsolation() throws SQLException;
    Savepoint setSavepoint() throws SQLException;
    Savepoint setSavepoint(String name) throws SQLException;
    void rollback(java.sql.Savepoint savepoint) throws SQLException;
    void releaseSavepoint(java.sql.Savepoint savepoint) throws SQLException;

    void setReadOnly(boolean readOnly) throws SQLException;
    boolean isReadOnly() throws SQLException;
    void setCatalog(String catalog) throws SQLException;
    String getCatalog() throws SQLException;

    boolean isValid(int timeout) throws SQLException;
    void close() throws SQLException;
    boolean isClosed() throws SQLException;

    void setClientInfo(String name, String value) throws SQLClientInfoException;
    void setClientInfo(Properties properties) throws SQLClientInfoException;
    String getClientInfo(String name) throws SQLException;
    Properties getClientInfo() throws SQLException;

    String nativeSQL(String sql) throws SQLException;
    SQLWarning getWarnings() throws SQLException;
    void clearWarnings() throws SQLException;

    java.util.Map<String,Class<?>> getTypeMap() throws SQLException;
    void setTypeMap(java.util.Map<String,Class<?>> map) throws SQLException;
    void setHoldability(int holdability) throws SQLException;
    int getHoldability() throws SQLException;

    Clob createClob() throws SQLException;
    Blob createBlob() throws SQLException;
    NClob createNClob() throws SQLException;
    SQLXML createSQLXML() throws SQLException;
    Array createArrayOf(String typeName, Object[] elements) throws SQLException;
    Struct createStruct(String typeName, Object[] attributes) throws SQLException;

    void abort(Executor executor) throws SQLException;
    void setSchema(String schema) throws SQLException;
    String getSchema() throws SQLException;
    void setNetworkTimeout(Executor executor, int milliseconds) throws SQLException;
    int getNetworkTimeout() throws SQLException;
    default void beginRequest() throws SQLException { /* Default method takes no action */ }
    default void endRequest() throws SQLException { /* Default method takes no action */ }
    default boolean setShardingKeyIfValid(ShardingKey shardingKey, ShardingKey superShardingKey, int timeout) throws SQLException { throw new SQLFeatureNotSupportedException("setShardingKeyIfValid not implemented"); }
    default boolean setShardingKeyIfValid(ShardingKey shardingKey, int timeout) throws SQLException { throw new SQLFeatureNotSupportedException("setShardingKeyIfValid not implemented"); }
    default void setShardingKey(ShardingKey shardingKey, ShardingKey superShardingKey) throws SQLException { throw new SQLFeatureNotSupportedException("setShardingKey not implemented"); }
    default void setShardingKey(ShardingKey shardingKey) throws SQLException { throw new SQLFeatureNotSupportedException("setShardingKey not implemented"); }
}
