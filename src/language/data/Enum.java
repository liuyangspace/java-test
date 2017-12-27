package language.data;

import java.io.Serializable;

public enum Enum // <E extends java.lang.Enum<E>> implements Comparable<E>, Serializable
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

    // 实现
}
