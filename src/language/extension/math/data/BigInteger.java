package language.extension.math.data;

import java.util.Random;

/**
 * Immutable arbitrary-precision integers.
 *
 * @see java.math.BigInteger
 */

public class BigInteger extends java.math.BigInteger implements Comparable<java.math.BigInteger>
{
    static final long LONG_MASK = 0xffffffffL;

    // final int signum;// The signum of this BigInteger
    // final int[] mag;// he magnitude of this BigInteger
    public static final java.math.BigInteger ZERO = java.math.BigInteger.ZERO;
    public static final java.math.BigInteger ONE = valueOf(1);
    public static final java.math.BigInteger TWO = valueOf(2);
    public static final java.math.BigInteger TEN = valueOf(10);

    public BigInteger(byte[] val, int off, int len) { super(val, off, len); }
    public BigInteger(byte[] val) { super(val);}
    public BigInteger(int signum, byte[] magnitude, int off, int len) { super(signum, magnitude, off, len); }
    public BigInteger(int signum, byte[] magnitude) { super(signum, magnitude); }
    public BigInteger(String val, int radix) { super(val, radix); }
    public BigInteger(String val) { super(val); }
    public BigInteger(int numBits, Random rnd) { super(numBits, rnd); }
    public BigInteger(int bitLength, int certainty, Random rnd) { super(bitLength, certainty, rnd); }

    public static java.math.BigInteger probablePrime(int bitLength, Random rnd) { return java.math.BigInteger.probablePrime(bitLength,rnd); }
    public java.math.BigInteger nextProbablePrime() {return super.nextProbablePrime();}
    public static java.math.BigInteger valueOf(long val) {return java.math.BigInteger.valueOf(val);}
    public java.math.BigInteger add(java.math.BigInteger val) {return super.add(val);}
    public java.math.BigInteger subtract(java.math.BigInteger val) {return super.subtract(val);}
    public java.math.BigInteger multiply(java.math.BigInteger val) {return super.multiply(val);}
    public java.math.BigInteger divide(java.math.BigInteger val) {return super.divide(val);}
    public java.math.BigInteger[] divideAndRemainder(java.math.BigInteger val) {return super.divideAndRemainder(val);}
    public java.math.BigInteger remainder(java.math.BigInteger val) {return super.remainder(val);}
    public java.math.BigInteger pow(int exponent) {return super.pow(exponent);}
    public java.math.BigInteger sqrt() {return super.sqrt();}
    public java.math.BigInteger[] sqrtAndRemainder() {return super.sqrtAndRemainder();}
    public java.math.BigInteger gcd(java.math.BigInteger val) {return super.gcd(val);}
    public java.math.BigInteger abs() { return super.abs(); }
    public java.math.BigInteger negate() { return super.negate(); }
    public int signum() {
        return super.signum();
    }
    public java.math.BigInteger mod(java.math.BigInteger m) {return super.mod(m);}
    public java.math.BigInteger modPow(java.math.BigInteger exponent, java.math.BigInteger m) {return super.modPow(exponent,m);}
    public java.math.BigInteger modInverse(java.math.BigInteger m) {return super.modInverse(m);}
    public java.math.BigInteger shiftLeft(int n) {return super.shiftLeft(n);}
    public java.math.BigInteger shiftRight(int n) {return super.shiftRight(n);}
    public java.math.BigInteger and(java.math.BigInteger val) {return super.and(val);}
    public java.math.BigInteger or(java.math.BigInteger val) {return super.or(val);}
    public java.math.BigInteger xor(java.math.BigInteger val) {return super.xor(val);}
    public java.math.BigInteger not() {return super.not();}
    public java.math.BigInteger andNot(java.math.BigInteger val) {return super.andNot(val);}
    public boolean testBit(int n) {return super.testBit(n);}
    public java.math.BigInteger setBit(int n) {return super.setBit(n);}
    public java.math.BigInteger clearBit(int n) {return super.clearBit(n);}
    public java.math.BigInteger flipBit(int n) {return super.flipBit(n);}
    public int getLowestSetBit() {return super.getLowestSetBit();}
    public int bitLength() {return super.bitLength();}
    public int bitCount() {return super.bitCount();}
    public boolean isProbablePrime(int certainty) {return super.isProbablePrime(certainty);}
    public int compareTo(java.math.BigInteger val) {return super.compareTo(val);}
    public boolean equals(Object x) {return super.equals(x);}
    public java.math.BigInteger min(java.math.BigInteger val) { return (compareTo(val) < 0 ? this : val); }
    public java.math.BigInteger max(java.math.BigInteger val) { return (compareTo(val) > 0 ? this : val); }
    public int hashCode() {return super.hashCode();}
    public String toString(int radix) {return super.toString(radix);}
    public String toString() {
        return toString(10);
    }
    public byte[] toByteArray() {return super.toByteArray();}
    public int intValue() {return super.intValue();}
    public long longValue() {return super.intValue();}
    public float floatValue() {return super.floatValue();}
    public double doubleValue() {return super.doubleValue();}
    public long longValueExact() {return super.longValueExact();}
    public int intValueExact() {return super.intValueExact();}
    public short shortValueExact() {return super.shortValueExact();}
    public byte byteValueExact() {return super.byteValueExact();}
}
