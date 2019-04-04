package javaee.jdbc.source.xa;

import javax.sql.XAConnection;
import java.sql.SQLException;
import java.sql.ShardingKey;

/**
 * A builder created from a {@code XADataSource} object,
 * used to establish a connection to the database that the
 * {@code data source} object represents.  The connection
 * properties that were specified for the {@code data source} are used as the
 * default values by the {@code XAConnectionBuilder}.
 * <p>The following example illustrates the use of {@code XAConnectionBuilder}
 * to create a {@link XAConnection}:
 *
 * <pre>{@code
 *     XADataSource ds = new MyXADataSource();
 *     ShardingKey superShardingKey = ds.createShardingKeyBuilder()
 *                           .subkey("EASTERN_REGION", JDBCType.VARCHAR)
 *                           .build();
 *     ShardingKey shardingKey = ds.createShardingKeyBuilder()
 *                           .subkey("PITTSBURGH_BRANCH", JDBCType.VARCHAR)
 *                           .build();
 *     XAConnection con = ds.createXAConnectionBuilder()
 *                       .user("rafa")
 *                       .password("tennis")
 *                       .setShardingKey(shardingKey)
 *                       .setSuperShardingKey(superShardingKey)
 *                       .build();
 * }</pre>
 *
 * @since 9
 *
 * @see javax.sql.XAConnectionBuilder
 */
public interface XAConnectionBuilder extends javax.sql.XAConnectionBuilder {

    javax.sql.XAConnectionBuilder user(String username);
    javax.sql.XAConnectionBuilder password(String password);
    javax.sql.XAConnectionBuilder shardingKey(ShardingKey shardingKey);
    javax.sql.XAConnectionBuilder superShardingKey(ShardingKey superShardingKey);
    XAConnection build() throws SQLException;

}
