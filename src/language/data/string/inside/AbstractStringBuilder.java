package language.data.string.inside;

import java.lang.CharSequence;

/**
 * @see java.lang.AbstractStringBuilder
 *
 */
abstract class AbstractStringBuilder implements Appendable, CharSequence
{
    private static final int MAX_ARRAY_SIZE = Integer.MAX_VALUE - 8;

    byte[] value;
    byte coder;
    int count;

    AbstractStringBuilder() { }
    AbstractStringBuilder(int capacity) {}

    public int length() {
        return count;
    }
    public int capacity() {
        return value.length >> coder;
    }

    /**
     * @see java.lang.AbstractStringBuilder#AbstractStringBuilder
     * @see java.lang.AbstractStringBuilder#ensureCapacity
     * @see java.lang.AbstractStringBuilder#ensureCapacityInternal
     * @see java.lang.AbstractStringBuilder#newCapacity
     * @see java.lang.AbstractStringBuilder#hugeCapacity
     * @see java.lang.AbstractStringBuilder#inflate
     * @see java.lang.AbstractStringBuilder#trimToSize
     * @see java.lang.AbstractStringBuilder#setLength
     * @see java.lang.AbstractStringBuilder#charAt
     * @see java.lang.AbstractStringBuilder#codePoints
     * @see java.lang.AbstractStringBuilder#codePointAt
     * @see java.lang.AbstractStringBuilder#codePointBefore
     * @see java.lang.AbstractStringBuilder#codePointCount
     * @see java.lang.AbstractStringBuilder#offsetByCodePoints
     * @see java.lang.AbstractStringBuilder#getChars
     * @see java.lang.AbstractStringBuilder#setCharAt
     * @see java.lang.AbstractStringBuilder#append
     * @see java.lang.AbstractStringBuilder#appendNull
     * @see java.lang.AbstractStringBuilder#delete
     * @see java.lang.AbstractStringBuilder#appendCodePoint
     * @see java.lang.AbstractStringBuilder#deleteCharAt
     * @see java.lang.AbstractStringBuilder#replace
     * @see java.lang.AbstractStringBuilder#substring
     * @see java.lang.AbstractStringBuilder#subSequence
     * @see java.lang.AbstractStringBuilder#shift
     * @see java.lang.AbstractStringBuilder#insert
     * @see java.lang.AbstractStringBuilder#indexOf
     * @see java.lang.AbstractStringBuilder#lastIndexOf
     * @see java.lang.AbstractStringBuilder#reverse
     * @see java.lang.AbstractStringBuilder#toString
     * @see java.lang.AbstractStringBuilder#chars
     * @see java.lang.AbstractStringBuilder#getValue
     * @see java.lang.AbstractStringBuilder#getBytes
     * @see java.lang.AbstractStringBuilder#initBytes
     * @see java.lang.AbstractStringBuilder#getCoder
     * @see java.lang.AbstractStringBuilder#isLatin1
     * @see java.lang.AbstractStringBuilder#putCharsAt
     * @see java.lang.AbstractStringBuilder#putStringAt
     * @see java.lang.AbstractStringBuilder#appendChars
     * @see java.lang.AbstractStringBuilder#checkRange
     * @see java.lang.AbstractStringBuilder#checkRangeSIOOBE
     */


}
