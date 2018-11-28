package test.javaee.jdbc.connection;

import java.io.PrintWriter;
import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.SQLFeatureNotSupportedException;
import java.util.LinkedList;
import java.util.logging.Logger;

public class DataSource implements javax.sql.DataSource {
    private final LinkedList<Connection> pool = new LinkedList<Connection>();

    public DataSource(){
        synchronized(pool){
            try {
                Class.forName("com.mysql.cj.jdbc.Driver");
                for (int i=0;i<3;i++){
                    pool.add(proxyConnection());
                }
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }

    private Connection proxyConnection() throws SQLException {
        String url = "jdbc:mysql://localhost:3306/test?serverTimezone=UTC&charset=UTF-8";
        final Connection connection = DriverManager.getConnection(url,"root","123456");
        Connection connectionProxy = (Connection) Proxy.newProxyInstance(ConnectionPool.class.getClassLoader(),new Class[]{Connection.class},
                new InvocationHandler(){
                    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
                        if("close".equals(method.getName())){
                            synchronized (pool){
                                pool.addLast(connection);
                                System.out.println("线程\t"+Thread.currentThread().getName()+"\t还链接\t"+connection);
                                pool.notify();
                            }
                            return null;
                        }
                        return method.invoke(connection,args);
                    }
                });
        return connectionProxy;
    }

    @Override
    public Connection getConnection() throws SQLException {
        synchronized (pool){
            if(pool.isEmpty()){
                try {
                    pool.wait();
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                return getConnection();
            }else {
                return pool.removeFirst();
            }
        }
    }

    @Override
    public Connection getConnection(String username, String password) throws SQLException {
        return getConnection();
    }

    @Override
    public PrintWriter getLogWriter() throws SQLException {
        return null;
    }

    @Override
    public void setLogWriter(PrintWriter out) throws SQLException {

    }

    @Override
    public void setLoginTimeout(int seconds) throws SQLException {

    }

    @Override
    public int getLoginTimeout() throws SQLException {
        return 0;
    }

    @Override
    public Logger getParentLogger() throws SQLFeatureNotSupportedException {
        return null;
    }

    @Override
    public <T> T unwrap(Class<T> iface) throws SQLException {
        return null;
    }

    @Override
    public boolean isWrapperFor(Class<?> iface) throws SQLException {
        return false;
    }
}
