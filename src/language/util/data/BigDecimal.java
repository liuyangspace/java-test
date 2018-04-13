package language.util.data;

import java.math.BigInteger;
import java.math.MathContext;
import java.math.RoundingMode;

/**
 * Immutable, arbitrary-precision signed decimal numbers.
 *
 * @see java.math.BigDecimal
 */

public class BigDecimal extends java.math.BigDecimal implements Comparable<java.math.BigDecimal>
{
    public static final java.math.BigDecimal ZERO = java.math.BigDecimal.ZERO;
    public static final java.math.BigDecimal ONE = java.math.BigDecimal.ONE;
    public static final java.math.BigDecimal TEN = java.math.BigDecimal.TEN;
    public static final int ROUND_UP =           0;
    public static final int ROUND_DOWN =         1;
    public static final int ROUND_CEILING =      2;
    public static final int ROUND_FLOOR =        3;
    public static final int ROUND_HALF_UP =      4;
    public static final int ROUND_HALF_DOWN =    5;
    public static final int ROUND_HALF_EVEN =    6;
    public static final int ROUND_UNNECESSARY =  7;


    public BigDecimal(char[] in, int offset, int len) { super(in, offset, len); }
    public BigDecimal(char[] in, int offset, int len, MathContext mc) { super(in, offset, len, mc); }
    public BigDecimal(char[] in) { super(in); }
    public BigDecimal(char[] in, MathContext mc) { super(in, mc); }
    public BigDecimal(String val) { super(val); }
    public BigDecimal(String val, MathContext mc) { super(val, mc); }
    public BigDecimal(double val) { super(val); }
    public BigDecimal(double val, MathContext mc) { super(val, mc); }
    public BigDecimal(BigInteger val) { super(val); }
    public BigDecimal(BigInteger val, MathContext mc) { super(val, mc); }
    public BigDecimal(BigInteger unscaledVal, int scale) { super(unscaledVal, scale); }
    public BigDecimal(BigInteger unscaledVal, int scale, MathContext mc) { super(unscaledVal, scale, mc); }
    public BigDecimal(int val) { super(val); }
    public BigDecimal(int val, MathContext mc) { super(val, mc); }
    public BigDecimal(long val) { super(val); }
    public BigDecimal(long val, MathContext mc) { super(val, mc); }

    public static java.math.BigDecimal valueOf(long unscaledVal, int scale) {return java.math.BigDecimal.valueOf(unscaledVal,scale);}
    public static java.math.BigDecimal valueOf(long val) {return java.math.BigDecimal.valueOf(val);}
    public static java.math.BigDecimal valueOf(double val) {return java.math.BigDecimal.valueOf(val);}

    public String toString() {return super.toString();}
    public String toEngineeringString() {
        return super.toEngineeringString();
    }
    public String toPlainString() {return super.toPlainString();}
    public BigInteger toBigInteger() {return super.toBigInteger();}
    public BigInteger toBigIntegerExact() {return super.toBigIntegerExact();}
    public long longValue(){return super.longValue();}
    public long longValueExact(){return super.longValueExact();}
    public int intValue() {return super.intValue();}
    public int intValueExact() {return super.intValueExact();}
    public short shortValueExact() {return super.shortValueExact();}
    public byte byteValueExact() {return super.byteValueExact();}
    public float floatValue(){return super.floatValue();}
    public double doubleValue(){return super.doubleValue();}

