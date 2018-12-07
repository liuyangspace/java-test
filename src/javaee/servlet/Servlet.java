package javaee.servlet;

import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import java.io.IOException;

/**
 * Defines methods that all servlets must implement.
 * A servlet is a small Java program that runs within a Web server, receive and respond to requests from Web clients,
 * usually across HTTP.  This interface defines methods to initialize a servlet, to service requests, and to remove a
 * servlet from the server.
 *
 * These are known as life-cycle methods and are called in the following sequence:
 *      1) The servlet is constructed, then initialized with the <code>init</code> method.
 *      2) Any calls from clients to the <code>service</code> method are handled.
 *      3) The servlet is taken out of service, then destroyed with the <code>destroy</code> method, then garbage collected
 *          and finalized.
 *
 * config web.xml:
 *  <web-app>
 *      <servlet>
 *          <servlet-name>AnyName</servlet-name>
 *          <servlet-class>HelloServlet</servlet-class>
 *          <load-on-startup>2</load-on-startup> <!-- 实例化优先级 -->
 *      </servlet>
 *      <servlet-mapping>
 *          <servlet-name>AnyName</servlet-name>
 *          <url-pattern>/demo/hello.html</url-pattern>
 *          <url-pattern>*.do</url-pattern>
 *          <url-pattern>/demo/*</url-pattern>
 *      </servlet-mapping>
 *  </web-app>
 *  # Servlet的映射路径仅仅为一个正斜杠（/），那么这个Servlet就成为当前Web应用程序的缺省Servlet。
 *  # <tomcat的安装目录>\conf\web.xml文件中，注册了一个名称为org.apache.catalina.servlets.DefaultServlet的Servlet，并将这个Servlet设置为了缺省Servlet。
 *  # 访问Tomcat服务器中的某个静态HTML文件和图片时，实际上是在访问这个缺省Servlet
 *
 * @see javax.servlet.Servlet
 */
public interface Servlet extends javax.servlet.Servlet{

    public void             init(ServletConfig config) throws ServletException;
    public ServletConfig    getServletConfig();
    public void             service(ServletRequest req, ServletResponse res) throws ServletException, IOException;
    public String           getServletInfo();
    public void             destroy();

}
