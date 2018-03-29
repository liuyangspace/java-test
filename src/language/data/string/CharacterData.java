package language.data.string;

/**
 * @see java.lang.CharacterData
 * @see java.lang.CharacterData0E
 */
abstract class CharacterData // implements java.lang.CharacterData
{
    abstract int getProperties(int ch);
    abstract int getType(int ch);
    abstract boolean isWhitespace(int ch);
    abstract boolean isMirrored(int ch);
    abstract boolean isJavaIdentifierStart(int ch);
    abstract boolean isJavaIdentifierPart(int ch);
    abstract boolean isUnicodeIdentifierStart(int ch);
    abstract boolean isUnicodeIdentifierPart(int ch);
    abstract boolean isIdentifierIgnorable(int ch);
    abstract int toLowerCase(int ch);
    abstract int toUpperCase(int ch);
    abstract int toTitleCase(int ch);
    abstract int digit(int ch, int radix);
    abstract int getNumericValue(int ch);
    abstract byte getDirectionality(int ch);

    //need to implement for JSR204
    int toUpperCaseEx(int ch) {
        return toUpperCase(ch);
    }
    char[] toUpperCaseCharArray(int ch) {
        return null;
    }
    boolean isOtherLowercase(int ch) {
        return false;
    }
    boolean isOtherUppercase(int ch) {
        return false;
    }
    boolean isOtherAlphabetic(int ch) {
        return false;
    }
    boolean isIdeographic(int ch) {
        return false;
    }
    // Character <= 0xff (basic latin) is handled by internal fast-path
    // to avoid initializing large tables.
    // Note: performance of this "fast-path" code may be sub-optimal
    // in negative cases for some accessors due to complicated ranges.
    // Should revisit after optimization of table initialization.
}
