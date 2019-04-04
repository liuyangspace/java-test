package javaee.jdbc.data;

import java.sql.SQLException;

/**
 * The mapping in the Java programming language of an SQL <code>REF</code>
 * value, which is a reference to an SQL structured type value in the database.
 *
 * @see java.sql.Ref
 */
public interface Ref {

    String getBaseTypeName() throws SQLException;
    Object getObject(java.util.Map<String,Class<?>> map) throws SQLException;
    Object getObject() throws SQLException;
    void setObject(Object value) throws SQLException;

}
