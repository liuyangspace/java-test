package language.data.object.clazz.annotation;

/**
 * The common interface extended by all annotation types.
 *
 * @see java.lang.annotation
 * @see java.lang.annotation.Annotation
 */
public interface Annotation extends java.lang.annotation.Annotation
{
    boolean equals(Object obj);
    int hashCode();
    String toString();
    Class<? extends java.lang.annotation.Annotation> annotationType();
}
/**
 * 元注解(meta-annotation):
 *  @Target:(用于描述注解的使用范围)
 *      1.CONSTRUCTOR:用于描述构造器
 *      2.FIELD:用于描述域
 *      3.LOCAL_VARIABLE:用于描述局部变量
 *      4.METHOD:用于描述方法
 *      5.PACKAGE:用于描述包
 *      6.PARAMETER:用于描述参数
 *      7.TYPE:用于描述类、接口(包括注解类型) 或enum声明
 *  @Retention:(描述注解的生命周期)
 *      1.SOURCE:在源文件中有效（即源文件保留）
 *      2.CLASS:在class文件中有效（即class保留）
 *      3.RUNTIME:在运行时有效（即运行时保留）
 *  @Documented:(描述其它类型的annotation应该被作为被标注的程序成员的公共API,标记注解，没有成员)
 *  @Inherited:(阐述了某个被标注的类型是被继承的)
 *  @interface:(自定义注解)
 *      格式：public @interface 注解名 {定义体}
 */