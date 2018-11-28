package javase.data.string;

import java.lang.CharSequence;
import java.lang.String;

/**
 * @see java.lang.Character
 */
public class Character implements java.io.Serializable, Comparable<Character>
{
    public static final int MIN_RADIX = 2;
    public static final int MAX_RADIX = 36;
    public static final char MIN_VALUE = '\u0000';
    public static final char MAX_VALUE = '\uFFFF';
    // public static final Class<Character> TYPE = (Class<Character>) Class.getPrimitiveClass("char");
    static final int ERROR = 0xFFFFFFFF;
    public static final int MIN_CODE_POINT = 0x000000;
    public static final int MAX_CODE_POINT = 0X10FFFF;

    public static final int SIZE = 16;
    public static final int BYTES = SIZE / Byte.SIZE;

    /**
     * @see java.lang.Character.UnicodeScript
     */
    public static enum UnicodeScript {}

    /**
     * @see java.lang.Character#UNASSIGNED
     */
    public static final byte UNASSIGNED = 0;

    /**
     * @see java.lang.Character#DIRECTIONALITY_UNDEFINED
     */
    public static final byte DIRECTIONALITY_UNDEFINED = -1;

    private final char value;
    private static final long serialVersionUID = 3786198910865385080L;

    public Character(char value) {
        this.value = value;
    }

    public static java.lang.Character valueOf(char c) {return java.lang.Character.valueOf(c);}
    public char charValue() {
        return value;
    }

    public int hashCode() {
        return Character.hashCode(value);
    }
    public static int hashCode(char value) {
        return (int)value;
    }
    public boolean equals(Object obj) { if (obj instanceof java.lang.Character) { return value == ((java.lang.Character)obj).charValue(); } return false; }

    public java.lang.String toString() { char buf[] = {value}; return String.valueOf(buf); }
    public static java.lang.String toString(char c) {
        return java.lang.String.valueOf(c);
    }

    public static boolean isValidCodePoint(int codePoint) {return java.lang.Character.isValidCodePoint(codePoint);}
    public static boolean isBmpCodePoint(int codePoint) {return java.lang.Character.isBmpCodePoint(codePoint);}
    public static boolean isSupplementaryCodePoint(int codePoint) { return codePoint >= java.lang.Character.MIN_SUPPLEMENTARY_CODE_POINT && codePoint <  MAX_CODE_POINT + 1; }
    public static boolean isHighSurrogate(char ch) { return ch >= java.lang.Character.MIN_HIGH_SURROGATE && ch < (java.lang.Character.MAX_HIGH_SURROGATE + 1); }
    public static boolean isLowSurrogate(char ch) { return ch >= java.lang.Character.MIN_LOW_SURROGATE && ch < (java.lang.Character.MAX_LOW_SURROGATE + 1); }
    public static boolean isSurrogate(char ch) { return ch >= java.lang.Character.MIN_SURROGATE && ch < (java.lang.Character.MAX_SURROGATE + 1); }
    public static boolean isSurrogatePair(char high, char low) {
        return isHighSurrogate(high) && isLowSurrogate(low);
    }
    public static int charCount(int codePoint) { return codePoint >= java.lang.Character.MIN_SUPPLEMENTARY_CODE_POINT ? 2 : 1; }

    public static int toCodePoint(char high, char low) { return ((high << 10) + low) + (java.lang.Character.MIN_SUPPLEMENTARY_CODE_POINT - (java.lang.Character.MIN_HIGH_SURROGATE << 10) - java.lang.Character.MIN_LOW_SURROGATE); }
    public static int codePointAt(CharSequence seq, int index) { return java.lang.Character.codePointAt(seq,index); }
    public static int codePointAt(char[] a, int index) { return java.lang.Character.codePointAt(a, index); }
    public static int codePointAt(char[] a, int index, int limit) {return java.lang.Character.codePointAt(a, index, limit);}
    public static int codePointBefore(CharSequence seq, int index) {return java.lang.Character.codePointBefore(seq, index);}
    public static int codePointBefore(char[] a, int index) {
        return java.lang.Character.codePointBefore(a, index);
    }
    public static int codePointBefore(char[] a, int index, int start) {return java.lang.Character.codePointBefore(a,index,start);}
    public static char highSurrogate(int codePoint) { return java.lang.Character.highSurrogate(codePoint); }
    public static char lowSurrogate(int codePoint) { return java.lang.Character.lowSurrogate(codePoint); }
    public static int toChars(int codePoint, char[] dst, int dstIndex) {return java.lang.Character.toChars(codePoint,dst,dstIndex);}
    public static char[] toChars(int codePoint) {return java.lang.Character.toChars(codePoint);}
    public static int codePointCount(CharSequence seq, int beginIndex, int endIndex) {return java.lang.Character.codePointCount(seq,beginIndex,endIndex);}
    public static int codePointCount(char[] a, int offset, int count) {return java.lang.Character.codePointCount(a,offset,count);}
    public static int offsetByCodePoints(CharSequence seq, int index, int codePointOffset) {return java.lang.Character.codePointCount(seq,index,codePointOffset);}
    public static int offsetByCodePoints(char[] a, int start, int count, int index, int codePointOffset) {return java.lang.Character.offsetByCodePoints(a,start,count,index,codePointOffset);}

