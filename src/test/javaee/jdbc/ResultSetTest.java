package test.javaee.jdbc;

import org.junit.Test;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class ResultSetTest {
    @Test
    public void result() throws SQLException {
        Connection connection = JDBCUtil.getConnection();
        Statement statement = connection.createStatement(ResultSet.TYPE_FORWARD_ONLY,ResultSet.CONCUR_READ_ONLY);
        ResultSet resultSet = statement.executeQuery("SELECT id,name as user_name,password FROM user");
        //
        resultSet.next();
        System.out.println(resultSet.getString("user_name"));
        resultSet.last();
        System.out.println(resultSet.getString("user_name"));
        resultSet.previous();
        System.out.println(resultSet.getString("user_name"));
        resultSet.first();
        System.out.println(resultSet.getString("user_name"));
        resultSet.absolute(1);
        System.out.println(resultSet.getString("user_name"));
        resultSet.relative(1);
        System.out.println(resultSet.getString("user_name"));
        JDBCUtil.close(connection,statement,resultSet);
    }
}
