package language;

/**
 * Link: http://java.sun.com
 * KeyWorlds:
 *  JDK（Java Development Kit）
 *  JRE（Java Runtime Environment)
 *  JVM(Java Virtual Machine（Java虚拟机）)(虚机器码（Virtual Machine Code）)
 *  J2SE（Java 2 Standard Edition）
 *  J2EE（Java 2 Enterprise Edition）
 *  J2ME（Java 2 Micro Edition）
 *  JNI（Java Native Interface）
 *  EJB（Enterprise JavaBean）
 *  RMI（Remote Method Invoke）
 *  JSR(Java Specification Requests,Java 规范提案)
 *  JCP(Java Community Process,Java开发者以及被授权者组成，职能是发展和更新)
 *  DLL(Dynamic Link Library（动态链接库）)
 * Java的应用:
 *  Applet: Applet是嵌入到网页里用于装饰网页或者完成某种特殊功能的小应用程序。Applet由浏览器中的Java解释器负责解释执行。
 *  Application: Java Application就是独立运行在Java虚拟机上的一系列的应用程序。
 *  servlet: servlet是运行在服务器端的小程序，它负责处理客户端传来的请求（request），然后传给客户端一个响应（response）。
 * Java使用补码来表示二进制数
 */

public class LanguageStatement
{

    /**
     * 常量: 用final做修饰符。
     */
    final int i = 345;
    final float f = 33.2f;
    final double d = 33.2d;
    final java.lang.String s = "ddddd";

    /**
     * 变量: 字母、数字、下划线、$字符组成，不能以数字开头，而且不能为保留字。
     * 声明格式为: type identifier [=value][，identifier[=value]…];多个变量之间用“,”分隔，结束用“;”。
     */
    int a1,a2,a3;
    {
        int a1=23;
        a1=45;
    }
    int a5 = 6,a6 = 8;
    float tr_$ = 33.f;
    double sxf$;
    java.lang.String _s44 = "dddd";

    /**
     * 运算符
     * 算术:
     *  单目：+（取正）-（取负） ++（自增） - -（自减）
     *  双目：+ - * / %（取余）
     *  三目：a>b?true:false
     * 关系运算符: ＞ ＜ ＞= ＜= == !=
     * 位运算符: &(与) ~(非) |(或) ^(异或)
     * 位移: <<(带符号左移) >>(带符号右移) >>>(无符号右移)
     * 逻辑运算符: &&(与) !(非) ||(或)
     * 其他: instanceof(实例运算符) new(内存分配运算符)
     */

    /**
     * 控制语句:
     *  分支语句 if-elseif-else，break，switch-case-default，return
     *  循环语句 while，do-while，[Lable:]for(;;)，continue[ Lable]
     *  异常处理语句 try-catch-finally，throw,throws,assert
     */

    // 注释语句
    // //用于单行注释。
    // /*…*/用于多行注释。注释从/*开始，到*/结束。
    // /**…*/是Java所特有的doc注释。注释从/**开始，到*/结束。在JDK中有javadoc的工具，通过这个工具可以由这些注释生成HTML形式的帮助文件。

    /**
     * 声明：
     *      boolean,byte,char,double,float,int,long,short,null
     *      package,interface,abstract,class,enum
     *      super,this,true,false,void
     *      import,extends,implements
     * 修饰符:
     *      public,private,protected,
     *      native(本地),static,final
     *      strictfp(严格遵守FP-strict),transient(暂时的,非序列化的),volatile(多线程共享),synchronized(同步锁),
     * @ 符：注解（错误检查，及屏蔽）
     * 保留字：goto,const
     */

    public static void main(String[] args)
    {
        System.out.print("JAVA LanguageStatement\\LanguageStatement\n");
    }
}