    public java.math.BigDecimal add(java.math.BigDecimal augend) {return super.add(augend);}
    public java.math.BigDecimal add(java.math.BigDecimal augend, MathContext mc) {return super.add(augend,mc);}
    public java.math.BigDecimal subtract(java.math.BigDecimal subtrahend) {return super.subtract(subtrahend);}
    public java.math.BigDecimal subtract(java.math.BigDecimal subtrahend, MathContext mc) {return super.subtract(subtrahend,mc);}
    public java.math.BigDecimal multiply(java.math.BigDecimal multiplicand) {return super.multiply(multiplicand);}
    public java.math.BigDecimal multiply(java.math.BigDecimal multiplicand, MathContext mc) {return super.multiply(multiplicand,mc);}
    public java.math.BigDecimal divide(java.math.BigDecimal divisor, int scale, int roundingMode) {return super.divide(divisor,scale,roundingMode);}
    public java.math.BigDecimal divide(java.math.BigDecimal divisor, int scale, RoundingMode roundingMode) {return super.divide(divisor,scale,roundingMode);}
    public java.math.BigDecimal divide(java.math.BigDecimal divisor, int roundingMode) { return super.divide(divisor,roundingMode); }
    public java.math.BigDecimal divide(java.math.BigDecimal divisor, RoundingMode roundingMode) { return super.divide(divisor,roundingMode); }
    public java.math.BigDecimal divide(java.math.BigDecimal divisor) {return super.divide(divisor);}
    public java.math.BigDecimal divide(java.math.BigDecimal divisor, MathContext mc) {return super.divide(divisor,mc);}
    public java.math.BigDecimal divideToIntegralValue(java.math.BigDecimal divisor) {return super.divideToIntegralValue(divisor);}
    public java.math.BigDecimal divideToIntegralValue(java.math.BigDecimal divisor, MathContext mc) {return super.divideToIntegralValue(divisor,mc);}
    public java.math.BigDecimal remainder(java.math.BigDecimal divisor) {return super.remainder(divisor);}
    public java.math.BigDecimal remainder(java.math.BigDecimal divisor, MathContext mc) {return super.remainder(divisor,mc);}
    public java.math.BigDecimal[] divideAndRemainder(java.math.BigDecimal divisor) {return super.divideAndRemainder(divisor);}
    public java.math.BigDecimal[] divideAndRemainder(java.math.BigDecimal divisor, MathContext mc) {return super.divideAndRemainder(divisor,mc);}
    public java.math.BigDecimal sqrt(MathContext mc) {return super.sqrt(mc);}
    public java.math.BigDecimal pow(int n) {return super.pow(n);}
    public java.math.BigDecimal pow(int n, MathContext mc) {return super.pow(n,mc);}
    public java.math.BigDecimal abs() { return (signum() < 0 ? negate() : this); }
    public java.math.BigDecimal abs(MathContext mc) { return (signum() < 0 ? negate(mc) : plus(mc)); }
    public java.math.BigDecimal negate() {return super.negate();}
    public java.math.BigDecimal negate(MathContext mc) { return negate().plus(mc); }
    public java.math.BigDecimal plus() { return this; }
    public java.math.BigDecimal plus(MathContext mc) {return super.plus(mc);}

    public int signum() {return super.signum();}
    public int scale() {
        return super.scale();
    }
    public int precision() {return super.precision();}
    public BigInteger unscaledValue() {
        return super.unscaledValue();
    }
    public java.math.BigDecimal round(MathContext mc) { return plus(mc); }
    public java.math.BigDecimal setScale(int newScale, RoundingMode roundingMode) {return super.setScale(newScale,roundingMode);}
    public java.math.BigDecimal setScale(int newScale, int roundingMode) {return super.setScale(newScale,roundingMode);}
    public java.math.BigDecimal setScale(int newScale) { return setScale(newScale, ROUND_UNNECESSARY); }
    public java.math.BigDecimal movePointLeft(int n) {return super.movePointLeft(n);}
    public java.math.BigDecimal movePointRight(int n) {return super.movePointRight(n);}
    public java.math.BigDecimal scaleByPowerOfTen(int n) {return super.scaleByPowerOfTen(n);}
    public java.math.BigDecimal stripTrailingZeros() {return super.stripTrailingZeros();}

    public int compareTo(java.math.BigDecimal val) {return super.compareTo(val);}
    public boolean equals(Object x) {return super.equals(x);}
    public java.math.BigDecimal min(java.math.BigDecimal val) { return (compareTo(val) <= 0 ? this : val); }
    public java.math.BigDecimal max(java.math.BigDecimal val) { return (compareTo(val) >= 0 ? this : val); }
    public int hashCode() {return super.hashCode();}

    public java.math.BigDecimal ulp(){return super.ulp();}//数字和距其最近的数字之间的距离
}
