package javaee.jdbc.source.xa;

/**
 * The XAException is thrown by the Resource Manager (RM) to inform the
 * Transaction Manager of an error encountered by the involved transaction.
 *
 * @see javax.transaction.xa.XAException
 */
public class XAException extends javax.transaction.xa.XAException {

    public XAException() { super(); }
    public XAException(String s) { super(s); }
    public XAException(int errcode) { super(errcode); }


}
