package test.javaee.jdbc.connection;

import org.junit.Test;

import java.sql.Connection;
import java.sql.Driver;
import java.sql.DriverManager;
import java.util.Properties;

public class ConnectionTest {
    @Test
    public void connect1() throws Exception {
        Driver driver = new com.mysql.jdbc.Driver();
        String url = "jdbc:mysql://localhost:3306/test?serverTimezone=UTC";
        Properties info = new Properties();
        info.put("user","root");
        info.put("password","123456");
        Connection connection = driver.connect(url,info);
        System.out.println(connection);
    }

    @Test
    public void connect2() throws Exception {
        DriverManager.deregisterDriver(new com.mysql.cj.jdbc.Driver());
        String url = "jdbc:mysql://localhost:3306/test?serverTimezone=UTC";
        String user = "root";
        String password = "123456";
        Connection connection = DriverManager.getConnection(url,user,password);
        System.out.println(connection);
    }

    @Test
    public void connect3() throws Exception {
        Class.forName("com.mysql.cj.jdbc.Driver");
        String url = "jdbc:mysql://localhost:3306/test?serverTimezone=UTC";
        String user = "root";
        String password = "123456";
        Connection connection = DriverManager.getConnection(url,user,password);
        System.out.println(connection);
    }
}
