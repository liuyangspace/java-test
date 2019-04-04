package javaee.jdbc.data;

import java.sql.*;
import java.sql.Array;
import java.sql.Blob;
import java.sql.Clob;
import java.sql.NClob;
import java.sql.Ref;
import java.sql.RowId;
import java.sql.SQLXML;

/**
 * An input stream that contains a stream of values representing an
 * instance of an SQL structured type or an SQL distinct type.
 *
 * @see java.sql.SQLInput
 */
public interface SQLInput extends java.sql.SQLInput {

    String readString() throws SQLException;
    boolean readBoolean() throws SQLException;
    byte readByte() throws SQLException;
    byte[] readBytes() throws SQLException;
    short readShort() throws SQLException;
    int readInt() throws SQLException;
    long readLong() throws SQLException;
    float readFloat() throws SQLException;
    double readDouble() throws SQLException;
    java.math.BigDecimal readBigDecimal() throws SQLException;
    java.sql.Date readDate() throws SQLException;
    java.sql.Time readTime() throws SQLException;
    java.sql.Timestamp readTimestamp() throws SQLException;
    java.io.Reader readCharacterStream() throws SQLException;
    java.io.InputStream readAsciiStream() throws SQLException;
    java.io.InputStream readBinaryStream() throws SQLException;
    Object readObject() throws SQLException;
    Ref readRef() throws SQLException;
    Blob readBlob() throws SQLException;
    Clob readClob() throws SQLException;
    Array readArray() throws SQLException;
    boolean wasNull() throws SQLException;
    java.net.URL readURL() throws SQLException;
    NClob readNClob() throws SQLException;
    String readNString() throws SQLException;
    SQLXML readSQLXML() throws SQLException;
    RowId readRowId() throws SQLException;
    default <T> T readObject(Class<T> type) throws SQLException {
        throw new SQLFeatureNotSupportedException();
    }

}
