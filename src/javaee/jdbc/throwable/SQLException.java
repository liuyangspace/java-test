package javaee.jdbc.throwable;

/**
 * <P>An exception that provides information on a database access
 * error or other errors.
 *
 * <P>Each <code>SQLException</code> provides several kinds of information:
 * <UL>
 *   <LI> a string describing the error.  This is used as the Java Exception
 *       message, available via the method <code>getMessage</code>.
 *   <LI> a "SQLstate" string, which follows either the XOPEN SQLstate conventions
 *        or the SQL:2003 conventions.
 *       The values of the SQLState string are described in the appropriate spec.
 *       The <code>DatabaseMetaData</code> method <code>getSQLStateType</code>
 *       can be used to discover whether the driver returns the XOPEN type or
 *       the SQL:2003 type.
 *   <LI> an integer error code that is specific to each vendor.  Normally this will
 *       be the actual error code returned by the underlying database.
 *   <LI> a chain to a next Exception.  This can be used to provide additional
 *       error information.
 *   <LI> the causal relationship, if any for this <code>SQLException</code>.
 * </UL>
 *
 * @since 1.1
 */
public class SQLException extends java.sql.SQLException implements Iterable<Throwable> {

    /**
     *  Constructs a <code>SQLException</code> object with a given
     * <code>reason</code>, <code>SQLState</code>  and
     * <code>vendorCode</code>.
     *
     * The <code>cause</code> is not initialized, and may subsequently be
     * initialized by a call to the
     * {@link Throwable#initCause(java.lang.Throwable)} method.
     *
     * @param reason a description of the exception
     * @param SQLState an XOPEN or SQL:2003 code identifying the exception
     * @param vendorCode a database vendor-specific exception code
     */
    public SQLException(String reason, String SQLState, int vendorCode) { super(reason,SQLState,vendorCode); }


    /**
     * Constructs a <code>SQLException</code> object with a given
     * <code>reason</code> and <code>SQLState</code>.
     *
     * The <code>cause</code> is not initialized, and may subsequently be
     * initialized by a call to the
     * {@link Throwable#initCause(java.lang.Throwable)} method. The vendor code
     * is initialized to 0.
     *
     * @param reason a description of the exception
     * @param SQLState an XOPEN or SQL:2003 code identifying the exception
     */
    public SQLException(String reason, String SQLState) { super(reason,SQLState); }

    /**
     *  Constructs a <code>SQLException</code> object with a given
     * <code>reason</code>. The  <code>SQLState</code>  is initialized to
     * <code>null</code> and the vendor code is initialized to 0.
     *
     * The <code>cause</code> is not initialized, and may subsequently be
     * initialized by a call to the
     * {@link Throwable#initCause(java.lang.Throwable)} method.
     *
     * @param reason a description of the exception
     */
    public SQLException(String reason) { super(reason); }

    /**
     * Constructs a <code>SQLException</code> object.
     * The <code>reason</code>, <code>SQLState</code> are initialized
     * to <code>null</code> and the vendor code is initialized to 0.
     *
     * The <code>cause</code> is not initialized, and may subsequently be
     * initialized by a call to the
     * {@link Throwable#initCause(java.lang.Throwable)} method.
     *
     */
    public SQLException() { super(); }

    /**
     *  Constructs a <code>SQLException</code> object with a given
     * <code>cause</code>.
     * The <code>SQLState</code> is initialized
     * to <code>null</code> and the vendor code is initialized to 0.
     * The <code>reason</code>  is initialized to <code>null</code> if
     * <code>cause==null</code> or to <code>cause.toString()</code> if
     * <code>cause!=null</code>.
     *
     * @param cause the underlying reason for this <code>SQLException</code>
     * (which is saved for later retrieval by the <code>getCause()</code> method);
     * may be null indicating the cause is non-existent or unknown.
     * @since 1.6
     */
    public SQLException(Throwable cause) { super(cause); }

    /**
     * Constructs a <code>SQLException</code> object with a given
     * <code>reason</code> and  <code>cause</code>.
     * The <code>SQLState</code> is  initialized to <code>null</code>
     * and the vendor code is initialized to 0.
     *
     * @param reason a description of the exception.
     * @param cause the underlying reason for this <code>SQLException</code>
     * (which is saved for later retrieval by the <code>getCause()</code> method);
     * may be null indicating the cause is non-existent or unknown.
     * @since 1.6
     */
    public SQLException(String reason, Throwable cause){ super(reason,cause); }

    /**
     * Constructs a <code>SQLException</code> object with a given
     * <code>reason</code>, <code>SQLState</code> and  <code>cause</code>.
     * The vendor code is initialized to 0.
     *
     * @param reason a description of the exception.
     * @param sqlState an XOPEN or SQL:2003 code identifying the exception
     * @param cause the underlying reason for this <code>SQLException</code>
     * (which is saved for later retrieval by the
     * <code>getCause()</code> method); may be null indicating
     *     the cause is non-existent or unknown.
     * @since 1.6
     */
    public SQLException(String reason, String sqlState, Throwable cause) { super(reason,sqlState,cause); }

    /**
     * Constructs a <code>SQLException</code> object with a given
     * <code>reason</code>, <code>SQLState</code>, <code>vendorCode</code>
     * and  <code>cause</code>.
     *
     * @param reason a description of the exception
     * @param sqlState an XOPEN or SQL:2003 code identifying the exception
     * @param vendorCode a database vendor-specific exception code
     * @param cause the underlying reason for this <code>SQLException</code>
     * (which is saved for later retrieval by the <code>getCause()</code> method);
     * may be null indicating the cause is non-existent or unknown.
     * @since 1.6
     */
    public SQLException(String reason, String sqlState, int vendorCode, Throwable cause) { super(reason,sqlState,vendorCode,cause); }

    /**
     * Retrieves the SQLState for this <code>SQLException</code> object.
     *
     * @return the SQLState value
     */
    public String getSQLState() {
        return super.getSQLState();
    }

    /**
     * Retrieves the vendor-specific exception code
     * for this <code>SQLException</code> object.
     *
     * @return the vendor's error code
     */
    public int getErrorCode() {
        return super.getErrorCode();
    }

    /**
     * Retrieves the exception chained to this
     * <code>SQLException</code> object by setNextException(SQLException ex).
     *
     * @return the next <code>SQLException</code> object in the chain;
     *         <code>null</code> if there are none
     * @see #setNextException
     */
    public java.sql.SQLException getNextException() {
        return super.getNextException();
    }

    /**
     * Adds an <code>SQLException</code> object to the end of the chain.
     *
     * @param ex the new exception that will be added to the end of
     *            the <code>SQLException</code> chain
     * @see #getNextException
     */
    public void setNextException(java.sql.SQLException ex) { super.setNextException(ex);}

}

