package language.data.string;

import java.lang.String;
import java.util.stream.IntStream;

/**
 * @see java.lang.CharSequence
 */
public interface CharSequence extends java.lang.CharSequence
{
    int length();// Returns the length of this character sequence.
    char charAt(int index);// Returns the {@code char} value at the specified index.
    java.lang.CharSequence subSequence(int start, int end);//Returns a {@code CharSequence} that is a subsequence of this sequence.
    public String toString();
    public /* default */ IntStream chars();
    public /* default */ IntStream codePoints();
}
