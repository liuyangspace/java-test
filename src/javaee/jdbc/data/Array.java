package javaee.jdbc.data;

import java.sql.ResultSet;
import java.sql.SQLException;

/**
 * The mapping in the Java programming language for the SQL type <code>ARRAY</code>.
 * By default, an <code>Array</code> value is a transaction-duration
 * reference to an SQL <code>ARRAY</code> value.  By default, an <code>Array</code>
 * object is implemented using an SQL LOCATOR(array) internally, which
 * means that an <code>Array</code> object contains a logical pointer
 * to the data in the SQL <code>ARRAY</code> value rather
 * than containing the <code>ARRAY</code> value's data.
 *
 * @see java.sql.Array
 */
public interface Array extends java.sql.Array{

    String getBaseTypeName() throws SQLException;
    int getBaseType() throws SQLException;
    Object getArray() throws SQLException;
    Object getArray(java.util.Map<String,Class<?>> map) throws SQLException;
    Object getArray(long index, int count) throws SQLException;
    Object getArray(long index, int count, java.util.Map<String,Class<?>> map) throws SQLException;

    ResultSet getResultSet () throws SQLException;
    ResultSet getResultSet (java.util.Map<String,Class<?>> map) throws SQLException;
    ResultSet getResultSet (long index, int count) throws SQLException;
    ResultSet getResultSet (long index, int count, java.util.Map<String,Class<?>> map) throws SQLException;
    void free() throws SQLException;

}
