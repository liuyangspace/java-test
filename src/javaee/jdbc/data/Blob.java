package javaee.jdbc.data;

import java.io.InputStream;
import java.sql.Connection;
import java.sql.SQLException;

/**
 * The representation (mapping) in the Java&trade; programming language of an SQL @code BLOB} value.  An SQL {@code BLOB}
 * is a built-in type that stores a Binary Large Object as a column value in a row of a database table.
 *
 * @see java.sql.Blob
 * @see Connection#createBlob()
 */
public interface Blob extends java.sql.Blob{

    long length() throws SQLException;
    byte[] getBytes(long pos, int length) throws SQLException;
    java.io.InputStream getBinaryStream () throws SQLException;
    long position(byte pattern[], long start) throws SQLException;
    long position(java.sql.Blob pattern, long start) throws SQLException;
    int setBytes(long pos, byte[] bytes) throws SQLException;
    int setBytes(long pos, byte[] bytes, int offset, int len) throws SQLException;
    java.io.OutputStream setBinaryStream(long pos) throws SQLException;
    void truncate(long len) throws SQLException;
    void free() throws SQLException;
    InputStream getBinaryStream(long pos, long length) throws SQLException;

}
