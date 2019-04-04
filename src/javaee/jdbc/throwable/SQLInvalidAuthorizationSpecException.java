package javaee.jdbc.throwable;

import java.sql.SQLException;

/**
 * The subclass of {@link SQLException} thrown when the SQLState class value
 * is '<i>28</i>', or under vendor-specified conditions. This indicates that
 * the authorization credentials presented during connection establishment
 * are not valid.
 * <p>
 * Please consult your driver vendor documentation for the vendor-specified
 * conditions for which this <code>Exception</code> may be thrown.
 *
 * @see java.sql.SQLNonTransientException
 * @see java.sql.SQLInvalidAuthorizationSpecException
 */
public class SQLInvalidAuthorizationSpecException extends java.sql.SQLInvalidAuthorizationSpecException{

    public SQLInvalidAuthorizationSpecException() {
        super();
    }

    public SQLInvalidAuthorizationSpecException(String reason) {
        super(reason);
    }

    public SQLInvalidAuthorizationSpecException(String reason, String SQLState) {
        super(reason,SQLState);
    }

    public SQLInvalidAuthorizationSpecException(String reason, String SQLState, int vendorCode) {
        super(reason,SQLState,vendorCode);
    }

    public SQLInvalidAuthorizationSpecException(Throwable cause) {
        super(cause);
    }

    public SQLInvalidAuthorizationSpecException(String reason, Throwable cause) {
        super(reason,cause);
    }

    public SQLInvalidAuthorizationSpecException(String reason, String SQLState, Throwable cause) {
        super(reason,SQLState,cause);
    }

    public SQLInvalidAuthorizationSpecException(String reason, String SQLState, int vendorCode, Throwable cause) {
        super(reason,SQLState,vendorCode,cause);
    }
}
