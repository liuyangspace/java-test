package javaee.jsp;

/**
 * JSP (Java Server Pages)
 *  应用场景: JSP是在html页面中嵌入Java代码, 区别于servlet, 便于与html交互
 *  JSP 文件Java应用流程:
 *      tomcat根据配置文件调用servlet引擎处理JSP页面:
 *          # 配置位置： %tomcat%/conf/web.xml  --> serlvet(*.jsp) -->  org.apache.jasper.servlet.JspServlet
 *          # 在web context root 读取指定的文件	（*.jsp文件）
 *          # 将读取的文件分析，生成相应的servlet文件，（*.java文件）：目录：%tomcat%\work\引擎\主机\项目名\org\apache\jsp
 *      JSP 文件解释：将JSP文件解释成 Servlet 类 （Tomcat 下 解释，编译目录为 %CATALINA_BASE%/work/...）
 *          # 生成 Servlet 类 （Tomcat 下 ，继承于 org.apache.jasper.runtime.HttpJspBase extends HttpServlet implements HttpJspPage ）
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
 *  组成：
 *      JSP元素：由JSP引擎直接处理的部分，这一部分必须符合JSP语法，否则会导致编译错误
 *      Template(模板)data：标记在<%...%>以外的部分，例如：代码中的HTML内容等，这些数据会直接传送到客户端的浏览器
 *  脚本标签（JSP 指令元素）：
 *      <%@ directive [ attribute =“value” ] * %>    // 指令标签
 *      <%! statement code... %>    // 声明标签,声明 Servlet 成员属性，成员方法
 *      <%= expression %>           // 表达式标签，将表达式的结果输出到浏览器
 *      <% code... %>               // 代码块标签，Servlet.service 里的处理代码
 *      <%-- comment --%>           // 注释
 *  指令标签:
 *      <%@ page %>    指令，属性：
 *          pageEncoding    : 当前页面保存信息的编码, e.g: <%@ page [ attribute =“value” ] * %>
 *          contentType     : 当前页面生成的servlet文件响应浏览器的编码
 *          import          : 导入Java类或接口，可使用通配符'*',多个类之间使用逗号分隔,属性可以重复引用
 *          javase          : 当前jsp页面使用的语言,默认：java
 *          info            : 当前页面的输出信息
 *          session         : 当前页面是否可以直接使用 变量 session ,默认：ture，e.g.: session.isNew()
 *          extends         ; 当前jsp页面在生成servlet文件时，继承的父类
 *          isErrorPage     : 是否是错误页面,默认值：false。为true,可以直接使用 变量 exception
 *          errorPage       : 确定错误页面
 *          isThreadSafe    : 是否是线程安全,默认值：true
 *          isELIgnored     : 是否忽略EL表达式,默认值：false,
 *          buffer          : 当前servlet文件的缓存区大小,默认值是8kb
 *          autoFlush       : 是否自动刷新,当buffer缓存区被填写满后，会自动的刷新内容到浏览器
 *      <%@ include %> 指令,静态包含
 *          file            : 包含的页面，e.g: <%@ include file=“filename” %>
 *      <%@ taglib %>  指令,java标签库
 *          uri             :
 *          prefix          : 函数库 命名空间前缀
 *  JSP内置对象：
 *      Object page                 // 当前类的引用
 *      ServletRequestWrapper request  // 请求
 *      HttpServletResponse response // 响应，IO系统JSP使用 Writer
 *      JspWriter out               // out,
 *      HttpSession session         // 会话
 *      ServletContext application  // servlet 上下文
 *      ServletConfig config        // servlet 配置信息
 *      Throwable exception         // 页面异常
 *      PageContext pageContext     // 当前JSP页面的上下文对象,可以在不同的作用域设置属性值 及 用getX()方法获取其他内置对象
 *                                      setAttribute,getAttribute,findAttribute 作用域（从小到大）：page < request < session < application
 *  jsp标签(Jsp Action(JSP动作))：
 *      <jsp:forward>       // 接受用户输入并将请求分派给另一页面，e.g:<jsp:forward page={"relativeURL" | "<%= expression %>"} />
 *          page , 引入的页面
 *      <jsp:include>       // 请求时文件包含, e.g: <jsp:include page={"relativeURL" | "<%= expression %>"} />
 *          # 动态引入: 用于把另一个资源的输出内容插入进当前JSP页面的输出内容中，这种在JSP页面执行时的引入方式称之为动态引入
 *          # 编译时引入：区别于include指令只能引入遵循JSP格式的文件，被引入文件与当前JSP文件共同被编译成一个servlet的源文件
 *          page , 引入的页面
 *          flush ,
 *      <jsp:useBean>       // 实例化JavaBean类,使用一个ID和一个给定作用范围和同一ID的JavaBean相关联, 属性:
 *          id ，指定范围内，当前bean的实例化对象的变量名
 *          scope ，当前bean的使用范围, 取值："page | request | session | application"
 *          class ，获得指定bean的实例对象，如果没有则创建, 取值：指定bean的完整路径名
 *          type ，获得指定bean的实例对象，如果没有则抛异常, 取值：指定bean的完整路径名
 *          beanName ，使用java.beans.Beans实例化bean对象, 取值：指定bean的完整路径名
 *      <jsp:setProperty>   // 设置JavaBean的属性值
 *          name ，使用已有的bean, 值必须与<jsp:useBean>的id匹配，如果不存在抛异常
 *          property ，bean的属性值
 *          value ，需要设置的值
 *          param ，请求参数的值
 *      <jsp:getProperty>   // 取得JavaBean的属性值
 *          name ，需要获得bean的实例对象变量值, 取值必须与<jsp:useBean>的id匹配
 *          property ，需要获得bean的属性值
 *      <jsp:param>         // 使用<jsp:param>标签向当前程序传递参数信息,e.g: <jsp:param name="PN" value="{PV | <%= expression %>}" />
 *          name ,
 *          values ,
 *  自定义（可参考apache JSTL.jar包）：
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
 *  JSP开发模式：
 *      JSP+JavBean
 *      Servlet+JSP+JavaBean(MVC)
 */
