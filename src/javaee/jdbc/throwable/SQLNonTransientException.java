package javaee.jdbc.throwable;

import java.sql.SQLException;

/**
 * The subclass of {@link SQLException} thrown when an instance where a retry
 * of the same operation would fail unless the cause of the <code>SQLException</code>
 * is corrected.
 *
 * @see java.sql.SQLException
 * @see java.sql.SQLNonTransientException
 */
public class SQLNonTransientException extends java.sql.SQLNonTransientException{

    public SQLNonTransientException() {
        super();
    }

    public SQLNonTransientException(String reason) {
        super(reason);
    }

    public SQLNonTransientException(String reason, String SQLState) {
        super(reason,SQLState);
    }

    public SQLNonTransientException(String reason, String SQLState, int vendorCode) {
        super(reason,SQLState,vendorCode);
    }

    public SQLNonTransientException(Throwable cause) {
        super(cause);
    }

    public SQLNonTransientException(String reason, Throwable cause) {
        super(reason,cause);

    }

    public SQLNonTransientException(String reason, String SQLState, Throwable cause) {
        super(reason,SQLState,cause);
    }

    public SQLNonTransientException(String reason, String SQLState, int vendorCode, Throwable cause) {
        super(reason,SQLState,vendorCode,cause);
    }
}
