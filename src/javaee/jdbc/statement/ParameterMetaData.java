package javaee.jdbc.statement;

import java.sql.SQLException;
import java.sql.Wrapper;

/**
 * An object that can be used to get information about the types
 * and properties for each parameter marker in a
 * <code>PreparedStatement</code> object.
 *
 * @see java.sql.PreparedStatement
 * @see java.sql.ParameterMetaData
 */
public interface ParameterMetaData extends Wrapper {

    int getParameterCount() throws SQLException;
    int isNullable(int param) throws SQLException;
    boolean isSigned(int param) throws SQLException;
    int getPrecision(int param) throws SQLException;
    int getScale(int param) throws SQLException;
    int getParameterType(int param) throws SQLException;
    String getParameterTypeName(int param) throws SQLException;
    String getParameterClassName(int param) throws SQLException;
    int getParameterMode(int param) throws SQLException;

}
