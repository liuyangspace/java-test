package javaee.jdbc.connection;

import java.sql.Connection;
import java.sql.SQLException;
import java.sql.ShardingKey;
import java.sql.ShardingKeyBuilder;

/**
 * A builder created from a {@code DataSource} object,
 * used to establish a connection to the database that the
 * {@code data source} object represents.
 * e.g:
 *     DataSource ds = new MyDataSource();
 *     ShardingKey superShardingKey = ds.createShardingKeyBuilder()
 *                           .subkey("EASTERN_REGION", JDBCType.VARCHAR)
 *                           .build();
 *     ShardingKey shardingKey = ds.createShardingKeyBuilder()
 *                           .subkey("PITTSBURGH_BRANCH", JDBCType.VARCHAR)
 *                           .build();
 *     Connection con = ds.createConnectionBuilder()
 *                       .user("rafa")
 *                       .password("tennis")
 *                       .setShardingKey(shardingKey)
 *                       .setSuperShardingKey(superShardingKey)
 *                       .build();
 * @see java.sql.ConnectionBuilder
 * @since 9
 */
public interface ConnectionBuilder extends java.sql.ConnectionBuilder{
    /**
     * Specifies the username to be used when creating a connection
     *
     * @param username the database user on whose behalf the connection is being
     * made
     * @return the same {@code ConnectionBuilder} instance
     */
    java.sql.ConnectionBuilder user(String username);

    /**
     * Specifies the password to be used when creating a connection
     *
     * @param password the password to use for this connection. May be {@code null}
     * @return the same {@code ConnectionBuilder} instance
     */
    java.sql.ConnectionBuilder password(String password);

    /**
     * Specifies a {@code shardingKey} to be used when creating a connection
     *
     * @param shardingKey the ShardingKey. May be {@code null}
     * @return the same {@code ConnectionBuilder} instance
     * @see java.sql.ShardingKey
     * @see java.sql.ShardingKeyBuilder
     */
    java.sql.ConnectionBuilder shardingKey(java.sql.ShardingKey shardingKey);

    /**
     * Specifies a {@code superShardingKey} to be used when creating a connection
     *
     * @param superShardingKey the SuperShardingKey. May be {@code null}
     * @return the same {@code ConnectionBuilder} instance
     * @see java.sql.ShardingKey
     * @see ShardingKeyBuilder
     */
    java.sql.ConnectionBuilder superShardingKey(ShardingKey superShardingKey);

    /**
     * Returns an instance of the object defined by this builder.
     *
     * @return The built object
     * @throws java.sql.SQLException If an error occurs building the object
     */
    Connection build() throws SQLException;
}
