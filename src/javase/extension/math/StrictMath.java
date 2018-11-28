package javase.extension.math;

import java.lang.Math;

/**
 * The class {@code StrictMath} contains methods for performing basic
 * numeric operations such as the elementary exponential, logarithm,
 * square root, and trigonometric functions.
 *
 * @see java.lang.StrictMath
 */

public class StrictMath
{
    public static final double E = 2.7182818284590452354;
    public static final double PI = 3.14159265358979323846;
    private static final double DEGREES_TO_RADIANS = 0.017453292519943295;
    private static final double RADIANS_TO_DEGREES = 57.29577951308232;

    private StrictMath() {}

    // 三角函数
    public static native double sin(double a);
    public static native double cos(double a);
    public static native double tan(double a);
    public static native double asin(double a);
    public static native double acos(double a);
    public static native double atan(double a);
    public static native double sinh(double x);
    public static native double cosh(double x);
    public static native double tanh(double x);
    // 弧 度
    public static strictfp double toRadians(double angdeg) {return java.lang.StrictMath.toRadians(angdeg);}
    public static strictfp double toDegrees(double angrad) {return java.lang.StrictMath.toRadians(angrad);}
    // 指数 对数 开方
    public static double exp(double a) {
        return java.lang.StrictMath.exp(a);
    }
    public static native double log(double a);
    public static native double log10(double a);
    public static native double sqrt(double a);
    public static double cbrt(double a) { return java.lang.StrictMath.cbrt(a); }
    public static double pow(double a, double b) {
        return java.lang.StrictMath.pow(a,b);
    }
    public static double hypot(double x, double y) {
        return java.lang.StrictMath.pow(x, y);
    }
    //
    public static native double IEEEremainder(double f1, double f2);
    public static double ceil(double a) {return java.lang.StrictMath.ceil(a);}
    public static double floor(double a) {return java.lang.StrictMath.floor(a);}
    public static double rint(double a) {return java.lang.StrictMath.rint(a);}
    public static native double atan2(double y, double x);
    public static int round(float a) {
        return Math.round(a);
    }
    public static long round(double a) { return Math.round(a); }
    //
    public static double random() { return java.lang.StrictMath.random(); }
   // 运算
    public static int addExact(int x, int y) {
        return Math.addExact(x, y);
    }
    public static long addExact(long x, long y) {
        return Math.addExact(x, y);
    }
    public static int subtractExact(int x, int y) {
        return Math.subtractExact(x, y);
    }
    public static long subtractExact(long x, long y) {
        return Math.subtractExact(x, y);
    }
    public static int multiplyExact(int x, int y) {
        return Math.multiplyExact(x, y);
    }
    public static long multiplyExact(long x, int y) {
        return Math.multiplyExact(x, y);
    }
    public static long multiplyExact(long x, long y) {
        return Math.multiplyExact(x, y);
    }
    public static int toIntExact(long value) {
        return Math.toIntExact(value);
    }
    public static long multiplyFull(int x, int y) {
        return Math.multiplyFull(x, y);
    }
    public static long multiplyHigh(long x, long y) {
        return Math.multiplyHigh(x, y);
    }
    public static int floorDiv(int x, int y) {
        return Math.floorDiv(x, y);
    }
    public static long floorDiv(long x, int y) {
        return Math.floorDiv(x, y);
    }
    public static long floorDiv(long x, long y) {
        return Math.floorDiv(x, y);
    }
    public static int floorMod(int x, int y) {
        return Math.floorMod(x , y);
    }
    public static int floorMod(long x, int y) {
        return Math.floorMod(x , y);
    }
    public static long floorMod(long x, long y) {
        return Math.floorMod(x, y);
    }
    public static int abs(int a) {
        return Math.abs(a);
    }
    public static long abs(long a) {
        return Math.abs(a);
    }
    public static float abs(float a) { return Math.abs(a); }
    public static double abs(double a) {
        return Math.abs(a);
    }
    public static int max(int a, int b) {
        return Math.max(a, b);
    }
    public static long max(long a, long b) {
        return Math.max(a, b);
    }
    public static float max(float a, float b) {
        return Math.max(a, b);
    }
    public static double max(double a, double b) {
        return Math.max(a, b);
    }
    public static int min(int a, int b) {
        return Math.min(a, b);
    }
    public static long min(long a, long b) {
        return Math.min(a, b);
    }
    public static float min(float a, float b) {
        return Math.min(a, b);
    }
    public static double min(double a, double b) {
        return Math.min(a, b);
    }
    public static double fma(double a, double b, double c) {
        return Math.fma(a, b, c);
    }
    public static float fma(float a, float b, float c) {
        return Math.fma(a, b, c);
    }
    //
    public static double ulp(double d) {
        return Math.ulp(d);
    }
    public static float ulp(float f) {
        return Math.ulp(f);
    }
    public static double signum(double d) {
        return Math.signum(d);
    }
    public static float signum(float f) {
        return Math.signum(f);
    }

    public static native double expm1(double x);
    public static native double log1p(double x);
    public static double copySign(double magnitude, double sign){return Math.copySign(magnitude, (Double.isNaN(sign)?1.0d:sign));}
    public static float copySign(float magnitude, float sign) { return Math.copySign(magnitude, (Float.isNaN(sign)?1.0f:sign)); }
    public static int getExponent(float f) {
        return Math.getExponent(f);
    }
    public static int getExponent(double d) {
        return Math.getExponent(d);
    }
    public static double nextAfter(double start, double direction) {
        return Math.nextAfter(start, direction);
    }
    public static float nextAfter(float start, double direction) {
        return Math.nextAfter(start, direction);
    }
    public static double nextUp(double d) {
        return Math.nextUp(d);
    }
    public static float nextUp(float f) {
        return Math.nextUp(f);
    }
    public static double nextDown(double d) {
        return Math.nextDown(d);
    }
    public static float nextDown(float f) {
        return Math.nextDown(f);
    }
    public static double scalb(double d, int scaleFactor) {
        return Math.scalb(d, scaleFactor);
    }
    public static float scalb(float f, int scaleFactor) {
        return Math.scalb(f, scaleFactor);
    }

    public static void main(String[] args)
    {
        System.out.println(java.lang.StrictMath.random());
        System.out.println(java.lang.StrictMath.subtractExact(1,2));
    }
}
