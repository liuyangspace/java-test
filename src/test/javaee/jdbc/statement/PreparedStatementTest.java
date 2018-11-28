package test.javaee.jdbc.statement;

import test.javaee.jdbc.JDBCUtil;
import org.junit.Test;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class PreparedStatementTest {
    @Test
    public void insert() throws SQLException {
        Connection connection = JDBCUtil.getConnection();
        String sql = "INSERT INTO user (name,password) VALUE (?,?)";
        PreparedStatement preparedStatement = connection.prepareStatement(sql);
        preparedStatement.setString(1,"liming");
        preparedStatement.setString(2,"cssacas");
        int resultSet = preparedStatement.executeUpdate();
        System.out.println(resultSet);
    }

    @Test
    public void update() throws SQLException {
        Connection connection = JDBCUtil.getConnection();
        String sql = "UPDATE user SET name = ? WHERE name = ?";
        PreparedStatement preparedStatement = connection.prepareStatement(sql);
        preparedStatement.setString(1,"fff");
        preparedStatement.setString(2,"liming");
        int resultSet = preparedStatement.executeUpdate();
        System.out.println(resultSet);
    }

    @Test
    public void delete() throws SQLException {
        Connection connection = JDBCUtil.getConnection();
        String sql = "DELETE FROM user WHERE name = ?";
        PreparedStatement preparedStatement = connection.prepareStatement(sql);
        preparedStatement.setString(1,"fff");
        int resultSet = preparedStatement.executeUpdate();
        System.out.println(resultSet);
    }

    @Test
    public void select() throws SQLException {
        Connection connection = JDBCUtil.getConnection();
        String sql = "SELECT * FROM user WHERE name = ?";
        PreparedStatement preparedStatement = connection.prepareStatement(sql);
        preparedStatement.setString(1,"fff");
        ResultSet resultSet = preparedStatement.executeQuery();
        while (resultSet.next()){
            System.out.println(resultSet.getString("name") + "=" +
                resultSet.getString("password")
            );
        }
    }

}
