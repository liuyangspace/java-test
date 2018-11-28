package test.javaee.jdbc.metadata;

import test.javaee.jdbc.JDBCUtil;
import org.junit.Test;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;

public class ResultSetMetaData {

    @Test
    public void dql() throws Exception {
        Connection connection = getCommection();
        Statement statement = connection.createStatement();
        ResultSet resultSet = statement.executeQuery("SELECT * FROM contact");
        java.sql.ResultSetMetaData resultSetMetaData = resultSet.getMetaData();
        ArrayList<String> columnNames = new ArrayList<String>();
        //
        System.out.print("number\t");
        for (int i=1;i<=resultSetMetaData.getColumnCount();i++){
            System.out.print(resultSetMetaData.getColumnName(i)+"\t");
            columnNames.add(resultSetMetaData.getColumnName(i));
        }
        System.out.print("\n");
        //
        while (resultSet.next()){
            System.out.print(resultSet.getRow()+"\t");
            for (String columnName:columnNames){
                System.out.print(resultSet.getString(columnName)+"\t");
            }
            System.out.print("\n");
        }
        test.javaee.jdbc.JDBCUtil.close(connection,statement,resultSet);
    }

    protected Connection getCommection() throws Exception{
        Class.forName("com.mysql.cj.jdbc.Driver");
        String url = "jdbc:mysql://localhost:3306/test?serverTimezone=UTC";
        String user = "root";
        String password = "123456";
        return DriverManager.getConnection(url,user,password);
    }

    /** dql */
    protected Statement getStatement() throws Exception {
        return getCommection().createStatement();
    }
}
