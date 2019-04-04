package javaee.jdbc.source.pooled;

import javax.sql.StatementEvent;

/**
 * An object that registers to be notified of events that occur on PreparedStatements
 * that are in the Statement pool.
 *
 * @see javax.sql.StatementEventListener
 */
public interface StatementEventListener extends javax.sql.StatementEventListener {

    void statementClosed(StatementEvent event);
    void statementErrorOccurred(StatementEvent event);

}
