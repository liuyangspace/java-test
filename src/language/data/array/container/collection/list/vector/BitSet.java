package language.data.array.container.collection.list.vector;

import java.nio.ByteBuffer;
import java.nio.LongBuffer;
import java.util.stream.IntStream;

/**
 * This class implements a vector of bits that grows as needed.
 *
 * @see java.util.BitSet
 *
 */
public class BitSet extends java.util.BitSet implements Cloneable, java.io.Serializable {

    public BitSet() {super();}
    public BitSet(int nbits) {super(nbits);}

    public static java.util.BitSet valueOf(long[] longs) {return java.util.BitSet.valueOf(longs);}
    public static java.util.BitSet valueOf(LongBuffer lb) {return java.util.BitSet.valueOf(lb);}
    public static java.util.BitSet valueOf(byte[] bytes) {return java.util.BitSet.valueOf(bytes);}
    public static java.util.BitSet valueOf(ByteBuffer bb) {return java.util.BitSet.valueOf(bb);}

    public byte[] toByteArray() {return super.toByteArray();}
    public long[] toLongArray() {return super.toLongArray();}
    public void flip(int bitIndex) {super.flip(bitIndex);}
    public void flip(int fromIndex, int toIndex) {super.flip(fromIndex,toIndex);}
    public void set(int bitIndex) {super.set(bitIndex);}
    public void set(int bitIndex, boolean value) {super.set(bitIndex,value);}
    public void set(int fromIndex, int toIndex) {super.set(fromIndex,toIndex);}
    public void set(int fromIndex, int toIndex, boolean value) {super.set(fromIndex,toIndex,value);}
    public void clear(int bitIndex) {super.clear(bitIndex);}
    public void clear(int fromIndex, int toIndex) {super.clear(fromIndex,toIndex);}
    public void clear(){super.clear();}
    public boolean get(int bitIndex) {return super.get(bitIndex);}
    public java.util.BitSet get(int fromIndex, int toIndex) {return super.get(fromIndex,toIndex);}
    public int nextSetBit(int fromIndex) {return super.nextSetBit(fromIndex);}
    public int nextClearBit(int fromIndex) {return super.nextClearBit(fromIndex);}
    public int previousSetBit(int fromIndex) {return super.previousSetBit(fromIndex);}
    public int previousClearBit(int fromIndex) {return super.previousClearBit(fromIndex);}

    public int length() {return super.length();}
    public boolean isEmpty() {return super.isEmpty();}
    public boolean intersects(java.util.BitSet set) {return super.intersects(set);}
    public int cardinality() {return super.cardinality();}
    public void and(java.util.BitSet set) {super.and(set);}
    public void or(java.util.BitSet set) {super.or(set);}
    public void xor(java.util.BitSet set) {super.xor(set);}
    public void andNot(java.util.BitSet set) {super.andNot(set);}

    public int hashCode() {return super.hashCode();}
    public int size() {return super.size();}
    public boolean equals(Object obj) {return super.equals(obj);}
    public Object clone() {return super.clone();}
    public String toString() {return super.toString();}

    public IntStream stream() {return super.stream();}


}
