package javaee.jsp;

/**
 * JSP (Java Server Pages)
 * JSP 文件Java应用流程:
 *      JSP 文件解释：将JSP文件解释成 Servlet 类 （Tomcat 下 解释，编译目录为 %CATALINA_BASE%/work/...）
 *          # 生成 Servlet 类 （Tomcat 下 ，org.apache.jasper.runtime.HttpJspBase）
 *          # 根据页面 指令标签 <%@ taglib uri...> 及 Web.xml:<jsp-config> 载入 tld文件 （Tomcat 下：project/WEB-INFO/...）
 *          # 遇到自定义标签 创建标签相关方法，e.g.: _jspx_meth_my2_005ftoUpperCase_005f0(PageContext)
 *          # 在自动生成的方法体中，创建指定标签实现类的实例
 *          # 对实例调用 set方法，传递上下文参数：
 *              .setJspContext(page_context)    //  传递JSP页面上下文
 *              .setXxx(….)                    //  传递标签属性
 *              .setJspBody(xxx)                //  传递标签体
 *          # 执行实例的标签操作方法： .doTag()
 *      Servlet类编译：编译成java 字节码（.class文件）
 *      JVM 运行：
 * 脚本标签：
 *      <%@ directive [ attribute =“value” ] * %>    // 指令标签
 *      <%! statement code... %>    // 声明标签,声明 Servlet 成员属性，成员方法
 *      <%= expression %>           // 表达式标签，将表达式的结果输出到浏览器
 *      <% code... %>               // 代码块标签，Servlet.service 里的处理代码
 *      <%-- comment --%>           // 注释
 * 指令标签:
 *      page    指令，属性：
 *          pageEncoding    : 当前页面保存信息的编码
 *          contentType     : 当前页面生成的servlet文件响应浏览器的编码
 *          import          : 导入Java类或接口，可使用通配符'*',多个类之间使用逗号分隔,属性可以重复引用
 *          javase        : 当前jsp页面使用的语言,默认：java
 *          info            : 当前页面的输出信息
 *          session         : 当前页面是否可以直接使用 变量 session ,默认：ture，e.g.: session.isNew()
 *          extends         ; 当前jsp页面在生成servlet文件时，继承的父类
 *          isErrorPage     : 是否是错误页面,默认值：false。为true,可以直接使用 变量 exception
 *          errorPage       : 确定错误页面
 *          isThreadSafe    : 是否是线程安全,默认值：true
 *          isELIgnored     : 是否忽略EL表达式,默认值：false,
 *          buffer          : 当前servlet文件的缓存区大小,默认值是8kb
 *          autoFlush       : 是否自动刷新,当buffer缓存区被填写满后，会自动的刷新内容到浏览器
 *      include 指令,静态包含
 *          file            : 包含的页面
 *      taglib  指令,java标签库
 *          uri             :
 *          prefix          :
 *  JSP内置对象：
 *      Object page                 // 当前类的引用
 *      HttpServletRequest request  // 请求
 *      HttpServletResponse response // 响应，IO系统JSP使用 Writer
 *      JspWriter out               // out,
 *      HttpSession session         // 会话
 *      ServletContext application  // servlet 上下文
 *      ServletConfig config        // servlet 配置信息
 *      Throwable exception         // 页面异常
 *      PageContext pageContext     // 当前JSP页面的上下文对象,可以在不同的作用域设置属性值 及 用getX()方法获取其他内置对象
 *                                      setAttribute,getAttribute,findAttribute 作用域（从小到大）：page < request < session < application
 *  EL,Expression Language:
 *      功能：获取数据,(设置使用赋值运算符 = )
 *      关闭忽略：<%@ page isELIgnored="false" %>
 *      标签：
 *          ${attributeName}        // 同于 pageContext.findAttribute(attributeName),没有属性时返回空字符串
 *          ${insideObject.attributeName}   // EL内置对象 使用
 *      内置对象：
 *          pageContext	            // 对应于JSP页面中的pageContext对象（注意：取的是pageContext对象。）
 *          pageScope	            // 代表page域中用于保存属性的Map对象
 *          requestScope	        // 代表request域中用于保存属性的Map对象
 *          sessionScope	        // 代表session域中用于保存属性的Map对象
 *          applicationScope        // 代表application域中用于保存属性的Map对象
 *      运算符：
 *          .                       // 取成员属性，或 getX、setX(使用赋值运算符 =) 成员方法,或 Map指定key的值
 *          []                      // 语法：[ index|value ] ,取数组指定index的值，或Map指定key的值
 *          +
 *          -
 *          *
 *          /
 *          %
 *  jsp标签：
 *      forward     //
 *      include     //
 *      useBead     // 实例化JavaBean类
 *      setProperty     //
 *  JSTL(JavaServer Pages Standard Tag Library)
 *      http://java.sun.com/jsp/jstl/core
 *          set
 *          out
 *          remove
 *          if
 *          choose
 *          forEach
 *          url
 *  自定义（可参考JSTL.jar包）：
 *      自定义标签库:
 *      # 实现 javax.servlet.jsp.tagext.JspTag 类
 *          javax.servlet.jsp.tagext.SimpleTag,简单标签，JSP2.0**
 *              .setJspContext(JspContext pc)               // 获取 引用当前标签 jsp页面的 上下文（ PageContext ）
 *              .setXXX(Object attributeValue)              // 属性修改器，获取 前标签的属性，语法：setAttributeName(Object attributeValue)
 *              .setJspBody(JspFragment jspBody)            // 设置标签体内容
 *              .doTag()                                    // 标签操作
 *          javax.servlet.jsp.tagext.Tag，经典标签
 *      # tld(Tag Library Descriptor)文件 编写 与 配置
 *          <tlib-version>1.0</tlib-version>    // 标签库版本标识
 *          <short-name>my</short-name>         // 建议前缀标识
 *          <uri>http://myTag.com</uri>         // 标签库引用 uri
 *          <tag>                               // 标签配置
 *              <name>date</name>               // 标签名
 *              <tag-class>tag.Date</tag-class> // 标签目标类
 *              <body-content>empty</body-content> // 标签体 ( empty 空，JSP 任意，scriptless 非标签，tagdependent  )
 *              <attribute>                     // 属性
 *                  <name>end</name>            // 属性名
 *                  <required>true</required>   // 是否必须
 *                  <rtexprvalue>true</rtexprvalue> // runtime expression value,是否支持EL表达式
 *                  <type>int</type>            // 数据类型
 *      # 配置 Web.xml (可选)
 *          <jsp-config>
 *              <taglib>
 *                  <taglib-uri></taglib-uri>
 *                  <taglib-location></taglib-uri>
 *      # JSP页面引入自定义标签,使用
 *          <%@ taglib uri="http://myTag.com" prefix="my" %>
 *          <my:date/>
 *      自定义函数库:
 *      # 创建任意类，声明静态函数
 *      # tld 文件 编写 与 配置
 *          <tlib-version>1.0</tlib-version>            // 函数库版本标识
 *          <short-name>myFn</short-name>               // 建议前缀标识
 *          <uri>http://myFunction.com</uri>            // 函数库引用 uri
 *          <function>
 *              <name>date</name>                           //  EL中使用的方法名
 *              <function-class>my.Fun</function-class>       //  方法所在的类
 *              <function-signature>java.lang.String date()</function-signature> //  方法的声明
 *      # JSP页面引入自定义标签,使用
 *          <%@ taglib uri="http://myFunction.com" prefix="my" %>
 *          ${myFn:date()}
 *  JSP开发模式：
 *      JSP+JavBean
 *      Servlet+JSP+JavaBean(MVC)
 */
public class JSP {
    /** 指令标签: */
    public Object[][] directiveTag = {
            {""},//
    };
}
