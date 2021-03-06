package javaee.jdbc.result;

import java.sql.SQLException;
import java.sql.Wrapper;

/**
 * An object that can be used to get information about the types
 * and properties of the columns in a <code>ResultSet</code> object.
 *
 * e.g:
 *     ResultSet rs = stmt.executeQuery("SELECT a, b, c FROM TABLE2");
 *     ResultSetMetaData rsmd = rs.getMetaData();
 *     int numberOfColumns = rsmd.getColumnCount();
 *     boolean b = rsmd.isSearchable(1);
 * @see java.sql.ResultSetMetaData
 */
public interface ResultSetMetaData extends Wrapper {

    boolean isAutoIncrement(int column) throws SQLException;
    boolean isCaseSensitive(int column) throws SQLException;
    boolean isSearchable(int column) throws SQLException;
    boolean isCurrency(int column) throws SQLException;
    boolean isReadOnly(int column) throws SQLException;
    int isNullable(int column) throws SQLException;
    boolean isSigned(int column) throws SQLException;
    boolean isWritable(int column) throws SQLException;
    boolean isDefinitelyWritable(int column) throws SQLException;

    int getColumnCount() throws SQLException;
    int getColumnDisplaySize(int column) throws SQLException;
    String getColumnLabel(int column) throws SQLException;
    String getColumnName(int column) throws SQLException;
    String getSchemaName(int column) throws SQLException;
    String getTableName(int column) throws SQLException;
    String getCatalogName(int column) throws SQLException;
    int getColumnType(int column) throws SQLException;
    String getColumnTypeName(int column) throws SQLException;
    int getPrecision(int column) throws SQLException;
    int getScale(int column) throws SQLException;
    String getColumnClassName(int column) throws SQLException;
}
