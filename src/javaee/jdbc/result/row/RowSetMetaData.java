package javaee.jdbc.result.row;

import java.sql.ResultSetMetaData;
import java.sql.SQLException;
import java.sql.Types;

/**
 * An object that contains information about the columns in a
 * <code>RowSet</code> object.
 *
 * @see javax.sql.RowSetMetaData
 */
public interface RowSetMetaData extends javax.sql.RowSetMetaData,ResultSetMetaData {

    void setColumnCount(int columnCount) throws SQLException;
    void setAutoIncrement(int columnIndex, boolean property) throws SQLException;
    void setCaseSensitive(int columnIndex, boolean property) throws SQLException;
    void setSearchable(int columnIndex, boolean property) throws SQLException;
    void setCurrency(int columnIndex, boolean property) throws SQLException;
    void setNullable(int columnIndex, int property) throws SQLException;
    void setSigned(int columnIndex, boolean property) throws SQLException;
    void setColumnDisplaySize(int columnIndex, int size) throws SQLException;
    void setColumnLabel(int columnIndex, String label) throws SQLException;
    void setColumnName(int columnIndex, String columnName) throws SQLException;
    void setSchemaName(int columnIndex, String schemaName) throws SQLException;
    void setPrecision(int columnIndex, int precision) throws SQLException;
    void setScale(int columnIndex, int scale) throws SQLException;
    void setTableName(int columnIndex, String tableName) throws SQLException;
    void setCatalogName(int columnIndex, String catalogName) throws SQLException;
    void setColumnType(int columnIndex, int SQLType) throws SQLException;
    void setColumnTypeName(int columnIndex, String typeName) throws SQLException;

}
