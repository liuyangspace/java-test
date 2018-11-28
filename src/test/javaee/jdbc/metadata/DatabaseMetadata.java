package test.javaee.jdbc.metadata;

import org.junit.Test;

import java.sql.*;
import java.sql.ResultSetMetaData;
import java.util.ArrayList;

public class DatabaseMetadata {
    private static Connection connection;
    static {
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/test?serverTimezone=UTC","root","123456");
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        } catch (SQLException e) {

        }
    }

    @Test
    public void getMetaData() throws SQLException {
        int i = 0;
        ArrayList<String> columnNames = new ArrayList<String>();
        DatabaseMetaData databaseMetaData = connection.getMetaData();
        //
        System.out.println("getDatabaseProductName\t"+databaseMetaData.getDatabaseProductName());
        System.out.println("getDatabaseProductVersion\t"+databaseMetaData.getDatabaseProductVersion());
        System.out.println("getDriverName\t"+databaseMetaData.getDriverName());
        // database info
        ResultSet databases = databaseMetaData.getCatalogs();
        java.sql.ResultSetMetaData databaseMeta = databases.getMetaData();
        System.out.println("databases:");
        System.out.print("number\t");
        columnNames.clear();
        for (i=1;i<=databaseMeta.getColumnCount();i++){
            System.out.print(databaseMeta.getColumnName(i)+"\t");
            columnNames.add(databaseMeta.getColumnName(i));
        }
        System.out.print("\n");
        while (databases.next()){
            System.out.print(databases.getRow()+"\t\t");
            for (String columnName:columnNames){
                System.out.print(databases.getString(columnName)+"\t\t");
            }
            System.out.print("\n");
        }
        // table info
        ResultSet tables = databaseMetaData.getTables("test",null,null,new String[]{"TABLE"});
        ResultSetMetaData tableMeta = tables.getMetaData();
        System.out.println("tables:");
        System.out.print("number\t");
        columnNames.clear();
        for (i=1;i<=tableMeta.getColumnCount();i++){
            System.out.print(tableMeta.getColumnName(i)+"\t");
            columnNames.add(tableMeta.getColumnName(i));
        }
        System.out.print("\n");
        while (tables.next()){
            System.out.print(tables.getRow()+"\t\t");
            for (String columnName:columnNames){
                System.out.print(tables.getString(columnName)+"\t\t");
            }
            System.out.print("\n");
        }
    }
}