public class JSP {

    /** 指令标签: */
    public Object[][] directiveTag = {
            {""},//
    };

    /**
     * EL,Expression Language:
     *  # JSP2.0之后，EL已经正式纳入并成为标准规范之一。
     *  功能：获取数据,(设置使用赋值运算符 = )
     *  关闭忽略：<%@ page isELIgnored="false" %>
     *  标签：
     *      ${attributeName}        // 同于 pageContext.findAttribute(attributeName),没有属性时返回空字符串
     *      ${insideObject.attributeName}   // EL内置对象 使用
     *  内置对象：
     *      pageContext	            // 对应于JSP页面中的pageContext对象（注意：取的是pageContext对象。）
     *      pageScope	            // 代表page域中用于保存属性的Map对象
     *      requestScope	        // 代表request域中用于保存属性的Map对象
     *      sessionScope	        // 代表session域中用于保存属性的Map对象
     *      applicationScope        // 代表application域中用于保存属性的Map对象
     *      param                   // 保存了所有请求参数的Map对象
     *      paramValues             // 保存了所有请求参数的Map对象，它对于某个请求参数，返回的是一个string[]
     *      header                  // 保存了所有http请求头字段的Map对象
     *      headerValues            // 返回http请求头字段的string[]数组
     *      cookie                  // 保存了所有cookie的Map对象
     *      initParam               // 保存了所有web应用初始化参数的map对象
     *  示例:
     *      ${pageContext.request.queryString}      // 取得请求的参数字符串
     *      ${pageContext.request.requestURL}       // 取得请求的URL，但不包含请求参数字符串
     *      ${pageContext.request.contextPath}      // 取得服务的web application的名称
     *      ${pageContext.request.method}           // 取得HTTP的方法(GET、POST)
     *      ${pageContext.request.protocol}         // 取得使用的协议(HTTP/1.1、HTTP/1.0)
     *      ${pageContext.request.remoteUser}       // 取得用户名称
     *      ${pageContext.request.remoteAddr}       // 取得用户的IP地址
     *      ${pageContext.session.new}              // 判断session是否为新的所谓新的session，表示刚由server产生而client尚未使用
     *      ${pageContext.session.id}               // 取得session的ID
     *      ${pageContext.servletContext.serverInfo}// 取得主机端的服务信息
     *  运算符：
     *      # 类操作 及 常用
     *      .                       // 取成员属性，或 getX、setX(使用赋值运算符 =) 成员方法,或 Map指定key的值
     *      []                      // 语法：[ index|value ] ,取数组指定index的值，或Map指定key的值
     *      empty                   // 检查对象是否为null或“空”，e.g: ${empty A}
     *      二元表达式              // ${user!=null?user.name : “”}
     *      # 算术运算符
     *      +                       // 加, e.g: ${1+1}, 2
     *      -                       // 减. e.g: ${2-1}, 1
     *      *                       // 乘, e.g: ${1*1}, 1
     *      / 或 div                // 除, e.g: ${5 div 2}, 2.5
     *      % 或 mod                // 取余, e.g: ${5 mod 2}, 1
     *      # 关系运算符
     *      ==或 eq                 // 等于(equle)，e.g: ${1 eq 1}, true
     *      = 或 ne                 // 不等于(not equal)，e.g: ${1 ne 1}, false
     *      <  或 lt                // 小于(Less than)，e.g: ${1 lt 1}, false
     *      <= 或 le                // 小于等于(Less than or equal)，e.g: ${1 le 1}, true
     *      >  或 gt                // 大于(Greater than)，e.g: ${1 gt 1}, false
     *      >= 或 ge                // 大于等于Greater than or equal)，e.g: ${1 ge 1}, true
     *      # 逻辑运算符
     *      && 或 and               // 交集(与)，e.g: ${A and B}, true/false
     *      || 或 or                // 并集(或), e.g: ${A or B}, true/false
     *      ! 或 not                // 非, ${not A}, true/false
     *  自定义:
     *      编写一个Java类的静态方法, e.g：
     *          public class MyFunction { public static String upperCase(String s){ return s.toUpperCase(); } }
     *      创建一个标签描述文件（tld）文件，其就是一个xml文件，一般放在WEB-INF下，e.g:
     *          <?xml version="1.0" encoding="UTF-8" ?>
     *          <taglib xmlns="http://java.sun.com/xml/ns/j2ee"
     *          xmlns:xsi="http://www.w3.org/2001/XMLSchema-instance"
     *          xsi:schemaLocation="http://java.sun.com/xml/ns/j2ee http://java.sun.com/xml/ns/j2ee/web-jsptaglibrary_2_0.xsd"
     *          version="2.0">
     *             <description>MyFunctionTld</description>
     *             <display-name>MyFunction</display-name>
     *             <tlib-version>1.0</tlib-version>
     *             <short-name>mf</short-name><!--函数库前缀-->
     *             <uri>http://www.exmple.om/tld</uri>
     *              <function> <!--定义一个函数-->
     *                  <name>convert</name> <!--函数名称-->
     *                  <function-class>my.MyFunction</function-class> <!--指定是哪个类中的函数，类名用全名-->
     *                  <!--指定方法的签名。返回值类型和参数类型要用全名,各个参数之间用逗号分隔-->
     *                  <function-signature>java.lang.String convert(java.lang.String)</function-signature>
     *              </function>
     *          </taglib>
     *      在web.xml中注册该tld文件:
     *          <jsp-config>
     *              <taglib>
     *                  <taglib-uri>http://www.exmple.om/tld</taglib-uri><!--与tld中uri一致就可-->
     *                  <taglib-location>/WEB-INF/tld/myFunction.tld</taglib-location><!--tld所在的位置-->
     *              </taglib>
     *          </jsp-config>
     *      在JSP页面中导入和使用自定义函数:
     *          利用taglib指令引入该tld: <%@ taglib uri="http://www.exmple.om/tld" prefix="mf"%>
     *          代码调用: ${mm:convert("abcdefg")}
     *  JSTL中的常用 EL函数库:
     *      页面导入SUN 函数库: <%@taglib uri="http://java.sun.com/jsp/jstl/functions" prefix="fn"%>
     *      常用函数:
     *          fn:toLowerCase("")  // 接收一个字符串类型的参数,将字符串中包含的所有字符转换为小写形式，返回转换后的字符串
     *          fn:toUpperCase("")  // 接收一个字符串类型的参数,将字符串中包含的所有字符转换为大写形式，返回转换后的字符串
     *          fn:trim("")         // 接收一个字符串类型的参数,删除字符串的首尾的空格，并返回删除空格后的结果字符串，
     *          fn:length("")       // 返回一个集合或数组大小，或返回一个字符串中包含的字符的个数，返回值为int类型。
     *          fn:split("a,b",",") // 以指定字符串作为分隔符，将一个字符串分割成字符串数组并返回这个字符串数组。
     *          fn:join({"a","b"},",") // 以一个字符串作为分隔符，将一个字符串数组中的所有元素合并为一个字符串并返回。
     *          fn:indexOf("a,b",",") // 返回指定字符串在一个字符串中第一次出现的索引值，返回值为int类型
     *          fn:contains("a,b",",") // 检测一个字符串中是否包含指定的字符串，返回值为布尔类型
     *          fn:startsWith("a,b",",") // 检测一个字符串是否是以指定字符串开始的，返回值为布尔类型
     *          fn:endsWith("a,b",",") // 检测一个字符串是否是以指定字符串结束的，返回值为布尔类型
     *          fn:replace("a,b",",",":") // 将一个字符串中包含的指定子字符串替换为其它的指定字符串，并返回替换后的结果字符串
     *          fn:substring("a,b",1,2) // 截取一个字符串的子字符串并返回截取到的子字符串
     *          fn:substringAfter("a,b",",") // 截取并返回一个字符串中的指定子字符串第一次出现之后的子字符串
     *          fn:substringBefore("a,b",",") // 截取并返回一个字符串中的指定子字符串第一次出现之前的子字符串
     */
    public static String[] elKeyWords = {
            "and", "or", "no",
            "eq", "ne", "lt", "le", "gt", "ge",
            "div", "mod", "empty", "instanceof",
            "true", "false", "null",
    };

