package javaee.jdbc.data;

import javax.xml.transform.Result;
import javax.xml.transform.Source;
import java.io.InputStream;
import java.io.OutputStream;
import java.io.Reader;
import java.io.Writer;
import java.sql.Connection;
import java.sql.SQLException;

/**
 * The mapping in the JavaTM programming language for the SQL XML type.
 * XML is a built-in type that stores an XML value as a column value in a row of a database table.
 * @see java.sql.SQLXML
 * @see Connection#createSQLXML()
 */
public interface SQLXML extends java.sql.SQLXML {

    void free() throws SQLException;
    InputStream getBinaryStream() throws SQLException;
    OutputStream setBinaryStream() throws SQLException;
    Reader getCharacterStream() throws SQLException;
    Writer setCharacterStream() throws SQLException;
    String getString() throws SQLException;
    void setString(String value) throws SQLException;
    <T extends Source> T getSource(Class<T> sourceClass) throws SQLException;
    <T extends Result> T setResult(Class<T> resultClass) throws SQLException;

}
