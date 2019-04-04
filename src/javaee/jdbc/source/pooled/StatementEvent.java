package javaee.jdbc.source.pooled;

import javax.sql.PooledConnection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

/**
 * A <code>StatementEvent</code> is sent to all <code>StatementEventListener</code>s which were
 * registered with a <code>PooledConnection</code>. This occurs when the driver determines that a
 * <code>PreparedStatement</code> that is associated with the <code>PooledConnection</code> has been closed or the driver determines
 * is invalid.
 *
 * @see javax.sql.StatementEvent
 */
public class StatementEvent extends javax.sql.StatementEvent {

    public StatementEvent(PooledConnection con, PreparedStatement statement) { super(con, statement); }
    public StatementEvent(PooledConnection con, PreparedStatement statement, SQLException exception) { super(con, statement, exception); }

    public PreparedStatement getStatement() { return super.getStatement(); }
    public SQLException getSQLException() { return super.getSQLException(); }

}
