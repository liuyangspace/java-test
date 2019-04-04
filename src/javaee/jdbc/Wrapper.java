package javaee.jdbc;

/**
 * Interface for JDBC classes which provide the ability to retrieve the delegate instance when the instance
 * in question is in fact a proxy class.
 *
 * @see java.sql.Wrapper
 */
public interface Wrapper {
    <T> T unwrap(java.lang.Class<T> iface) throws java.sql.SQLException;
    boolean isWrapperFor(java.lang.Class<?> iface) throws java.sql.SQLException;
}
