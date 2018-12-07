package javaee.servlet;

/**
 * Ensures that servlets handle only one request at a time. This interface has no methods.
 * 用于设置Servlet，并发时实例化不同的Servlet.
 */
@Deprecated
public interface SingleThreadModel extends javax.servlet.SingleThreadModel {

}
