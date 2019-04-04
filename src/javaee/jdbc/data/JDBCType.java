package javaee.jdbc.data;

import java.sql.Types;

public enum JDBCType implements SQLType{

    /**
     * Identifies the generic SQL type {@code BIT}.
     */
    BIT(java.sql.Types.BIT),
    /**
     * Identifies the generic SQL type {@code TINYINT}.
     */
    TINYINT(java.sql.Types.TINYINT),
    /**
     * Identifies the generic SQL type {@code SMALLINT}.
     */
    SMALLINT(java.sql.Types.SMALLINT),
    /**
     * Identifies the generic SQL type {@code INTEGER}.
     */
    INTEGER(java.sql.Types.INTEGER),
    /**
     * Identifies the generic SQL type {@code BIGINT}.
     */
    BIGINT(java.sql.Types.BIGINT),
    /**
     * Identifies the generic SQL type {@code FLOAT}.
     */
    FLOAT(java.sql.Types.FLOAT),
    /**
     * Identifies the generic SQL type {@code REAL}.
     */
    REAL(java.sql.Types.REAL),
    /**
     * Identifies the generic SQL type {@code DOUBLE}.
     */
    DOUBLE(java.sql.Types.DOUBLE),
    /**
     * Identifies the generic SQL type {@code NUMERIC}.
     */
    NUMERIC(java.sql.Types.NUMERIC),
    /**
     * Identifies the generic SQL type {@code DECIMAL}.
     */
    DECIMAL(java.sql.Types.DECIMAL),
    /**
     * Identifies the generic SQL type {@code CHAR}.
     */
    CHAR(java.sql.Types.CHAR),
    /**
     * Identifies the generic SQL type {@code VARCHAR}.
     */
    VARCHAR(java.sql.Types.VARCHAR),
    /**
     * Identifies the generic SQL type {@code LONGVARCHAR}.
     */
    LONGVARCHAR(java.sql.Types.LONGVARCHAR),
    /**
     * Identifies the generic SQL type {@code DATE}.
     */
    DATE(java.sql.Types.DATE),
    /**
     * Identifies the generic SQL type {@code TIME}.
     */
    TIME(java.sql.Types.TIME),
    /**
     * Identifies the generic SQL type {@code TIMESTAMP}.
     */
    TIMESTAMP(java.sql.Types.TIMESTAMP),
    /**
     * Identifies the generic SQL type {@code BINARY}.
     */
    BINARY(java.sql.Types.BINARY),
    /**
     * Identifies the generic SQL type {@code VARBINARY}.
     */
    VARBINARY(java.sql.Types.VARBINARY),
    /**
     * Identifies the generic SQL type {@code LONGVARBINARY}.
     */
    LONGVARBINARY(java.sql.Types.LONGVARBINARY),
    /**
     * Identifies the generic SQL value {@code NULL}.
     */
    NULL(java.sql.Types.NULL),
    /**
     * Indicates that the SQL type
     * is database-specific and gets mapped to a Java object that can be
     * accessed via the methods getObject and setObject.
     */
    OTHER(java.sql.Types.OTHER),
    /**
     * Indicates that the SQL type
     * is database-specific and gets mapped to a Java object that can be
     * accessed via the methods getObject and setObject.
     */
    JAVA_OBJECT(java.sql.Types.JAVA_OBJECT),
    /**
     * Identifies the generic SQL type {@code DISTINCT}.
     */
    DISTINCT(java.sql.Types.DISTINCT),
    /**
     * Identifies the generic SQL type {@code STRUCT}.
     */
    STRUCT(java.sql.Types.STRUCT),
    /**
     * Identifies the generic SQL type {@code ARRAY}.
     */
    ARRAY(java.sql.Types.ARRAY),
    /**
     * Identifies the generic SQL type {@code BLOB}.
     */
    BLOB(java.sql.Types.BLOB),
    /**
     * Identifies the generic SQL type {@code CLOB}.
     */
    CLOB(java.sql.Types.CLOB),
    /**
     * Identifies the generic SQL type {@code REF}.
     */
    REF(java.sql.Types.REF),
    /**
     * Identifies the generic SQL type {@code DATALINK}.
     */
    DATALINK(java.sql.Types.DATALINK),
    /**
     * Identifies the generic SQL type {@code BOOLEAN}.
     */
    BOOLEAN(java.sql.Types.BOOLEAN),

    /* JDBC 4.0 Types */

    /**
     * Identifies the SQL type {@code ROWID}.
     */
    ROWID(java.sql.Types.ROWID),
    /**
     * Identifies the generic SQL type {@code NCHAR}.
     */
    NCHAR(java.sql.Types.NCHAR),
    /**
     * Identifies the generic SQL type {@code NVARCHAR}.
     */
    NVARCHAR(java.sql.Types.NVARCHAR),
    /**
     * Identifies the generic SQL type {@code LONGNVARCHAR}.
     */
    LONGNVARCHAR(java.sql.Types.LONGNVARCHAR),
    /**
     * Identifies the generic SQL type {@code NCLOB}.
     */
    NCLOB(java.sql.Types.NCLOB),
    /**
     * Identifies the generic SQL type {@code SQLXML}.
     */
    SQLXML(java.sql.Types.SQLXML),

    /* JDBC 4.2 Types */

    /**
     * Identifies the generic SQL type {@code REF_CURSOR}.
     */
    REF_CURSOR(java.sql.Types.REF_CURSOR),

    /**
     * Identifies the generic SQL type {@code TIME_WITH_TIMEZONE}.
     */
    TIME_WITH_TIMEZONE(java.sql.Types.TIME_WITH_TIMEZONE),

    /**
     * Identifies the generic SQL type {@code TIMESTAMP_WITH_TIMEZONE}.
     */
    TIMESTAMP_WITH_TIMEZONE(Types.TIMESTAMP_WITH_TIMEZONE);

    private Integer type;

    JDBCType(int type) { this.type = type; }

    @Override
    public String getName() {
        return null;
    }

    @Override
    public String getVendor() {
        return null;
    }

    @Override
    public Integer getVendorTypeNumber() {
        return null;
    }
}
