package javaee.jdbc.data;

import java.io.Reader;
import java.sql.Connection;
import java.sql.SQLException;

/**
 * The mapping in the Java&trade; programming language for the SQL {@code CLOB} type. An SQL {@code CLOB} is a built-in
 * type that stores a Character Large Object as a column value in a row of a database table.
 *
 * @see java.sql.Clob
 * @see Connection#createClob()
 */
public interface Clob extends java.sql.Clob{

    long length() throws SQLException;
    String getSubString(long pos, int length) throws SQLException;
    java.io.Reader getCharacterStream() throws SQLException;
    java.io.InputStream getAsciiStream() throws SQLException;
    long position(String searchstr, long start) throws SQLException;
    long position(java.sql.Clob searchstr, long start) throws SQLException;
    int setString(long pos, String str) throws SQLException;
    int setString(long pos, String str, int offset, int len) throws SQLException;
    java.io.OutputStream setAsciiStream(long pos) throws SQLException;
    java.io.Writer setCharacterStream(long pos) throws SQLException;
    void truncate(long len) throws SQLException;
    void free() throws SQLException;
    Reader getCharacterStream(long pos, long length) throws SQLException;

}
