package language.data;

/**
 * 语言基础数据类型 及其 扩展，操作
 *
 * 常例：
 *      java字符串对象： "".equals("")
 */
public class Data
{

    /**
     * 类型转换:
     * 自动类型转换(op为运算符):
     *  (byte或short) op int→int
     *  (byte或short或int) op long→long
     *  (byte或short或int或long) op float→float
     *  (byte或short或int或long或float) op double→double
     *  char op int→int
     * 强制类型转换:
     *
     */
    double e=345+33.2f+33.2d;
    int h;
    byte g=(byte)h;//把int型变量a强制转换为byte型

    /**
     * 泛型
     * 分类：
     *  声明泛型类: class ClassName<TypeClass>
     *  多接口限制: class ClassName<TypeClass extends/super ParentClass & interface1 & interface2 & interface3>
     *  通配符泛型: class ClassName<? extends ParentClass>
     *  泛型方法: public <TypeClass> void methodName(TypeClass x) {}
     * 作用：
     *  泛型仅在源码中给javac编译器使用,.class文件中不带有泛形信息，不影响程序运行效率，这个过程称之为“类型擦除（type erasure）”。
     */
    public static void main(String[] args){ "".equals(""); }

}
