package javaee.jdbc.source.xa;

import javax.sql.PooledConnection;
import java.sql.SQLException;
import java.sql.SQLFeatureNotSupportedException;

/**
 * An object that provides support for distributed transactions. An
 * {@code XAConnection} object may be enlisted in a distributed transaction
 * by means of an {@code XAResource} object. A transaction manager, usually
 * part of a middle tier server, manages an {@code XAConnection} object
 * through the {@code XAResource} object.
 * <P>
 * An application programmer does not use this interface directly; rather, it is
 * used by a transaction manager working in the middle tier server.
 *
 * @see javax.sql.XAConnection
 * @see javax.sql.PooledConnection
 */
public interface XAConnection extends PooledConnection {
    /**
     * Retrieves an {@code XAResource} object that the transaction manager
     * will use to manage this {@code XAConnection} object's participation
     * in a distributed transaction.
     *
     * @return the {@code XAResource} object
     * @exception SQLException if a database access error occurs
     * @exception SQLFeatureNotSupportedException if the JDBC driver does not
     * support this method
     * @since 1.4
     */
    javax.transaction.xa.XAResource getXAResource() throws SQLException;
}
