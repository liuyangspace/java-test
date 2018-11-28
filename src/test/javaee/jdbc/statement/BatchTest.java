package test.javaee.jdbc.statement;

import test.javaee.jdbc.JDBCUtil;
import org.junit.Test;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.Statement;

public class BatchTest {
    @Test
    public void statementFor() throws SQLException {
        long startTime = System.currentTimeMillis();
        Connection connection = JDBCUtil.getConnection();
        Statement statement = connection.createStatement();
        for(int i=0;i<5000;i++){
            String sql = "INSERT INTO user(name,password) VALUES ('liming','abc123456')";
            statement.executeUpdate(sql);
        }
        JDBCUtil.close(connection,statement,null);
        System.out.println(System.currentTimeMillis() - startTime);
    }

    @Test
    public void statementBatch() throws SQLException {
        long startTime = System.currentTimeMillis();
        Connection connection = JDBCUtil.getConnection();
        Statement statement = connection.createStatement();
        for(int i=0;i<5000;i++){
            String sql = "INSERT INTO user(name,password) VALUES ('liming','abc123456')";
            statement.addBatch(sql);
        }
        statement.executeBatch();
        JDBCUtil.close(connection,statement,null);
        System.out.println(System.currentTimeMillis() - startTime);
    }

    @Test
    public void prepareStatementBatch() throws SQLException {
        long startTime = System.currentTimeMillis();
        Connection connection = JDBCUtil.getConnection();
        String sql = "INSERT INTO user(name,password) VALUES (?,?)";
        PreparedStatement statement = connection.prepareStatement(sql);
        for(int i=0;i<5000;i++){
            statement.setString(1,"liming");
            statement.setString(2,"limingps");
            statement.addBatch();
        }
        statement.executeBatch();
        JDBCUtil.close(connection,statement,null);
        System.out.println(System.currentTimeMillis() - startTime);
    }
}
