package javaee.jdbc.source.xa;

/**
 * The Xid interface is a Java mapping of the X/Open transaction identifier
 * XID structure. This interface specifies three accessor methods to
 * retrieve a global transaction format ID, global transaction ID,
 * and branch qualifier. The Xid interface is used by the transaction
 * manager and the resource managers. This interface is not visible to
 * the application programs.
 *
 * @see javax.transaction.xa.Xid
 */
public interface Xid extends javax.transaction.xa.Xid{

    int getFormatId();
    byte[] getGlobalTransactionId();
    byte[] getBranchQualifier();

}
