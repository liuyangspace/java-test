package javaee.jdbc.result.row;

import javax.sql.RowSet;

/**
 * @see java.util.EventObject
 * @see javax.sql.RowSetEvent
 */
public class RowSetEvent extends javax.sql.RowSetEvent  {

    public RowSetEvent(RowSet source) { super(source); }

}
