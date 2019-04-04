package javaee.jdbc.source.pooled;

import javax.sql.PooledConnection;
import javax.sql.XAConnection;
import java.sql.SQLException;
import java.sql.ShardingKey;

/**
 * A builder created from a {@code ConnectionPoolDataSource} object,
 * used to establish a connection to the database that the
 * {@code data source} object represents.  The connection
 * properties that were specified for the {@code data source} are used as the
 * default values by the {@code PooledConnectionBuilder}.
 * <p>The following example illustrates the use of {@code PooledConnectionBuilder}
 * to create a {@link XAConnection}:
 *
 * <pre>{@code
 *     ConnectionPoolDataSource ds = new MyConnectionPoolDataSource();
 *     ShardingKey superShardingKey = ds.createShardingKeyBuilder()
 *                           .subkey("EASTERN_REGION", JDBCType.VARCHAR)
 *                           .build();
 *     ShardingKey shardingKey = ds.createShardingKeyBuilder()
 *                           .subkey("PITTSBURGH_BRANCH", JDBCType.VARCHAR)
 *                           .build();
 *     PooledConnection con = ds.createPooledConnectionBuilder()
 *                       .user("rafa")
 *                       .password("tennis")
 *                       .setShardingKey(shardingKey)
 *                       .setSuperShardingKey(superShardingKey)
 *                       .build();
 * }</pre>
 *
 * @since 9
 * @see javax.sql.PooledConnectionBuilder
 */
public interface PooledConnectionBuilder extends javax.sql.PooledConnectionBuilder{

    javax.sql.PooledConnectionBuilder user(String username);
    javax.sql.PooledConnectionBuilder password(String password);
    javax.sql.PooledConnectionBuilder shardingKey(ShardingKey shardingKey);
    javax.sql.PooledConnectionBuilder superShardingKey(ShardingKey superShardingKey);
    PooledConnection build() throws SQLException;

}
