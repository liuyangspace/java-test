package test.javaee.jdbc.statement;

import test.javaee.jdbc.JDBCUtil;
import org.junit.Test;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class StatementTest {
    /** ddl dml */

    protected Connection getCommection() throws Exception{
        Class.forName("com.mysql.cj.jdbc.Driver");
        String url = "jdbc:mysql://localhost:3306/test?serverTimezone=UTC";
        String user = "root";
        String password = "123456";
        return DriverManager.getConnection(url,user,password);
    }

    @Test
    public void dml() throws Exception {
        Statement statement = getCommection().createStatement();
        int result = -1;
        // create
        //result = statement.executeUpdate("CREATE TABLE user (id INT PRIMARY KEY AUTO_INCREMENT ,name VARCHAR(25), password VARCHAR(25))");
        //System.out.println("CREATE TABLE = "+result);
        // insert
        //result = statement.executeUpdate("INSERT INTO user (name,password) VALUE ('大话','4343')");
        //System.out.println("INSERT = "+result);
        // update
        //result = statement.executeUpdate("UPDATE user SET name='迭代',password='3433' WHERE name='大话'");
        //System.out.println("UPDATE = "+result);
        // remove
        result = statement.executeUpdate("DELETE FROM user WHERE name='迭代'");
        System.out.println("DELETE = "+result);
    }

    /** dql */
    protected Statement getStatement() throws Exception {
        return getCommection().createStatement();
    }

    @Test
    public void dql() throws Exception {
        Connection connection = getCommection();
        Statement statement = connection.createStatement();
        ResultSet resultSet = statement.executeQuery("SELECT id,name as user_name,password FROM user");
        while (resultSet.next()){
            System.out.println(resultSet.getInt(1));
            System.out.println(resultSet.getString("user_name"));
            System.out.println(resultSet.getString("password"));
        }
        JDBCUtil.close(connection,statement,resultSet);
    }

}
