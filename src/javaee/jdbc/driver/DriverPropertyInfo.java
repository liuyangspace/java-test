package javaee.jdbc.driver;

import java.util.Properties;

/**
 * Driver properties for making a connection.
 *
 * @see java.sql.Driver#getPropertyInfo(String, Properties)
 * @see java.sql.DriverPropertyInfo
 */
public class DriverPropertyInfo extends java.sql.DriverPropertyInfo {

    public DriverPropertyInfo(String name, String value) { super(name, value); }

}
