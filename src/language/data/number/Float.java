package language.data.number;

//import jdk.internal.math.FloatingDecimal;

import java.lang.Byte;
import java.lang.Number;

/**
 * @see java.lang.Float
 */

public /* final */ class Float extends Number implements Comparable<Float>
{
    public static final float POSITIVE_INFINITY = 1.0f / 0.0f;
    public static final float NEGATIVE_INFINITY = -1.0f / 0.0f;
    public static final float NaN = 0.0f / 0.0f;
    public static final float MAX_VALUE = 0x1.fffffeP+127f; // 3.4028235e+38f
    public static final float MIN_NORMAL = 0x1.0p-126f; // 1.17549435E-38f
    public static final float MIN_VALUE = 0x0.000002P-126f; // 1.4e-45f
    public static final int MAX_EXPONENT = 127;
    public static final int MIN_EXPONENT = -126;
    public static final int SIZE = 32;
    public static final int BYTES = SIZE / Byte.SIZE;
    // public static final Class<Float> TYPE = (Class<Float>) Class.getPrimitiveClass("float");
    private static final long serialVersionUID = -2671257302660747028L;
    private final float value;

    public Float(float value) {
        this.value = value;
    }
    public Float(double value) {
        this.value = (float)value;
    }
    public Float(String s) throws NumberFormatException { value = parseFloat(s); }

    public String toString() {
        return java.lang.Float.toString(value);
    }
    public static String toString(float f) {
        return java.lang.Float.toString(f);
    }
    public static String toHexString(float f) { return java.lang.Float.toHexString(f); }

    public static java.lang.Float valueOf(String s) throws NumberFormatException { return new java.lang.Float(parseFloat(s)); }
    public static java.lang.Float valueOf(float f) {
        return new java.lang.Float(f);
    }
    public static float parseFloat(String s) throws NumberFormatException { return java.lang.Float.parseFloat(s); }

    public boolean isNaN() {
        return isNaN(value);
    }
    public static boolean isNaN(float v) {
        return (v != v);
    }
    public boolean isInfinite() {
        return isInfinite(value);
    }
    public static boolean isInfinite(float v) {
        return (v == POSITIVE_INFINITY) || (v == NEGATIVE_INFINITY);
    }
    public static boolean isFinite(float f) {
        return Math.abs(f) <= java.lang.Float.MAX_VALUE;
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
        return value;
    }
    public double doubleValue() {
        return (double)value;
    }

    public static int floatToIntBits(float value) { if (!isNaN(value)) { return floatToRawIntBits(value); } return 0x7fc00000; }
    public static native int floatToRawIntBits(float value);
    public static native float intBitsToFloat(int bits);

    public int hashCode() {
        return Float.hashCode(value);
    }
    public static int hashCode(float value) {
        return floatToIntBits(value);
    }

    public boolean equals(Object obj) { return (obj instanceof Float) && (floatToIntBits(((Float)obj).value) == floatToIntBits(value)); }
    public int compareTo(Float anotherFloat) {
        return Float.compare(value, anotherFloat.value);
    }
    public static int compare(float f1, float f2) {return java.lang.Float.compare(f1,f2);}

    public static float sum(float a, float b) {
        return a + b;
    }
    public static float max(float a, float b) {
        return Math.max(a, b);
    }
    public static float min(float a, float b) {
        return Math.min(a, b);
    }
}
