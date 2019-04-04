package javaee.jdbc.throwable;

import java.sql.SQLException;

/**
 * The subclass of {@link SQLException} thrown when the SQLState class value is '<i>0A</i>'
 * ( the value is 'zero' A).
 * This indicates that the JDBC driver does not support an optional JDBC feature.
 * Optional JDBC features can fall into the fallowing categories:
 *
 *<UL>
 *<LI>no support for an optional feature
 *<LI>no support for an optional overloaded method
 *<LI>no support for an optional mode for a method.  The mode for a method is
 *determined based on constants passed as parameter values to a method
 *</UL>
 *
 * @see java.sql.SQLNonTransientException
 * @see java.sql.SQLFeatureNotSupportedException
 */
public class SQLFeatureNotSupportedException extends java.sql.SQLFeatureNotSupportedException{

    public SQLFeatureNotSupportedException() {
        super();
    }

    public SQLFeatureNotSupportedException(String reason) {
        super(reason);
    }

    public SQLFeatureNotSupportedException(String reason, String SQLState) {
        super(reason,SQLState);
    }

    public SQLFeatureNotSupportedException(String reason, String SQLState, int vendorCode) {
        super(reason,SQLState,vendorCode);
    }

    public SQLFeatureNotSupportedException(Throwable cause) {
        super(cause);
    }

    public SQLFeatureNotSupportedException(String reason, Throwable cause) {
        super(reason,cause);
    }

    public SQLFeatureNotSupportedException(String reason, String SQLState, Throwable cause) {
        super(reason,SQLState,cause);
    }

    public SQLFeatureNotSupportedException(String reason, String SQLState, int vendorCode, Throwable cause) {
        super(reason,SQLState,vendorCode,cause);
    }

}
