package language.util.math;

import java.lang.StrictMath;

/**
 * he class {@code Math} contains methods for performing basic
 * numeric operations such as the elementary exponential, logarithm,
 * square root, and trigonometric functions.
 *
 * @see java.lang.Math
 */
public class Math // extends java.lang.Math
{
    public static final double E = 2.7182818284590452354;
    public static final double PI = 3.14159265358979323846;
    private static final double DEGREES_TO_RADIANS = 0.017453292519943295;
    private static final double RADIANS_TO_DEGREES = 57.29577951308232;

    private Math() {}

    public static double sin(double a) {
        return StrictMath.sin(a); // default impl. delegates to StrictMath
    }
    public static double cos(double a) {
        return StrictMath.cos(a); // default impl. delegates to StrictMath
    }
    public static double tan(double a) {
        return StrictMath.tan(a); // default impl. delegates to StrictMath
    }
    public static double asin(double a) {
        return StrictMath.asin(a); // default impl. delegates to StrictMath
    }
    public static double acos(double a) {
        return StrictMath.acos(a); // default impl. delegates to StrictMath
    }
    public static double atan(double a) {
        return StrictMath.atan(a); // default impl. delegates to StrictMath
    }
    public static double sinh(double x) {
        return StrictMath.sinh(x);
    }
    public static double cosh(double x) {
        return StrictMath.cosh(x);
    }
    public static double tanh(double x) {
        return StrictMath.tanh(x);
    }
    public static double toRadians(double angdeg) {
        return angdeg * DEGREES_TO_RADIANS;
    }
    public static double toDegrees(double angrad) {
        return angrad * RADIANS_TO_DEGREES;
    }

    public static double exp(double a) {
        return StrictMath.exp(a); // default impl. delegates to StrictMath
    }
    public static double log(double a) {
        return StrictMath.log(a); // default impl. delegates to StrictMath
    }
    public static double log10(double a) {
        return StrictMath.log10(a); // default impl. delegates to StrictMath
    }
    public static double sqrt(double a) { return StrictMath.sqrt(a);}
    public static double cbrt(double a) {
        return StrictMath.cbrt(a);
    }
    public static double IEEEremainder(double f1, double f2) {
        return StrictMath.IEEEremainder(f1, f2); // delegate to StrictMath
    }
    public static double ceil(double a) {
        return StrictMath.ceil(a); // default impl. delegates to StrictMath
    }
    public static double floor(double a) {
        return StrictMath.floor(a); // default impl. delegates to StrictMath
    }
    public static double rint(double a) {
        return StrictMath.rint(a); // default impl. delegates to StrictMath
    }
    public static double atan2(double y, double x) { return StrictMath.atan2(y, x); } // default impl. delegates to StrictMath
    public static double pow(double a, double b) { return StrictMath.pow(a, b); }// default impl. delegates to StrictMath
    public static int round(float a) {return java.lang.Math.round(a);}
    public static long round(double a) {return java.lang.Math.round(a);}
    public static double random() {return java.lang.Math.random();}
    public static int addExact(int x, int y) {return java.lang.Math.addExact(x,y);}
    public static long addExact(long x, long y) {return java.lang.Math.addExact(x,y);}
    public static int subtractExact(int x, int y) {return java.lang.Math.addExact(x,y);}
    public static long subtractExact(long x, long y) {return java.lang.Math.addExact(x,y);}
    public static int multiplyExact(int x, int y) {return java.lang.Math.multiplyExact(x,y);}
    public static long multiplyExact(long x, int y) {
        return multiplyExact(x, (long)y);
    }
    public static long multiplyExact(long x, long y) {return java.lang.Math.multiplyExact(x,y);}
    public static int incrementExact(int a) {return java.lang.Math.incrementExact(a);}
    public static long incrementExact(long a) {return java.lang.Math.incrementExact(a);}
    public static int decrementExact(int a) {return java.lang.Math.decrementExact(a);}
    public static long decrementExact(long a) {return java.lang.Math.decrementExact(a);}
    public static int negateExact(int a) {return java.lang.Math.negateExact(a);}
    public static long negateExact(long a) {return java.lang.Math.negateExact(a);}
    public static int toIntExact(long value) {return java.lang.Math.toIntExact(value);}
    public static long multiplyFull(int x, int y) {
        return (long)x * (long)y;
    }
    public static long multiplyHigh(long x, long y) {return java.lang.Math.multiplyHigh(x,y);}
    public static double hypot(double x, double y) {
        return StrictMath.hypot(x, y);
    }
    public static double expm1(double x) {
        return StrictMath.expm1(x);
    }
    public static double log1p(double x) {
        return StrictMath.log1p(x);
    }
    public static int getExponent(float f) {return java.lang.Math.getExponent(f);}
    public static int getExponent(double f) {return java.lang.Math.getExponent(f);}

