package test.javaee.jdbc.statement;

import test.javaee.jdbc.JDBCUtil;
import org.junit.Test;

import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;

public class CallableStatementTest {
    // 调用存储过程
    @Test
    public void call(){
        Connection connection = JDBCUtil.getConnection();
        try {
            CallableStatement cs = connection.prepareCall("{call proc1()}");
            boolean boo = cs.execute();
            if(boo){ // 存储过程返回结果集
                ResultSet set = cs.getResultSet();
            }else {

            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}
