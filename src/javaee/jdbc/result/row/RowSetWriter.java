package javaee.jdbc.result.row;

import javax.sql.RowSetInternal;
import java.sql.SQLException;

/**
 * An object that implements the <code>RowSetWriter</code> interface,
 * called a <i>writer</i>. A writer may be registered with a <code>RowSet</code>
 * object that supports the reader/writer paradigm.
 *
 * @see javax.sql.RowSetWriter
 */
public interface RowSetWriter extends javax.sql.RowSetWriter{

    boolean writeData(RowSetInternal caller) throws SQLException;

}
