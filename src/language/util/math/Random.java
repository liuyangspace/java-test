package language.util.math;

import java.util.concurrent.atomic.AtomicLong;
import java.util.stream.DoubleStream;
import java.util.stream.IntStream;
import java.util.stream.LongStream;

/**
 * An instance of this class is used to generate a stream of pseudorandom numbers.
 *
 * @see java.util.Random
 */
public class Random extends java.util.Random implements java.io.Serializable
{
    static final long serialVersionUID = 3905348978240129619L;
    // private final AtomicLong seed;
    // private static final long multiplier = 0x5DEECE66DL;
    // private static final long addend = 0xBL;
    // private static final long mask = (1L << 48) - 1;
    // private static final double DOUBLE_UNIT = 0x1.0p-53; // 1.0 / (1L << 53)

    // IllegalArgumentException messages
    static final String BadBound = "bound must be positive";
    static final String BadRange = "bound must be greater than origin";
    static final String BadSize  = "size must be non-negative";

    public Random() { super(); }
    public Random(long seed) {super(seed);}
    public synchronized void setSeed(long seed) {setSeed(seed);}
    protected int next(int bits) {return super.next(bits);}//  如果用相同的种子创建两个 Random 实例，则对每个实例进行相同的方法调用序列，它们将生成并返 回相同的数字序列。
    public void nextBytes(byte[] bytes) { super.nextBytes(bytes);}
    public int nextInt() {
        return next(32);
    }// 随机范围 0 ~ 2^32-1
    public int nextInt(int bound) {return nextInt(bound);}//随机范围 0 ~ bound-1
    public long nextLong() {return nextLong();}
    public boolean nextBoolean() {
        return next(1) != 0;
    }
    public float nextFloat() {
        return next(24) / ((float)(1 << 24));
    }
    public double nextDouble() {
        return super.nextDouble();
    }
    public synchronized double nextGaussian() {return nextGaussian();}
    public IntStream ints(long streamSize) {return super.ints(streamSize);}
    public IntStream ints() {return super.ints();}
    public IntStream ints(long streamSize, int randomNumberOrigin, int randomNumberBound) {return super.ints(streamSize,randomNumberOrigin,randomNumberBound);}//随机 streamSize 个 randomNumberOrigin ~ randomNumberBound-1 的数
    public IntStream ints(int randomNumberOrigin, int randomNumberBound) {return super.ints(randomNumberOrigin,randomNumberBound);}//随机范围 randomNumberOrigin ~ randomNumberBound-1
    public LongStream longs(long streamSize) {return super.longs(streamSize);}
    public LongStream longs() {return super.longs();}
    public LongStream longs(long streamSize, long randomNumberOrigin, long randomNumberBound) {return super.longs(streamSize,randomNumberOrigin,randomNumberBound);}
    public LongStream longs(long randomNumberOrigin, long randomNumberBound) {return super.longs(randomNumberOrigin,randomNumberBound);}
    public DoubleStream doubles(long streamSize) {return super.doubles(streamSize);}
    public DoubleStream doubles() {return super.doubles();}
    public DoubleStream doubles(long streamSize, double randomNumberOrigin, double randomNumberBound) {return super.doubles(streamSize,randomNumberOrigin,randomNumberBound);}
    public DoubleStream doubles(double randomNumberOrigin, double randomNumberBound) {return super.doubles(randomNumberOrigin,randomNumberBound);}

}
