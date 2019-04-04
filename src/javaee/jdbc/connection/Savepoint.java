package javaee.jdbc.connection;

import java.sql.SQLException;

/**
 * The representation of a savepoint, which is a point within
 * the current transaction that can be referenced from the
 * <code>Connection.rollback</code> method.
 *
 * @see java.sql.Savepoint
 */
public interface Savepoint extends java.sql.Savepoint{
    /**
     * Retrieves the generated ID for the savepoint that this
     * <code>Savepoint</code> object represents.
     * @return the numeric ID of this savepoint
     * @exception SQLException if this is a named savepoint
     * @since 1.4
     */
    int getSavepointId() throws SQLException;

    /**
     * Retrieves the name of the savepoint that this <code>Savepoint</code>
     * object represents.
     * @return the name of this savepoint
     * @exception SQLException if this is an un-named savepoint
     * @since 1.4
     */
    String getSavepointName() throws SQLException;
}