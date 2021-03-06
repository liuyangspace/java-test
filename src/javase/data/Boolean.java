package javase.data;

/**
 * @see java.lang.Boolean
 */
class Boolean implements java.io.Serializable,
        Comparable<Boolean>
{
    boolean b = false;//定义b为布尔型变量，且初值为false

    public static final Boolean TRUE = new Boolean(true);
    public static final Boolean FALSE = new Boolean(false);
    //public static final Class<Boolean> TYPE = (Class<Boolean>) Class.getPrimitiveClass("boolean");

    private final boolean value;

    public Boolean(boolean value) {
        this.value = value;
    }
    public Boolean(String s) {
        this(parseBoolean(s));
    }

    public boolean booleanValue() {
        return value;
    }

    public static boolean parseBoolean(String s) {
        return ((s != null) && s.equalsIgnoreCase("true"));
    }
    public static Boolean valueOf(boolean b) {
        return (b ? TRUE : FALSE);
    }
    public static Boolean valueOf(String s) {
        return parseBoolean(s) ? TRUE : FALSE;
    }

    //
    public static String toString(boolean b) {
        return b ? "true" : "false";
    }
    public String toString() {
        return value ? "true" : "false";
    }
    public int hashCode() {
        return Boolean.hashCode(value);
    }
    public static int hashCode(boolean value) {
        return value ? 1231 : 1237;
    }

    public boolean equals(Object obj) { if (obj instanceof Boolean) { return value == ((Boolean)obj).booleanValue(); } return false; }
    public static boolean getBoolean(String name) {return java.lang.Boolean.getBoolean(name);}

    public int compareTo(Boolean b) {
        return compare(this.value, b.value);
    }
    public static int compare(boolean x, boolean y) { return (x == y) ? 0 : (x ? 1 : -1); }

    public static boolean logicalAnd(boolean a, boolean b) {
        return a && b;
    }
    public static boolean logicalOr(boolean a, boolean b) {
        return a || b;
    }
    public static boolean logicalXor(boolean a, boolean b) {
        return a ^ b;
    }

}
