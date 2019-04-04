package javaee.jdbc.data;

/**
 * An object that is used to identify a generic SQL type, called a JDBC type or
 * a vendor specific data type.
 *
 * @see java.sql.SQLType
 */
public interface SQLType {

    String getName();
    String getVendor();
    Integer getVendorTypeNumber();

}
