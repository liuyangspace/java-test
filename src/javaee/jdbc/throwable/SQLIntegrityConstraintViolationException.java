package javaee.jdbc.throwable;

import java.sql.SQLException;

/**
 * The subclass of {@link SQLException} thrown when the SQLState class value
 * is '<i>23</i>', or under vendor-specified conditions.
 * This indicates that an integrity
 * constraint (foreign key, primary key or unique key) has been violated.
 * <p>
 * Please consult your driver vendor documentation for the vendor-specified
 * conditions for which this <code>Exception</code> may be thrown.
 *
 * @see java.sql.SQLNonTransientException
 * @see java.sql.SQLIntegrityConstraintViolationException
 */
public class SQLIntegrityConstraintViolationException extends java.sql.SQLIntegrityConstraintViolationException {

    public SQLIntegrityConstraintViolationException() {
        super();
    }


    public SQLIntegrityConstraintViolationException(String reason) {
        super(reason);
    }


    public SQLIntegrityConstraintViolationException(String reason, String SQLState) {
        super(reason,SQLState);
    }


    public SQLIntegrityConstraintViolationException(String reason, String SQLState, int vendorCode) {
        super(reason,SQLState,vendorCode);
    }


    public SQLIntegrityConstraintViolationException(Throwable cause) {
        super(cause);
    }


    public SQLIntegrityConstraintViolationException(String reason, Throwable cause) {
        super(reason,cause);
    }


    public SQLIntegrityConstraintViolationException(String reason, String SQLState, Throwable cause) {
        super(reason,SQLState, cause);
    }


    public SQLIntegrityConstraintViolationException(String reason, String SQLState, int vendorCode, Throwable cause) {
        super(reason,SQLState,vendorCode,cause);
    }
}
