package javaee.jdbc.throwable;

import java.sql.SQLException;

/**
 * The subclass of {@link SQLException} thrown when the SQLState class value
 * is '<i>22</i>', or under vendor-specified conditions.  This indicates
 * various data errors, including but not limited to data conversion errors,
 * division by 0, and invalid arguments to functions.
 * <p>
 * Please consult your driver vendor documentation for the vendor-specified
 * conditions for which this <code>Exception</code> may be thrown.
 *
 * @see java.sql.SQLDataException
 */
public class SQLDataException extends java.sql.SQLDataException {

    public SQLDataException() {
        super();
    }

    public SQLDataException(String reason) {
        super(reason);
    }

    public SQLDataException(String reason, String SQLState) {
        super(reason, SQLState);
    }

    public SQLDataException(String reason, String SQLState, int vendorCode) {
        super(reason, SQLState, vendorCode);
    }

    public SQLDataException(Throwable cause) {
        super(cause);
    }

    public SQLDataException(String reason, Throwable cause) {
        super(reason, cause);
    }

    public SQLDataException(String reason, String SQLState, Throwable cause) {
        super(reason, SQLState, cause);
    }

    public SQLDataException(String reason, String SQLState, int vendorCode, Throwable cause) {
        super(reason, SQLState, vendorCode, cause);
    }

}