    public static int floorDiv(int x, int y) {return java.lang.Math.floorDiv(x,y);}
    public static long floorDiv(long x, int y) {
        return floorDiv(x, (long)y);
    }
    public static long floorDiv(long x, long y) {return java.lang.Math.floorDiv(x,y);}
    public static int floorMod(int x, int y) {
        return x - floorDiv(x, y) * y;
    }
    public static int floorMod(long x, int y) { return (int)(x - floorDiv(x, y) * y); }
    public static long floorMod(long x, long y) {
        return x - floorDiv(x, y) * y;
    }

    public static double copySign(double magnitude, double sign) {return java.lang.Math.copySign(magnitude,sign);}
    public static float copySign(float magnitude, float sign) {return java.lang.Math.copySign(magnitude,sign);}
    public static int abs(int a) {
        return (a < 0) ? -a : a;
    }
    public static long abs(long a) {
        return (a < 0) ? -a : a;
    }
    public static float abs(float a) {
        return (a <= 0.0F) ? 0.0F - a : a;
    }
    public static double abs(double a) {
        return (a <= 0.0D) ? 0.0D - a : a;
    }
    public static int max(int a, int b) {
        return (a >= b) ? a : b;
    }
    public static long max(long a, long b) {
        return (a >= b) ? a : b;
    }
    public static float max(float a, float b) {return java.lang.Math.max(a,b);}
    public static double max(double a, double b) {return java.lang.Math.max(a,b);}
    public static int min(int a, int b) {
        return (a <= b) ? a : b;
    }
    public static long min(long a, long b) {
        return (a <= b) ? a : b;
    }
    public static float min(float a, float b) {return java.lang.Math.min(a,b);}
    public static double min(double a, double b) {return java.lang.Math.min(a,b);}
    public static double fma(double a, double b, double c) {return java.lang.Math.fma(a,b,c);}
    public static float fma(float a, float b, float c) {return java.lang.Math.fma(a,b,c);}
    public static double nextAfter(double start, double direction) {return java.lang.Math.nextAfter(start,direction);}
    public static float nextAfter(float start, float direction) {return java.lang.Math.nextAfter(start,direction);}
    public static double nextUp(double d) {return java.lang.Math.nextUp(d);}
    public static float nextUp(float d) {return java.lang.Math.nextUp(d);}
    public static double nextDown(double d) {return java.lang.Math.nextDown(d);}
    public static float nextDown(float d) {return java.lang.Math.nextDown(d);}

    public static double ulp(double d) {return java.lang.Math.ulp(d);}
    public static float ulp(float d) {return java.lang.Math.ulp(d);}
    public static double signum(double d) {
        return java.lang.Math.signum(d);
    }
    public static float signum(float d) { return java.lang.Math.signum(d); }

    public static double scalb(double d, int scaleFactor) {return java.lang.Math.scalb(d,scaleFactor);}
    public static float scalb(float f, int scaleFactor) {return java.lang.Math.scalb(f,scaleFactor);}
}
