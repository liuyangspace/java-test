package javase.data.number;

import java.lang.Byte;
import java.lang.Number;

/**
 * @see java.lang.Integer
 */

public /* final */ class Integer extends Number implements Comparable<Integer>
{
    public static final int   MIN_VALUE = 0x80000000;
    public static final int   MAX_VALUE = 0x7fffffff;
    static final char[] digits = {
            '0' , '1' , '2' , '3' , '4' , '5' , '6' , '7' , '8' , '9' ,
            'a' , 'b' , 'c' , 'd' , 'e' , 'f' , 'g' ,
            'h' , 'i' , 'j' , 'k' , 'l' , 'm' , 'n' ,
            'o' , 'p' , 'q' , 'r' , 's' , 't' ,
            'u' , 'v' , 'w' , 'x' , 'y' , 'z'
    };

    private final int value;
    public static final int SIZE = 32;
    public static final int BYTES = SIZE / Byte.SIZE;

    public Integer(int value) { this.value = value; }
    public Integer(String s) throws NumberFormatException { this.value = parseInt(s, 10); }

    // 类型变换
    public static String toString(int i) {return java.lang.Integer.toString(i);}
    public static String toString(int i, int radix) {return java.lang.Integer.toString(i,radix);}
    public static long toUnsignedLong(int x) { return ((long) x) & 0xffffffffL; }
    public static String toUnsignedString(int i)  {
        return Long.toString(toUnsignedLong(i));
    }
    public static String toUnsignedString(int i, int radix) { return Long.toUnsignedString(toUnsignedLong(i), radix); }

    public static int parseInt(String s) throws NumberFormatException { return parseInt(s,10); }
    public static int parseInt(String s, int radix) throws NumberFormatException {return java.lang.Integer.parseInt(s,radix);}
    public static int parseInt(CharSequence s, int beginIndex, int endIndex, int radix) throws NumberFormatException {return java.lang.Integer.parseInt(s,beginIndex,endIndex,radix);}
    public static int parseUnsignedInt(String s) throws NumberFormatException { return parseUnsignedInt(s, 10); }
    public static int parseUnsignedInt(String s, int radix) throws NumberFormatException {return java.lang.Integer.parseUnsignedInt(s,radix);}
    public static int parseUnsignedInt(CharSequence s, int beginIndex, int endIndex, int radix) throws NumberFormatException {return java.lang.Integer.parseUnsignedInt(s,beginIndex,endIndex,radix);}

    public String toString() { return toString(value); }
    public byte byteValue() {
        return (byte)value;
    }
    public short shortValue() {
        return (short)value;
    }
    public int intValue() {
        return value;
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
    // 进制变换
    public static String toBinaryString(int i) {
        return java.lang.Integer.toBinaryString(i);
    }
    public static String toOctalString(int i) {
        return java.lang.Integer.toOctalString(i);
    }
    public static String toHexString(int i) { return java.lang.Integer.toHexString(i); }
    // 类型解析
    public static Integer valueOf(int i) {return new Integer(java.lang.Integer.valueOf(i).intValue());}
    public static Integer valueOf(String s) throws NumberFormatException { return Integer.valueOf(parseInt(s, 10)); }
    public static Integer valueOf(String s, int radix) throws NumberFormatException { return Integer.valueOf(parseInt(s,radix)); }

    public static Integer getInteger(String nm) {
        return getInteger(nm, null);
    }
    public static Integer getInteger(String nm, int val) { Integer result = getInteger(nm, null); return (result == null) ? Integer.valueOf(val) : result; }
    public static Integer getInteger(String nm, java.lang.Integer val) {return new Integer(java.lang.Integer.getInteger(nm,val).intValue());}
    public static Integer decode(String nm) throws NumberFormatException {return new Integer(java.lang.Integer.decode(nm).intValue());}

    // 运算
    public static int divideUnsigned(int dividend, int divisor) { return (int)(toUnsignedLong(dividend) / toUnsignedLong(divisor)); }
    public static int remainderUnsigned(int dividend, int divisor) { return (int)(toUnsignedLong(dividend) % toUnsignedLong(divisor)); }

    public static int highestOneBit(int i) { return java.lang.Integer.highestOneBit(i); }
    public static int lowestOneBit(int i) { return java.lang.Integer.lowestOneBit(i); }
    public static int numberOfLeadingZeros(int i) { return java.lang.Integer.numberOfLeadingZeros(i); }
    public static int numberOfTrailingZeros(int i) { return java.lang.Integer.numberOfTrailingZeros(i); }
    public static int bitCount(int i) { return java.lang.Integer.bitCount(i); }
    public static int reverse(int i) { return java.lang.Integer.reverse(i); }
    public static int signum(int i) { return java.lang.Integer.signum(i); }
    public static int reverseBytes(int i) { return java.lang.Integer.reverseBytes(i); }
    public static int rotateLeft(int i, int distance) {
        return (i << distance) | (i >>> -distance);
    }
    public static int rotateRight(int i, int distance) {
        return (i >>> distance) | (i << -distance);
    }

    public static int sum(int a, int b) {
        return a + b;
    }
    public static int max(int a, int b) {
        return Math.max(a, b);
    }
    public static int min(int a, int b) {
        return Math.min(a, b);
    }
    // 比较
    public static int compare(int x, int y) {
        return (x < y) ? -1 : ((x == y) ? 0 : 1);
    }
    public static int compareUnsigned(int x, int y) {
        return compare(x + MIN_VALUE, y + MIN_VALUE);
    }

    public boolean equals(Object obj) { if (obj instanceof Integer) { return value == ((Integer)obj).intValue(); } return false; }
    public int compareTo(Integer anotherInteger) {
        return compare(this.value, anotherInteger.value);
    }

    public static int hashCode(int value) { return value; }
    public int hashCode() {
        return Integer.hashCode(value);
    }

    public static void main(String[] args)
    {
        java.lang.Integer int1 = new java.lang.Integer(123456789);
        System.out.println(java.lang.Integer.toString(123456789));
        System.out.println(java.lang.Integer.toUnsignedLong(123456789));
        System.out.println(java.lang.Integer.toUnsignedString(123456789));
        System.out.println(java.lang.Integer.toHexString(123456789));
        System.out.println(java.lang.Integer.toOctalString(123456789));
        System.out.println(java.lang.Integer.toBinaryString(123456789));
    }
}
