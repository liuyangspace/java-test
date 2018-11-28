package test.javaee.jdbc;

import java.sql.*;

public class JDBCUtil {

    private static String driver = "mysql";
    private static String dbName = "test";
    private static String host = "localhost";
    private static String port = "3306";
    private static String user = "root";
    private static String password = "123456";

    private static Connection connection;
    private static Statement statement;
    private static ResultSet resultSet;

    static {
        try {
            String thisDriver = "";
            if("mysql".equals(driver)){
                thisDriver = "com.mysql.cj.jdbc.Driver";
            }
            Class.forName(thisDriver);
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
    }

    public static Connection getConnection(String host,String port,String dbName,String user,String password){
        String url = "jdbc:" + driver + "://" + host + ":" + port + "/" + dbName + "?serverTimezone=UTC";
        try {
            return connection = DriverManager.getConnection(url,user,password);
        } catch (SQLException e) {
            e.printStackTrace();
            return null;
        }
    }

    public static Connection getConnection(){
        return getConnection(host,port,dbName,user,password);
    }

    public static void close(Connection connection,Statement statement,ResultSet resultSet){
        if(connection!=null){
            try {
                connection.close();
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }
        if(statement!=null){
            try {
                statement.close();
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }
        if(resultSet!=null){
            try {
                resultSet.close();
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }
    }
}