    /**
     * JSTL(JavaServer Pages Standard Tag Library)
     *  # 完整的JSTL应包含SUN公司提供的jstl.jar 包和WEB容器产商提供的JSTL实现包
     *  # 参考下载: http://tomcat.apache.org/taglibs/standard/
     *  # 安装: 解压缩后将lib 中的jstl.jar、standard.jar 复制到WEB应用程序的WEB-INF\lib 下
     *  组成 及常用标签 :
     *      核心标签库(Core tag library): <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
     *          <c:out>     // 显示数据的内容，格式： <c:out value="value" [excapeXml="true|false"]> [default value] </c:out>
     *              value ，指定要输出的内容
     *              excapeXml ，指定是否将>、<、&、'、" 等特殊字符进行HTML编码转换后再进行输出。默认值为true
     *              default ，指定如果value属性的值为null时所输出的默认值
     *          <c:set>     // 将变量储存至JSP范围中或JavaBean的属性中
     *              格式1：<c:set value="value" var="varName" [scope="page|request|"] />
     *              格式2: <c:set target="varName" property="name" [scope="session|application"]  />
     *              value , 用于指定属性值,value为null则移除
     *              var , 用于指定要设置的Web域属性的名称
     *              scope , 用于指定属性所在的Web域
     *              target , 用于指定要设置属性的对象，这个对象必须是JavaBean对象或java.util.Map对象
     *              property , 用于指定当前要为对象设置的属性名称
     *          <c:remove>  // 用于删除各种Web域中的属性。
     *              格式：<c:remove var="varName" [scope="{page|request|session|application}"] />
     *              var , 用于指定要删除的Web域属性的名称
     *              scope , 用于指定属性所在的Web域
     *          <c:catch>   // 用于捕获嵌套在标签体中的内容抛出的异常
     *              格式：<c:catch [var="varName"]>nested actions</c:catch>
     *              var , 标识<c:catch>标签捕获的异常对象，它将保存在page这个Web域中
     *          <c:if>      // 构造“if-then”结构的条件表达式
     *              格式：<c:if test="">
     *              test , 决定是否处理标签体中的内容的条件表达式
     *              var , 用于指定将test属性的执行结果保存到某个Web域中的某个属性的名称
     *              scope , 指定将test属性的执行结果保存到哪个Web域中
     *          <c:choose>,<c:when>,<c:otherwise>  // 用于指定多个条件选择的组合边界，构造类似 “if-else if-else” 的复杂条件判断结构。
     *              格式：<c:choose> <c:when test="true|false"> code... </c:when> <c:otherwise> code... </c:otherwise> </c:choose>
     *              test , 决定是否处理标签体中的内容的条件表达式
     *          <c:forEach> // 用于对一个集合对象中的元素进行循环迭代操作，或者按指定的次数重复迭代执行标签体中的内容。
     *              格式：<c:forEach [var="varName"] items="collection" [varStatus="varStatusName"]
     *                  [begin="begin"] [end="end"] [step="step"]> code... </c:forEach>
     *              var , 指定将当前迭代到的元素保存到page这个Web域中的属性名称
     *              varStatus , 存放现在指到之成员的相关信息
     *                  varStatus.first     // 第一个成员
     *                  varStatus.last      // 最后一个成员
     *                  varStatus.index     // 成员的索引
     *                  varStatus.count     // 成员的总和
     *              items , 将要迭代的集合对象,或数组
     *              begin , 如果指定items属性，就从集合中的第begin个元素(索引值从0开始)开始迭代；反之，就从begin指定的值开始迭代。直到end值时结束迭代
     *              end , 参看begin属性的描述
     *              step , 指定迭代的步长，即迭代因子的迭代增量
     *          <c:forTokens>   // 浏览一字符串中所有的成员，其成员是由定义符号所分隔的
     *              格式：<c:forTokens items="stringOfTokens" delims="delimiters" [var="varName"] [varStatus="varStatusName"]
     *                  [begin="begin"] [end="end"] [step="step"]> code... </c:forTokens>
     *              var , 存放当前迭代到的成员
     *              items , 被迭代的字符串
     *              delims , 用来分割items的字符串
     *              varStatus , 存放现在指到之成员的相关信息
     *              begin ， 开始的位置
     *              end ， 结束的位置
     *          <c:param>   // URL地址附加参数,在为一个URL地址附加参数时，将自动对参数值进行URL编码，
     *              格式：<c:param name="name" value="value" />
     *          <c:url>     // 在JSP页面中构造一个URL地址，其主要目的是实现URL重写。URL重写就是将会话标识号以参数形式附加在URL地址后面
     *              格式：<c:url value="" var="" [scope="session"] />
     *              value , 要构造的url
     *              var , 报存构造的结果
     *              scope ,
     *          <c:import>  // 包含文件
     *              格式：<c:import url="" [var=""] [scope="session"] />
     *              url , 文件包含的地址
     *              context ,
     *              var ,
     *              scope ,
     *              charEncoding , 编码格式
     *              varReader , 存储包含的文件内容
     *          <c:redirect>    // 用于实现请求重定向
     *              格式：<c:redirect url=""  context="" />
     *              url , 指定要转发或重定向到的目标资源的URL地址
     *              context , 要使用相对路径重定向到同一个服务器下的其他WEB应用程序中的资源时，context属性指定其他WEB应用程序的名称
     *          ...
     *      国际化标签(I18N—capable formatting tag library): <%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt" %>
     *      数据库标签(SQL tag library): <%@ taglib uri="http://java.sun.com/jsp/jstl/sql" prefix="sql" %>
     *      XML标签(XML tag library): <%@ taglib uri="http://java.sun.com/jsp/jstl/xml" prefix="x" %>
     *      函数标签(Functions tag library)--EL函数: <%@ taglib uri="http://java.sun.com/jsp/jstl/functions" prefix="fn" %>
     */

}
