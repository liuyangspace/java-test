package javaee.jdbc.data;

/**
 * The representation (mapping) in the Java programming language of an SQL ROWID
 * value. An SQL ROWID is a built-in type, a value of which can be thought of as
 * an address  for its identified row in a database table. Whether that address
 * is logical or, in any  respects, physical is determined by its originating data
 * source.
 *
 * @see java.sql.DatabaseMetaData
 * @see java.sql.RowId
 */
public interface RowId extends java.sql.RowId {

    boolean equals(Object obj);
    byte[] getBytes();
    String toString();
    int hashCode();

}
