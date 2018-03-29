package language.data;

import java.io.Serializable;

/**
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

/* e.g:

public enum Enum
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