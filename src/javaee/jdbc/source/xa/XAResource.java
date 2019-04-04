package javaee.jdbc.source.xa;

import javax.sql.XAConnection;
import javax.transaction.xa.XAException;
import javax.transaction.xa.Xid;

/**
 * The XAResource interface is a Java mapping of the industry standard
 * XA interface based on the X/Open CAE Specification (Distributed
 * Transaction Processing: The XA Specification).
 *
 * @see javax.transaction.xa.XAResource
 * @see XAConnection#getXAResource()
 */
public interface XAResource extends javax.transaction.xa.XAResource{

    void commit(Xid xid, boolean onePhase) throws XAException;
    void end(Xid xid, int flags) throws XAException;
    void start(Xid xid, int flags) throws XAException;
    void forget(Xid xid) throws XAException;
    int getTransactionTimeout() throws XAException;
    boolean isSameRM(javax.transaction.xa.XAResource xares) throws XAException;
    int prepare(Xid xid) throws XAException;
    Xid[] recover(int flag) throws XAException;
    void rollback(Xid xid) throws XAException;
    boolean setTransactionTimeout(int seconds) throws XAException;

}
