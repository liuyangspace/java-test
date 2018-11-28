package test.javaee.jdbc;

import org.junit.Test;

import java.io.*;
import java.sql.*;

public class BlobTest {
    @Test
    public void blobSave() throws SQLException, FileNotFoundException {
        Connection connection = JDBCUtil.getConnection();
        String sql = "INSERT INTO user(name,password,head) VALUES (?,?,?)";
        PreparedStatement statement = connection.prepareStatement(sql);
        statement.setString(1,"li");
        statement.setString(2,"123");
        InputStream inputStream = new FileInputStream("E:\\myplace\\test\\java\\doc\\Annotation.jpg");
        //statement.setBlob(3,inputStream);
        statement.setBinaryStream(3,inputStream);
        statement.executeUpdate();
        JDBCUtil.close(connection,statement,null);
    }

    @Test
    public void blobRead() throws SQLException, IOException {
        Connection connection = JDBCUtil.getConnection();
        String sql = "SELECT * FROM user WHERE name=?";
        PreparedStatement statement = connection.prepareStatement(sql);
        statement.setString(1,"li");
        ResultSet resultSet = statement.executeQuery();
        while (resultSet.next()){
            OutputStream outputStream = new FileOutputStream("E:\\myplace\\test\\java-web\\data\\Annotation2.jpg");
            System.out.println(resultSet.getString("name"));
            System.out.println(resultSet.getString("password"));
            InputStream inputStream = resultSet.getBinaryStream("head");
            byte[] bytes = new byte[1024];
            int count =-1;
            while ((count=inputStream.read(bytes))!=-1){
                outputStream.write(bytes);
            }
            outputStream.close();
            inputStream.close();
            break;
        }
        JDBCUtil.close(connection,statement,null);
    }
}
