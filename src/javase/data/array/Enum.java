package javase.data.array;

import java.io.Serializable;

/*
enum
 1.所有枚举值都是 public , static , final 
e.g:

public enum Enum [ implements InterfaceName ]
{
    RED("红色", 1), GREEN("绿色", 2), BLANK("白色", 3), YELLO("黄色", 4);
    // 成员变量
    private final java.lang.String name;
    private final int ordinal;

    // 构造方法
    private Enum(java.lang.String name, int ordinal) {
        this.name = name;
        this.ordinal = ordinal;
    }

    // 方法
    // public final java.lang.String name() {return name;}
    // public final int ordinal() {return ordinal;}

    // 自定义方法
    // ...
}

*/

/**
 *
 * This is the common base class of all Java javase enumeration types.
 *
 * 枚举的基类，类似于多例
 * 使用 enum 定义的枚举类默认继承了 java.lang.Enum 类
 * 枚举类成员默认使用 public static final 修饰
 * 枚举类也可以实现接口、或继承抽象类。
 *
 * @see java.lang.Enum;
 */

public abstract class Enum<E extends Enum<E>> implements Comparable<E>, Serializable
{
    private final String name;
    private final int ordinal;

    protected Enum(String name, int ordinal) {
        this.name = name;
        this.ordinal = ordinal;
    }

    public final String name() {
        return name;
    }
    public final int ordinal() {
        return ordinal;
    }

    public String toString() {
        return name;
    }
    public final boolean equals(Object other) {
        return this==other;
    }
    public final int hashCode() {
        return super.hashCode();
    }

    protected final Object clone() throws CloneNotSupportedException { throw new CloneNotSupportedException(); }
    protected final void finalize() { }

    public final Class<E> getDeclaringClass() {
        Class<?> clazz = getClass();
        Class<?> zuper = clazz.getSuperclass();
        return (zuper == Enum.class) ? (Class<E>)clazz : (Class<E>)zuper;
    }

    public final int compareTo(E o)
    {
        Enum<?> other = (Enum<?>)o;
        Enum<E> self = this;
        if (self.getClass() != other.getClass() &&  self.getDeclaringClass() != other.getDeclaringClass()) throw new ClassCastException();
        return self.ordinal - other.ordinal;
    }

    // public static <T extends Enum<T>> T valueOf(Class<T> enumType, String name) { return java.lang.Enum.valueOf(enumType,name); }
}