    public static boolean isLowerCase(char ch) {
        return isLowerCase((int)ch);
    }
    public static boolean isLowerCase(int codePoint) {return java.lang.Character.isLowerCase(codePoint);}
    public static boolean isUpperCase(char ch) {
        return isUpperCase((int)ch);
    }
    public static boolean isUpperCase(int codePoint) {return isUpperCase(codePoint);}
    public static boolean isTitleCase(char ch) {
        return isTitleCase((int)ch);
    }
    public static boolean isTitleCase(int codePoint) { return getType(codePoint) == java.lang.Character.TITLECASE_LETTER; }
    public static boolean isDigit(char ch) {
        return isDigit((int)ch);
    }
    public static boolean isDigit(int codePoint) { return getType(codePoint) == java.lang.Character.DECIMAL_DIGIT_NUMBER; }
    public static boolean isDefined(char ch) {
        return isDefined((int)ch);
    }
    public static boolean isDefined(int codePoint) {
        return getType(codePoint) != java.lang.Character.UNASSIGNED;
    }
    public static boolean isLetter(char ch) {
        return isLetter((int)ch);
    }
    public static boolean isLetter(int codePoint) {return java.lang.Character.isLetter(codePoint);}
    public static boolean isLetterOrDigit(char ch) {
        return isLetterOrDigit((int)ch);
    }
    public static boolean isLetterOrDigit(int codePoint) {return java.lang.Character.isLetterOrDigit(codePoint);}
    public static boolean isJavaLetter(char ch) {
        return isJavaIdentifierStart(ch);
    }
    public static boolean isJavaLetterOrDigit(char ch) {
        return isJavaIdentifierPart(ch);
    }
    public static boolean isAlphabetic(int codePoint) {return java.lang.Character.isAlphabetic(codePoint);}
    public static boolean isIdeographic(int codePoint) {
        return java.lang.Character.isIdeographic(codePoint);
    }
    public static boolean isJavaIdentifierStart(char ch) {
        return isJavaIdentifierStart((int)ch);
    }
    public static boolean isJavaIdentifierStart(int codePoint) { return java.lang.Character.isJavaIdentifierStart(codePoint); }
    public static boolean isJavaIdentifierPart(char ch) {
        return isJavaIdentifierPart((int)ch);
    }
    public static boolean isJavaIdentifierPart(int codePoint) { return java.lang.Character.isJavaIdentifierPart(codePoint); }
    public static boolean isUnicodeIdentifierStart(char ch) {
        return isUnicodeIdentifierStart((int)ch);
    }
    public static boolean isUnicodeIdentifierStart(int codePoint) { return java.lang.Character.isUnicodeIdentifierStart(codePoint); }
    public static boolean isUnicodeIdentifierPart(char ch) {
        return isUnicodeIdentifierPart((int)ch);
    }
    public static boolean isUnicodeIdentifierPart(int codePoint) { return java.lang.Character.isUnicodeIdentifierPart(codePoint); }
    public static boolean isIdentifierIgnorable(char ch) {
        return isIdentifierIgnorable((int)ch);
    }
    public static boolean isIdentifierIgnorable(int codePoint) { return java.lang.Character.isIdentifierIgnorable(codePoint); }

    public static boolean isSpace(char ch) {return java.lang.Character.isSpace(ch);}
    public static boolean isSpaceChar(char ch) {
        return isSpaceChar((int)ch);
    }
    public static boolean isSpaceChar(int codePoint) {return java.lang.Character.isSpaceChar(codePoint);}
    public static boolean isWhitespace(char ch) {
        return isWhitespace((int)ch);
    }
    public static boolean isWhitespace(int codePoint) {
        return java.lang.Character.isWhitespace(codePoint);
    }
    public static boolean isISOControl(char ch) {
        return isISOControl((int)ch);
    }
    public static boolean isISOControl(int codePoint) {return java.lang.Character.isISOControl(codePoint);}
    public static boolean isMirrored(char ch) {
        return isMirrored((int)ch);
    }
    public static boolean isMirrored(int codePoint) {
        return java.lang.Character.isMirrored(codePoint);
    }


    public static char toLowerCase(char ch) {
        return (char)toLowerCase((int)ch);
    }
    public static int toLowerCase(int codePoint) {
        return java.lang.Character.toLowerCase(codePoint);
    }
    public static char toUpperCase(char ch) {
        return (char)toUpperCase((int)ch);
    }
    public static int toUpperCase(int codePoint) {
        return java.lang.Character.toUpperCase(codePoint);
    }
    public static char toTitleCase(char ch) {
        return (char)toTitleCase((int)ch);
    }
    public static int toTitleCase(int codePoint) {
        return java.lang.Character.toTitleCase(codePoint);
    }
    public static int digit(char ch, int radix) {
        return digit((int)ch, radix);
    }
    public static int digit(int codePoint, int radix) {
        return java.lang.Character.digit(codePoint, radix);
    }
    public static int getNumericValue(char ch) {
        return getNumericValue((int)ch);
    }
    public static int getNumericValue(int codePoint) {
        return java.lang.Character.getNumericValue(codePoint);
    }

    public static int getType(char ch) {
        return getType((int)ch);
    }
    public static int getType(int codePoint) { return java.lang.Character.getType(codePoint); }

    public static String getName(int codePoint) {return java.lang.Character.getName(codePoint);}
    public static int codePointOf(String name) {return java.lang.Character.codePointOf(name);}

    public static char forDigit(int digit, int radix) {return java.lang.Character.forDigit(digit,radix);}
    public static byte getDirectionality(char ch) {
        return getDirectionality((int)ch);
    }
    public static byte getDirectionality(int codePoint) { return java.lang.Character.getDirectionality(codePoint); }

    public int compareTo(Character anotherCharacter) {
        return compare(this.value, anotherCharacter.value);
    }
    public static int compare(char x, char y) {
        return x - y;
    }

    public static char reverseBytes(char ch) {
        return (char) (((ch & 0xFF00) >> 8) | (ch << 8));
    }
}
