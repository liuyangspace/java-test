package javaee.jdbc.throwable;

import java.sql.SQLException;

/**
 * he subclass of {@link SQLException} thrown for the SQLState
 * class value '<i>08</i>', or under vendor-specified conditions.  This
 * indicates that the connection operation that failed will not succeed if
 * the operation is retried without the cause of the failure being corrected.
 * <p>
 * Please consult your driver vendor documentation for the vendor-specified
 * conditions for which this <code>Exception</code> may be thrown.
 *
 * @see java.sql.SQLNonTransientException
 * @see java.sql.SQLNonTransientConnectionException
 */
public class SQLNonTransientConnectionException extends java.sql.SQLNonTransientConnectionException{

    public SQLNonTransientConnectionException() {
        super();
    }

    public SQLNonTransientConnectionException(String reason) {
        super(reason);
    }

    public SQLNonTransientConnectionException(String reason, String SQLState) {
        super(reason,SQLState);
    }

    public SQLNonTransientConnectionException(String reason, String SQLState, int vendorCode) {
        super(reason,SQLState,vendorCode);
    }

    public SQLNonTransientConnectionException(Throwable cause) {
        super(cause);
    }

    public SQLNonTransientConnectionException(String reason, Throwable cause) {
        super(reason,cause);
    }

    public SQLNonTransientConnectionException(String reason, String SQLState, Throwable cause) {
        super(reason,SQLState,cause);
    }

    public SQLNonTransientConnectionException(String reason, String SQLState, int vendorCode, Throwable cause) {
        super(reason,SQLState,vendorCode,cause);
    }

}
