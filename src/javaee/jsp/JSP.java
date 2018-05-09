package javaee.jsp;

/**
 * JSP (Java Server Pages)
 * 语法格式 : <%@ directive [ attribute =“value” ] * %>
 * 指令标签:
 *      page    指令，属性：
 *          pageEncoding    : 当前页面保存信息的编码
 *          contentType     : 当前页面生成的servlet文件响应浏览器的编码
 *          import          : 导入Java类或接口，可使用通配符'*',多个类之间使用逗号分隔,属性可以重复引用
 *          language        : 当前jsp页面使用的语言,默认：java
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
 *  脚本标签：
 *      <%! statement code... %>    // 声明标签,声明 Servlet 成员属性，成员方法
 *      <%= expression %>           // 表达式标签，将表达式的结果输出到浏览器
 *      <% code... %>               // 代码块标签，Servlet.service 里的处理代码
 *      <%-- comment --%>           // 注释
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
 *      forward
 *      include
 *      useBead
 *      setProperty
 *  JSTL(JavaServer Pages Standard Tag Library)
 *      http://java.sun.com/jsp/jstl/core
 *          set
 *          out
 *          remove
 *          if
 *          choose
 *          forEach
 *          url
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
