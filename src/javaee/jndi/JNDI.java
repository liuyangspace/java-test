package javaee.jndi;

/**
 *
 * JNDI (Java Name and Driectory Interface)
 * e.g:
 *  1) Tomcat支持JNDI,在tomcat/conf/server.xml中配置：
 *      <Context path="/aaa" docBase="D:/programfiles/MyEclipse10/wk3/day25/WebRoot">
 *      <Resource name="jdbc/mysql"         // JNDI名称
 *          auth="Container"                // JNDI拥有者
 *          type="javax.sql.DataSource"
 *          driverClassName="com.mysql.jdbc.Driver"
 *          url="jdbc:mysql:///db909?characterEncoding=UTF8"
 *          username="root" password="1234" maxActive="10" maxIdle="30"
 *      maxWait="-1"/>
 *      </Context>
 *  2) 使用
 *      在Servlet中使用:
 *      Context ctx = new InitialContext(); //1声明Context上下文查找对象
 *      Context ctx1 = (Context) ctx.lookup("java:/comp/env"); //第二步：查找apache环境
 *      Object obj = ctx1.lookup("jdbc/mysql"); //第三步：从环境中找jNDI
 *      DataSource ds = (DataSource) obj; //第四步：测试连接是否成功
 *      Connection con = ds.getConnection();
 *
 *
 */
public class JNDI {

}
