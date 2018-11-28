package test.javaee.jdbc.connection;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.LinkedList;
import java.util.List;

public class ConnectionPool {
    private static final List<Connection> pool = new LinkedList<Connection>();

    static {
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

    private static Connection rawConnection() throws SQLException {
        String url = "jdbc:mysql://localhost:3306/test?serverTimezone=UTC&charset=UTF-8";
        return DriverManager.getConnection(url,"root","123456");
    }

    private static Connection proxyConnection() throws SQLException {
        final Connection connection = rawConnection();
        Connection connectionProxy = (Connection) Proxy.newProxyInstance(ConnectionPool.class.getClassLoader(),new Class[]{Connection.class},
                new InvocationHandler(){
                    @Override
                    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
                        if("close".equals(method.getName())){
                            backConnection((Connection) proxy);
                            return null;
                        }
                        return method.invoke(connection,args);
                    }
                });
        return connectionProxy;
    }

    private static void backConnection(Connection connection){
        synchronized (pool){
            pool.add(connection);
            System.out.println("线程\t"+Thread.currentThread().getName()+"\t还链接\t"+connection);
            pool.notify();
        }
    }

    public static Connection getConnection(){
        synchronized (pool){
            if(pool.isEmpty()){
                try {
                    pool.wait();
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                return getConnection();
            }else {
                return pool.remove(0);
            }
        }
    }

}
