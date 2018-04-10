package language.data.number;

//import jdk.internal.math.FloatingDecimal;

import java.lang.Byte;
import java.lang.Number;

/**
 * @see java.lang.Double
 */

public /* final */ class Double extends Number implements Comparable<Double>
{
    public static final double POSITIVE_INFINITY = 1.0 / 0.0;
    public static final double NEGATIVE_INFINITY = -1.0 / 0.0;
    public static final double NaN = 0.0d / 0.0;
    public static final double MAX_VALUE = 0x1.fffffffffffffP+1023; // 1.7976931348623157e+308
    public static final double MIN_NORMAL = 0x1.0p-1022; // 2.2250738585072014E-308
    public static final double MIN_VALUE = 0x0.0000000000001P-1022; // 4.9e-324
    public static final int MAX_EXPONENT = 1023;
    public static final int MIN_EXPONENT = -1022;
    public static final int SIZE = 64;
    public static final int BYTES = SIZE / Byte.SIZE;
    private static final long serialVersionUID = -9172774392245257468L;
    // public static final Class<Double>   TYPE = (Class<Double>) Class.getPrimitiveClass("double");
    private final double value;

    public Double(double value) {
        this.value = value;
    }
    public Double(String s) throws NumberFormatException { value = parseDouble(s); }

    public String toString() {
        return toString(value);
    }
    public static String toString(double d) {
        return java.lang.Double.toString(d);
    }
    public static String toHexString(double d) {return java.lang.Double.toHexString(d);}
    public static java.lang.Double valueOf(String s) throws NumberFormatException { return new java.lang.Double(parseDouble(s)); }
    public static Double valueOf(double d) {
        return new Double(d);
    }

    public static double parseDouble(String s) throws NumberFormatException { return java.lang.Double.parseDouble(s); }

    public boolean isNaN() {
        return isNaN(value);
    }
    public static boolean isNaN(double v) { return (v != v); }
    public boolean isInfinite() {
        return isInfinite(value);
    }
    public static boolean isInfinite(double v) {
        return (v == POSITIVE_INFINITY) || (v == NEGATIVE_INFINITY);
    }
    public static boolean isFinite(double d) {
        return Math.abs(d) <= java.lang.Double.MAX_VALUE;
    }

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
        return (long)value;
    }
    public float floatValue() {
        return (float)value;
    }
    public double doubleValue() {
        return value;
    }

    public int hashCode() {
        return java.lang.Double.hashCode(value);
    }
    public static int hashCode(double value) { long bits = doubleToLongBits(value); return (int)(bits ^ (bits >>> 32)); }

    public boolean equals(Object obj) { return (obj instanceof Double) && (doubleToLongBits(((Double)obj).value) == doubleToLongBits(value)); }
    public static long doubleToLongBits(double value) { if (!isNaN(value)) { return doubleToRawLongBits(value); } return 0x7ff8000000000000L; }
    public static native long doubleToRawLongBits(double value);
    public static native double longBitsToDouble(long bits);

    public int compareTo(Double anotherDouble) {
        return Double.compare(value, anotherDouble.value);
    }
    public static int compare(double d1, double d2) {return java.lang.Double.compare(d1,d2);}

    public static double sum(double a, double b) {
        return a + b;
    }
    public static double max(double a, double b) {
        return Math.max(a, b);
    }
    public static double min(double a, double b) {
        return Math.min(a, b);
    }

}
