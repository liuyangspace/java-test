package javase.data.number;

import java.lang.Byte;

public /* final */ class Short extends Number implements Comparable<Short>
{
    public static final int SIZE = 16;
    public static final int BYTES = SIZE / Byte.SIZE;
    public static final short   MIN_VALUE = -32768;
    public static final short   MAX_VALUE = 32767;
    // public static final Class<Short>    TYPE = (Class<Short>) Class.getPrimitiveClass("short");
    private static final long serialVersionUID = 7515723908773894738L;
    private final short value;

    public Short(short value) {
        this.value = value;
    }
    public Short(String s) throws NumberFormatException { this.value = parseShort(s, 10); }

    public String toString() {
        return java.lang.Integer.toString((int)value);
    }
    public static String toString(short s) {
        return Integer.toString((int)s, 10);
    }
    public static short parseShort(String s, int radix) throws NumberFormatException {return java.lang.Short.parseShort(s,radix);}
    public static short parseShort(String s) throws NumberFormatException { return parseShort(s, 10); }

    public static java.lang.Short valueOf(String s, int radix) throws NumberFormatException { return valueOf(parseShort(s, radix)); }
    public static java.lang.Short valueOf(String s) throws NumberFormatException { return valueOf(s, 10); }
    public static java.lang.Short valueOf(short s) {return java.lang.Short.valueOf(s);}

    public static java.lang.Short decode(String nm) throws NumberFormatException {return java.lang.Short.decode(nm);}

    public byte byteValue() {
        return (byte)value;
    }
    public short shortValue() {
        return value;
    }
    public int intValue() {
        return (int)value;
    }
    public long longValue() {
        return (long)value;
    }
    public float floatValue() {
        return (float)value;
    }
    public double doubleValue() {
        return (double)value;
    }

    public int hashCode() {
        return Short.hashCode(value);
    }
    public static int hashCode(short value) {
        return (int)value;
    }

    public boolean equals(Object obj) { if (obj instanceof java.lang.Short) { return value == ((Short)obj).shortValue(); } return false; }
    public int compareTo(Short anotherShort) {
        return compare(this.value, anotherShort.value);
    }
    public static int compare(short x, short y) {
        return x - y;
    }
    public static int compareUnsigned(short x, short y) {
        return Short.toUnsignedInt(x) - Short.toUnsignedInt(y);
    }

    public static short reverseBytes(short i) {
        return (short) (((i & 0xFF00) >> 8) | (i << 8));
    }
    public static int toUnsignedInt(short x) {
        return ((int) x) & 0xffff;
    }
    public static long toUnsignedLong(short x) {
        return ((long) x) & 0xffffL;
    }
}

