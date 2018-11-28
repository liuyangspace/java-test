package test.javaee.jdbc.connection;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class ConnectionPoolTest {

    public static void main(String[] args){
        for (int i = 0; i < 3000; i++) {
            new ConnectionThread().start();
        }
    }

}

class ConnectionThread extends Thread {
    @Override
    public void run(){
        Connection connection = null;
        try {
            System.out.println("开始线程\t"+this.getName());
            connection = ConnectionPool.getConnection();
            System.out.println("线程\t"+this.getName()+"\t获取链接\t"+connection);
            String sql = "INSERT INTO user (name,password) VALUE (?,?)";
            PreparedStatement preparedStatement = connection.prepareStatement(sql);
            preparedStatement.setString(1,this.getName());
            preparedStatement.setString(2,"");
            int resultSet = preparedStatement.executeUpdate();
        } catch (Exception e) {
            e.printStackTrace();
        }finally {
            try {
                connection.close();
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }
    }
}