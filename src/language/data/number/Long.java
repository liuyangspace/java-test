package language.data.number;

import java.lang.Byte;
import java.lang.Number;

/**
 * @see java.lang.Long
 */
public /* final */ class Long extends Number implements Comparable<Long>
{
    public static final int SIZE = 64;
    public static final int BYTES = SIZE / Byte.SIZE;
    public static final long MIN_VALUE = 0x8000000000000000L;
    public static final long MAX_VALUE = 0x7fffffffffffffffL;
    //public static final Class<java.lang.Long>     TYPE = (Class<Long>) Class.getPrimitiveClass("long");
    private static final long serialVersionUID = 4290774380558885855L;
    private final long value;

    public Long(long value) {
        this.value = value;
    }
    public Long(String s) throws NumberFormatException { this.value = parseLong(s, 10); }

    public String toString() {
        return toString(value);
    }

    public static String toString(long i){return java.lang.Long.toString(i);}
    public static String toString(long i, int radix) {return java.lang.Long.toString(i,radix);}
    public static String toUnsignedString(long i) {
        return toUnsignedString(i, 10);
    }
    public static String toUnsignedString(long i, int radix) {return java.lang.Long.toUnsignedString(i,radix);}
    public static String toHexString(long i) {return java.lang.Long.toHexString(i);}
    public static String toOctalString(long i) {return java.lang.Long.toOctalString(i);}
    public static String toBinaryString(long i) {return java.lang.Long.toBinaryString(i);}

    public static long parseLong(String s, int radix) throws NumberFormatException {return java.lang.Long.parseLong(s,radix);}
    public static long parseLong(CharSequence s, int beginIndex, int endIndex, int radix) throws NumberFormatException {return java.lang.Long.parseLong(s,beginIndex,endIndex,radix);}
    public static long parseLong(String s) throws NumberFormatException { return parseLong(s, 10); }
    public static long parseUnsignedLong(String s, int radix) throws NumberFormatException {return java.lang.Long.parseUnsignedLong(s,radix);}
    public static long parseUnsignedLong(CharSequence s, int beginIndex, int endIndex, int radix) throws NumberFormatException {return java.lang.Long.parseUnsignedLong(s,beginIndex,endIndex,radix);}
    public static long parseUnsignedLong(String s) throws NumberFormatException { return parseUnsignedLong(s, 10); }
    public static java.lang.Long valueOf(String s, int radix) throws NumberFormatException { return java.lang.Long.valueOf(parseLong(s, radix)); }
    public static java.lang.Long valueOf(String s) throws NumberFormatException { return java.lang.Long.valueOf(parseLong(s, 10)); }
    public static java.lang.Long valueOf(long l) {return java.lang.Long.valueOf(l);}

    public static java.lang.Long getLong(String nm) {
        return getLong(nm, null);
    }
    public static java.lang.Long getLong(String nm, long val) { java.lang.Long result = java.lang.Long.getLong(nm, null); return (result == null) ? java.lang.Long.valueOf(val) : result; }
    public static java.lang.Long getLong(String nm, java.lang.Long val) {return java.lang.Long.getLong(nm,val);}
    public static java.lang.Long decode(String nm) throws NumberFormatException {return java.lang.Long.decode(nm);}

    public byte byteValue() {
        return (byte)value;
    }
    public short shortValue() {
        return (short)value;
    }
    public int intValue() {
        return (int)value;
    }
    public long longValue() {
        return value;
    }
    public float floatValue() {
        return (float)value;
    }
    public double doubleValue() {
        return (double)value;
    }

    public int hashCode() {
        return java.lang.Long.hashCode(value);
    }
    public static int hashCode(long value) {
        return (int)(value ^ (value >>> 32));
    }

    // 比较 运算 转换
    public boolean equals(Object obj) { if (obj instanceof Long) { return value == ((Long)obj).longValue(); } return false; }
    public int compareTo(Long anotherLong) {
        return compare(this.value, anotherLong.value);
    }
    public static int compare(long x, long y) {
        return (x < y) ? -1 : ((x == y) ? 0 : 1);
    }
    public static int compareUnsigned(long x, long y) {
        return compare(x + MIN_VALUE, y + MIN_VALUE);
    }

    public static long divideUnsigned(long dividend, long divisor) {return java.lang.Long.divideUnsigned(dividend,divisor);}
    public static long remainderUnsigned(long dividend, long divisor) {return java.lang.Long.remainderUnsigned(dividend,divisor);}
    public static long rotateLeft(long i, int distance) {
        return (i << distance) | (i >>> -distance);
    }
    public static long rotateRight(long i, int distance) {
        return (i >>> distance) | (i << -distance);
    }

    public static long highestOneBit(long i) {return java.lang.Long.highestOneBit(i);}
    public static long lowestOneBit(long i) {return java.lang.Long.lowestOneBit(i);}
    public static int numberOfLeadingZeros(long i) {return java.lang.Long.numberOfLeadingZeros(i);}
    public static int numberOfTrailingZeros(long i) {return java.lang.Long.numberOfTrailingZeros(i);}
    public static int bitCount(long i) {return java.lang.Long.bitCount(i);}

    public static long reverse(long i) {return java.lang.Long.reverse(i);}
    public static int signum(long i) { return (int) ((i >> 63) | (-i >>> 63)); }
    public static long reverseBytes(long i) {return java.lang.Long.reverseBytes(i);}
    public static long sum(long a, long b) {
        return a + b;
    }
    public static long max(long a, long b) {
        return Math.max(a, b);
    }
    public static long min(long a, long b) {
        return Math.min(a, b);
    }
}
