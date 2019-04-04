package javaee.jdbc.source.xa;

import javaee.jdbc.source.CommonDataSource;

import javax.sql.XAConnection;
import javax.sql.XAConnectionBuilder;
import java.sql.SQLException;
import java.sql.SQLFeatureNotSupportedException;
import java.sql.Wrapper;

/**
 * A factory for {@code XAConnection} objects that is used internally.
 * An object that implements the {@code XADataSource} interface is
 * typically registered with a naming service that uses the
 * Java Naming and Directory Interface&trade;
 * (JNDI).
 *
 * @see javax.sql.XADataSource
 */
public interface XADataSource extends javax.sql.DataSource,CommonDataSource, Wrapper {

    XAConnection getXAConnection() throws SQLException;
    XAConnection getXAConnection(String user, String password) throws SQLException;
    default XAConnectionBuilder createXAConnectionBuilder() throws SQLException {
        throw new SQLFeatureNotSupportedException("createXAConnectionBuilder not implemented");
    };

}
