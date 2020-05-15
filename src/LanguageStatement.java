
/**
 * 语言组成:
 *  JAVA SE（Java Standard Edition）
 *  标识量:
 *      命名: 字母、数字、下划线、$字符组成，不能以数字开头，而且不能为保留字。
 *      常量: 用final做修饰符。e.g: final int i = 345;
 *      变量: 声明 type identifier [=value][，identifier[=value]…];多个变量之间用“,”分隔，结束用“;”。e.g: int a5 = 6,a6 = 8;
 *
 * Link: http://java.sun.com
 * Java的应用:
 *  Applet: Applet是嵌入到网页里用于装饰网页或者完成某种特殊功能的小应用程序。Applet由浏览器中的Java解释器负责解释执行。
 *  Application: Java Application就是独立运行在Java虚拟机上的一系列的应用程序。
 *  servlet: servlet是运行在服务器端的小程序，它负责处理客户端传来的请求（request），然后传给客户端一个响应（response）。
 * Java使用补码来表示二进制数
 */

public class LanguageStatement
{
    /** operator 运算符 */
    final String[] operator = {
        // 算术运算
        "+","-","++","--",   // 单目
        "+","-","*","/","%", // 双目
        "a>b?true:false",    // 三目
        // 关系运算
        ">","<",">=","<=","==","!=","|=",
        // 位运算
        "&","/","~",
        // 位移
        "<<",">>",">>>",
        // 逻辑运算
        "&&","!","||",
        // 其他
        "instanceof",        // 实例运算符
        "new"                // 内存分配运算符
    };

    /** keyword 关键字 */
    final String[] keyword = {
        // 流程控制 (顺序略)
        "if","else if","else","switch","case","default",    // 分支:if-elseif-else,switch-case-default
        "while","do","for",                                 // 循环:[Lable:]for(init;judge;do),for(value:List)，while，do-while，
        "continue","break","return",                        // 跳转:continue[ Lable],break,return,
        "try","catch","finally","throw","throws",           // 异常处理:try-catch-finally，throw,throws
        "assert",                                           // 调试:assert
                                                            // lambda: ( [ [Type] params] [,]) -> [{] [return] statements [}] [;]
        // 声明
        "void","boolean","byte","char","double","float","int","long","short",   // 基本类型
        "true","false","null",                                                  // 预定义(基本)类型值
        "interface","abstract","class","enum","package","module",               // 复合类型
        "super","this",                                                         // 预定义(复合)类型值,[ParentClass.]super , this
        "import","extends","implements",                                        // 复合类型关系
        // 修饰符
        "public","private","protected",     // 修饰符:访问控制，默认 friendly（同包访问）
        "final",        // 常量 (修饰符)
        "static",       // 静态 (修饰符)
        "native",       // 本地，C/C++实现
        "strictfp",     // 严格遵守FP-strict
        "transient",    // 暂时的,非序列化的
        "volatile",     // 多线程共享
        "synchronized", // 同步锁
        // 其他
        "@",            // 注解（错误检查，及屏蔽）
        "...",          // 可变数量参数，例：public static void dealArray(int... intArray) {}
        // 保留字
        "goto","const"
    };

    // 注释语句
    // //用于单行注释。
    // /*…*/用于多行注释。注释从/*开始，到*/结束。
    // /**…*/是Java所特有的doc注释。注释从/**开始，到*/结束。在JDK中有javadoc的工具，通过这个工具可以由这些注释生成HTML形式的帮助文件。

    public static void main(String[] args) { System.out.print("JAVA LanguageStatement\\LanguageStatement\n"); }
}
/**
 * 1，private 不限制同类内部方法调用（@see java.lang.Boolean.compareTo(Boolean b)）
 *    匿名内部类:new 类名(){方法定义}
 * 2,java8 lambda （定义方法类型接口内的方法）:
 *      声明：interface interfaceName { type methodName(type args...); }
 *      使用：( [ [Type] params] [,]) -> [{] [return] statements [}] [;]
 * 3,Java 8 方法引用( 指向方法的引用 ):
 *      声明：public interface java.util.function.Supplier<T> { T get(); }
 *      使用：Class::[new|method]
 * 4,Java 8 Stream( 集合处理 ):
 *      Collection.stream().forEach().map().filter().limit().sorted()
 *      Collection.parallelStream().count().collect()
 *
 * 5,静态导包: import static
 *      导入类内的静态成员（属性或方法），导入后可直接引用（不须标明类）
 * 6,自动装箱
 */

/**
 * KeyWorlds:
 *  JDK（Java Development Kit）
 *      JRE（Java Runtime Environment)
 *          JVM(Java Virtual Machine（Java虚拟机）)(虚机器码（Virtual Machine Code）)
 *  J2SE（Java 2 Standard Edition）
 *      XML(Extensible Markup Language,可扩展标记语言)
 *          PI(Processing Instruction,处理指令)
 *          DTD(Document Type Definition,文档类型定义)
 *          XSD(XML Schema Definition,XML Schema 定义)
 *          DOM(Document Object Model,文档对象模型)
 *          BOM(Browser Object Model,浏览器对象模型)
 *          XSL(EXtensible Stylesheet Language,扩展样式表语言)
 *          XSLT(XSL Transformations,XSL 转换)
 *  J2EE（Java 2 Enterprise Edition）
 *      JSP(Java Server Pages)
 *          EL(Expression Language)
 *          JSTL(JavaServer Pages Standard Tag Library)
 *  J2ME（Java 2 Micro Edition）
 *  JNI（Java Native Interface）
 *  EJB（Enterprise JavaBean）
 *  RMI（Remote Method Invoke）
 *  JSR(Java Specification Requests,Java 规范提案)
 *  JCP(Java Community Process,Java开发者以及被授权者组成，职能是发展和更新)
 *  DLL(Dynamic Link Library（动态链接库）)
 *  NaN(Not a Number,无穷与非数值,在IEEE浮点数算术标准（IEEE 754）中定义)
 */