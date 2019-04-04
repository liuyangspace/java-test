package javaee.jdbc.throwable;

/**
 * An exception  thrown as a <code>DataTruncation</code> exception
 * (on writes) or reported as a
 * <code>DataTruncation</code> warning (on reads)
 *  when a data values is unexpectedly truncated for reasons other than its having
 *  exceeded <code>MaxFieldSize</code>.
 *
 * <P>The SQLstate for a <code>DataTruncation</code> during read is <code>01004</code>.
 * <P>The SQLstate for a <code>DataTruncation</code> during write is <code>22001</code>.
 *
 * @see java.sql.DataTruncation
 */
public class DataTruncation extends java.sql.DataTruncation {

    public DataTruncation(int index, boolean parameter, boolean read, int dataSize, int transferSize) {
        super(index, parameter, read, dataSize, transferSize);
    }

    public DataTruncation(int index, boolean parameter, boolean read, int dataSize, int transferSize, Throwable cause) {
        super(index, parameter, read, dataSize, transferSize, cause);
    }

    public int getIndex() {
        return super.getIndex();
    }
    public boolean getParameter() {
        return super.getParameter();
    }
    public boolean getRead() {
        return super.getRead();
    }
    public int getDataSize() {
        return super.getDataSize();
    }
    public int getTransferSize() {
        return super.getTransferSize();
    }

}
