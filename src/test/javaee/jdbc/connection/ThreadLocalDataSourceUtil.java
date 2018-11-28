package test.javaee.jdbc.connection;

import javax.sql.DataSource;
import java.sql.Connection;
import java.sql.SQLException;

public class ThreadLocalDataSourceUtil {
    static DataSource dataSource = new test.javaee.jdbc.connection.DataSource();
    static ThreadLocal<Connection> threadLocal = new ThreadLocal<Connection>();

    public static Connection getConnection() throws SQLException {
        if(threadLocal.get()==null){
            threadLocal.set(dataSource.getConnection());
        }
        return threadLocal.get();
    }

}
