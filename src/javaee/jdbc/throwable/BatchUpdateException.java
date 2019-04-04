package javaee.jdbc.throwable;

import java.sql.SQLException;
import java.util.Arrays;

/**
 * The subclass of {@link SQLException} thrown when an error
 * occurs during a batch update operation.
 *
 * @see java.sql.BatchUpdateException
 */
public class BatchUpdateException extends java.sql.BatchUpdateException {

    public BatchUpdateException( String reason, String SQLState, int vendorCode, int[] updateCounts ) { super(reason,SQLState,vendorCode,updateCounts); }
    public BatchUpdateException(String reason, String SQLState, int[] updateCounts) { super(reason, SQLState, 0, updateCounts); }
    public BatchUpdateException(String reason, int[] updateCounts) { super(reason, null, 0, updateCounts); }
    public BatchUpdateException(int[] updateCounts) { super(null, null, 0, updateCounts); }
    public BatchUpdateException() { super(null, null, 0, null); }
    public BatchUpdateException(Throwable cause) { super((cause == null ? null : cause.toString()), null, 0, (int[])null, cause); }
    public BatchUpdateException(int []updateCounts , Throwable cause) { super((cause == null ? null : cause.toString()), null, 0, updateCounts, cause); }
    public BatchUpdateException(String reason, int []updateCounts, Throwable cause) { super(reason, null, 0, updateCounts, cause); }
    public BatchUpdateException(String reason, String SQLState, int []updateCounts, Throwable cause) { super(reason, SQLState, 0, updateCounts, cause); }
    public BatchUpdateException(String reason, String SQLState, int vendorCode, int []updateCounts,Throwable cause) { super(reason, SQLState, vendorCode, updateCounts, cause); }
    public BatchUpdateException(String reason, String SQLState, int vendorCode, long []updateCounts,Throwable cause) {super(reason, SQLState, vendorCode, updateCounts, cause); }

    public int[] getUpdateCounts() { return super.getUpdateCounts(); }
    public long[] getLargeUpdateCounts() { return super.getLargeUpdateCounts(); }

}
