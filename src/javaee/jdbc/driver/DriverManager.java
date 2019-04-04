package javaee.jdbc.driver;

import java.sql.Connection;
import java.sql.Driver;
import java.sql.DriverAction;
import java.sql.SQLException;
import java.util.Enumeration;
import java.util.stream.Stream;

/**
 * The basic service for managing a set of JDBC drivers.
 * <strong>NOTE:</strong> The {@link javax.sql.DataSource} interface, provides
 * another way to connect to a data source.
 *
 * @see java.sql.DriverManager
 * @see javax.sql.DataSource
 * @see java.sql.Driver
 * @see java.sql.Connection
 */
public class DriverManager {
    private DriverManager(){}

    public static void registerDriver(java.sql.Driver driver) throws SQLException { java.sql.DriverManager.registerDriver(driver); }
    public static void registerDriver(java.sql.Driver driver,DriverAction da) throws SQLException { java.sql.DriverManager.registerDriver(driver,da); }
    public static void deregisterDriver(Driver driver) throws SQLException { java.sql.DriverManager.registerDriver(driver); }
    public static Enumeration<Driver> getDrivers() { return java.sql.DriverManager.getDrivers(); }
    public static Stream<Driver> drivers() { return java.sql.DriverManager.drivers(); }
    public static Driver getDriver(String url) throws SQLException { return java.sql.DriverManager.getDriver(url); }

    public static void setLoginTimeout(int seconds){ java.sql.DriverManager.setLoginTimeout(seconds); }
    public static int getLoginTimeout(){ return java.sql.DriverManager.getLoginTimeout(); }

    public static Connection getConnection(String url, java.util.Properties info) throws SQLException { return java.sql.DriverManager.getConnection(url,info); }
    public static Connection getConnection(String url, String user, String password) throws SQLException { return java.sql.DriverManager.getConnection(url,user,password); }
    public static Connection getConnection(String url) throws SQLException { return java.sql.DriverManager.getConnection(url); }
    // log
    public static java.io.PrintWriter getLogWriter(){ return java.sql.DriverManager.getLogWriter(); }
    public static void setLogWriter(java.io.PrintWriter out) {  java.sql.DriverManager.setLogWriter(out); }
    public static void setLogStream(java.io.PrintStream out) { java.sql.DriverManager.setLogStream(out); }
    public static java.io.PrintStream getLogStream() { return java.sql.DriverManager.getLogStream(); }
    public static void println(String message) { java.sql.DriverManager.println(message);; }
}
