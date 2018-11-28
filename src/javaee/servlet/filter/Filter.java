package javaee.servlet.filter;

import javax.servlet.FilterConfig;
import javax.servlet.ServletException;

/**
 *
 * 配置:
 *  <filter>
 <filter-name>Filter</filter-name>
 <filter-class>servlet.filter.Filter</filter-class>
 </filter>
 <filter-mapping>
 <filter-name>Filter</filter-name>
 <url-pattern>/filter</url-pattern>
 <url-pattern>/*</url-pattern>
 <servlet-name>FilterServlet</servlet-name>
 <dispatcher>REQUEST</dispatcher>
 <dispatcher>FORWARD</dispatcher>
 <dispatcher>INCLUDE</dispatcher>
 <dispatcher>ERROR</dispatcher>
 </filter-mapping>
   顺序 依照配置 filter-mapping 的顺序执行
 * url-pattern的设置：
 /* = 对所有url都请求这个servlet。| 都被这个filter过虑.
 /  = 只可以给servlet。 － 所有其他的servlet不处理的url都由这个url所指定的servlet处理。默认servlet。
 *.jspx = 所有以jspx结束都请求到这个Servlet或是被某个Filter拦截。如http://local:8080/proj/abc.jspx
 /jsps/*  ＝ 所有路径中以/jsps/开头的都请求到这个servlet或是被某个filter拦截到。
 /jsps/*.jspx  错误的：SUN规定*两边不可以同时出现字符。

 *
 * 用例:
 *  验证
 *  自动登陆
 *  压缩
 * @see javax.servlet.Filter
 */
public interface Filter extends javax.servlet.Filter{
    public default void init(FilterConfig filterConfig) throws ServletException {} // Server服务容器启动时调用
}
