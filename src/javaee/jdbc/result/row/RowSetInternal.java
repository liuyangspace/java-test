package javaee.jdbc.result.row;

import javax.sql.RowSetMetaData;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;

/**
 * The interface that a <code>RowSet</code> object implements in order to
 * present itself to a <code>RowSetReader</code> or <code>RowSetWriter</code>
 * object. The <code>RowSetInternal</code> interface contains
 * methods that let the reader or writer access and modify the internal
 * state of the rowset.
 *
 * @see javax.sql.RowSetInternal
 */
public interface RowSetInternal extends javax.sql.RowSetInternal {

    Object[] getParams() throws SQLException;
    Connection getConnection() throws SQLException;
    void setMetaData(RowSetMetaData md) throws SQLException;
    public ResultSet getOriginal() throws SQLException;
    public ResultSet getOriginalRow() throws SQLException;

}
