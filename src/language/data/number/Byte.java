package language.data.number;

import java.lang.Number;

/**
 *
 * @see java.lang.Byte
 */

public /* final */ class Byte extends Number implements Comparable<Byte>
{
    public static final byte   MIN_VALUE = -128;
    public static final byte   MAX_VALUE = 127;
    public static final int SIZE = 8;
    public static final int BYTES = SIZE / Byte.SIZE;
    private static final long serialVersionUID = -7183698231559129828L;
    private final byte value;

    public Byte(byte value) { this.value = value; }
    public Byte(String s) throws NumberFormatException {this.value = parseByte(s, 10);}

    public byte byteValue() {
        return value;
    }
    public short shortValue() {
        return (short)value;
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

    public static int toUnsignedInt(byte x) {
        return ((int) x) & 0xff;
    }
    public static long toUnsignedLong(byte x) {
        return ((long) x) & 0xffL;
    }

    // public static final Class<java.lang.Byte>     TYPE = (Class<java.lang.Byte>) Class.getPrimitiveClass("byte");
    public int hashCode() {
        return java.lang.Byte.hashCode(value);
    }
    public static int hashCode(byte value) {
        return (int)value;
    }
    public String toString() { return java.lang.Integer.toString((int)value); }
    public static String toString(byte b) { return Integer.toString((int)b, 10); }
    public boolean equals(Object obj) {if (obj instanceof java.lang.Byte) { return value == ((java.lang.Byte)obj).byteValue(); } return false;}

    public static int compare(byte x, byte y) {
        return x - y;
    }
    public int compareTo(Byte anotherByte) { return compare(this.value, anotherByte.value); }
    public static int compareUnsigned(byte x, byte y) { return java.lang.Byte.toUnsignedInt(x) - java.lang.Byte.toUnsignedInt(y); }

    public static java.lang.Byte valueOf(byte b) { return java.lang.Byte.valueOf(b); }
    public static java.lang.Byte valueOf(String s, int radix) throws NumberFormatException {return java.lang.Byte.parseByte(s,radix);}

    public static byte parseByte(String s, int radix){return java.lang.Byte.parseByte(s,radix);}
    public static byte parseByte(String s) throws NumberFormatException {return java.lang.Byte.parseByte(s);}

    public static java.lang.Byte decode(String nm) throws NumberFormatException {return java.lang.Byte.decode(nm);}

    public static void main(String[] args)
    {
        java.lang.Byte byte1 = new java.lang.Byte("121");
        System.out.println(byte1.getClass());
        System.out.println(byte1.toString());
        System.out.println(java.lang.Byte.valueOf("122"));
        System.out.println(java.lang.Byte.parseByte("123"));
    }
}