package javaee.jdbc.result.row;

import javax.sql.RowSetEvent;

/**
 * An interface that must be implemented by a
 * component that wants to be notified when a significant
 * event happens in the life of a <code>RowSet</code> object.
 * A component becomes a listener by being registered with a
 * <code>RowSet</code> object via the method <code>RowSet.addRowSetListener</code>.
 * How a registered component implements this interface determines what it does
 * when it is notified of an event.
 *
 * @see javax.sql.RowSetListener
 */
public interface RowSetListener extends javax.sql.RowSetListener,java.util.EventListener {

    void rowSetChanged(javax.sql.RowSetEvent event);
    void rowChanged(javax.sql.RowSetEvent event);
    void cursorMoved(RowSetEvent event);

}
