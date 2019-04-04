package javaee.jdbc.source.pooled;

import javax.sql.PooledConnection;
import java.sql.SQLException;

/**
 * @see java.util.EventObject
 * @see javax.sql.ConnectionEvent
 * @see javax.sql.PooledConnection
 * @see javax.sql.ConnectionEventListener
 */
public class ConnectionEvent extends javax.sql.ConnectionEvent {

    public ConnectionEvent(PooledConnection con) { super(con); }
    public ConnectionEvent(PooledConnection con, SQLException ex) { super(con, ex); }

    public SQLException getSQLException() { return super.getSQLException(); }

}
