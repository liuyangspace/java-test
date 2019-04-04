package javaee.jdbc.throwable;

import java.sql.ClientInfoStatus;
import java.sql.SQLException;
import java.util.Map;

/**
 * The subclass of {@link SQLException} is thrown when one or more client info properties
 * could not be set on a <code>Connection</code>.  In addition to the information provided
 * by <code>SQLException</code>, a <code>SQLClientInfoException</code> provides a list of client info
 * properties that were not set.
 *
 * @see java.sql.SQLException
 * @see java.sql.SQLClientInfoException
 */
public class SQLClientInfoException extends java.sql.SQLClientInfoException{

    public SQLClientInfoException() { super();}
    public SQLClientInfoException(Map<String, ClientInfoStatus> failedProperties) {super(failedProperties);}
    public SQLClientInfoException(Map<String, ClientInfoStatus> failedProperties, Throwable cause) { super(failedProperties,cause); }
    public SQLClientInfoException(String reason, Map<String, ClientInfoStatus> failedProperties) { super(reason,failedProperties); }
    public SQLClientInfoException(String reason, Map<String, ClientInfoStatus> failedProperties, Throwable cause) {super(reason,failedProperties,cause);}
    public SQLClientInfoException(String reason, String SQLState, Map<String, ClientInfoStatus> failedProperties) {super(reason,SQLState,failedProperties); }
    public SQLClientInfoException(String reason, String SQLState, Map<String, ClientInfoStatus> failedProperties, Throwable cause) {super(reason,SQLState,failedProperties,cause);}
    public SQLClientInfoException(String reason, String SQLState, int vendorCode, Map<String, ClientInfoStatus> failedProperties) {super(reason,SQLState,vendorCode,failedProperties);}
    public SQLClientInfoException(String reason, String SQLState, int vendorCode, Map<String, ClientInfoStatus> failedProperties, Throwable cause)
        { super(reason,SQLState,vendorCode,failedProperties,cause);}

    public Map<String, ClientInfoStatus> getFailedProperties() { return super.getFailedProperties(); }

}
