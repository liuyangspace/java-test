package javaee.servlet.filter;

import javax.servlet.*;
import java.io.IOException;

/**
 * A filter is an object that performs filtering tasks on either the request to
 * a resource (a servlet or static content), or on the response from a resource,
 * or both.
 * 配置:
 *  <filter>
 *      <filter-name>Filter</filter-name>
 *      <filter-class>servlet.filter.Filter</filter-class>
 *  </filter>
 *  <filter-mapping>
 *      <filter-name>Filter</filter-name>
 *      <url-pattern>/filter</url-pattern>
 *      <url-pattern>/*</url-pattern>
 *      <servlet-name>FilterServlet</servlet-name>
 *      <dispatcher>REQUEST</dispatcher>    // 默认值，只拦截用户的新的请求。
 *      <dispatcher>FORWARD</dispatcher>    // 对转发进行拦截
 *      <dispatcher>INCLUDE</dispatcher>    // 对include拦截。
 *      <dispatcher>ERROR</dispatcher>      // 对错误进行拦截。
 *  </filter-mapping>
 *    顺序 依照配置 filter-mapping 的顺序执行
 * url-pattern的设置：
 *      /*          = 对所有url都请求这个servlet。| 都被这个filter过虑.
 *      /           = 只可以给servlet。 － 所有其他的servlet不处理的url都由这个url所指定的servlet处理。默认servlet。
 *      *.jspx      = 所有以jspx结束都请求到这个Servlet或是被某个Filter拦截。如http://local:8080/proj/abc.jspx
 *      /jsps/*     = 所有路径中以/jsps/开头的都请求到这个servlet或是被某个filter拦截到。
 *      /jsps/*.jspx  错误的：SUN规定*两边不可以同时出现字符。
 *
 * Examples that have been identified for this design are<br>
 * 1) Authentication Filters <br>
 * 2) Logging and Auditing Filters <br>
 * 3) Image conversion Filters <br>
 * 4) Data compression Filters <br>
 * 5) Encryption Filters <br>
 * 6) Tokenizing Filters <br>
 * 7) Filters that trigger resource access events <br>
 * 8) XSL/T filters <br>
 * 9) Mime-type chain Filter <br>
 *
 * @see javax.servlet.Filter
 */
public interface Filter extends javax.servlet.Filter{

    public default void init(FilterConfig filterConfig) throws ServletException {} // Server服务容器启动时调用
    public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain) throws IOException, ServletException;
    public default void destroy() {}

}
