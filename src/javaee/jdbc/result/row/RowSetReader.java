package javaee.jdbc.result.row;

import javax.sql.RowSetInternal;
import java.sql.SQLException;

/**
 * The facility that a disconnected <code>RowSet</code> object calls on
 * to populate itself with rows of data. A reader (an object implementing the
 * <code>RowSetReader</code> interface) may be registered with
 * a <code>RowSet</code> object that supports the reader/writer paradigm.
 * When the <code>RowSet</code> object's <code>execute</code> method is
 * called, it in turn calls the reader's <code>readData</code> method.
 *
 * @see javax.sql.RowSetReader
 */
public interface RowSetReader extends javax.sql.RowSetReader{

    void readData(RowSetInternal caller) throws SQLException;

}
