package javaee.jdbc.data;

import java.sql.SQLException;

/**
 * The standard mapping in the Java programming language for an SQL structured type. A <code>Struct</code> object
 * contains a value for each attribute of the SQL structured type that it represents.
 *
 * @see java.sql.Struct
 */
public interface Struct extends java.sql.Struct {

    String getSQLTypeName() throws SQLException;
    Object[] getAttributes() throws SQLException;
    Object[] getAttributes(java.util.Map<String,Class<?>> map) throws SQLException;

}
