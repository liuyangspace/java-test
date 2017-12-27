package language.data;

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
     *  声明泛型类: class ClassName<TypeClass>
     *  多接口限制: class ClassName<TypeClass extends/super ParentClass & interface1 & interface2 & interface3>
     *  通配符泛型: class ClassName<? extends ParentClass>
     *  泛型方法: public <TypeClass> void methodName(TypeClass x) {}
     */
}
