package test.javaee.jdbc;

import org.junit.Test;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class TransactionTest {
    @Test
    public void transaction(){
        Connection connection = JDBCUtil.getConnection();
        try {
            System.out.println(connection.getAutoCommit());
            //
            connection.setAutoCommit(false);
            //
            run(connection);
            //
            connection.commit();
        } catch (SQLException e) {
            try {
                //
                connection.rollback();
            } catch (SQLException e1) {
                e1.printStackTrace();
            }
            e.printStackTrace();
        }
    }

    public void run(Connection connection) throws SQLException {
        String sql = "INSERT INTO user (name,password) VALUE (?,?)";
        PreparedStatement preparedStatement = connection.prepareStatement(sql);
        preparedStatement.setString(1,"liming");
        preparedStatement.setString(2,"cssacas");
        int resultSet = preparedStatement.executeUpdate();
        System.out.println(resultSet);
        //
        sql = "UPDATE user SET name = ? WHERE name = ?";
        preparedStatement = connection.prepareStatement(sql);
        preparedStatement.setString(1,"fff");
        preparedStatement.setString(2,"liming");

        if(true){
            throw new SQLException("SQLException test!");
        }

        resultSet = preparedStatement.executeUpdate();
    }
}
