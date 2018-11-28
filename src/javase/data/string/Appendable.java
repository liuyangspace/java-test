package javase.data.string;

import java.io.IOException;
import java.lang.CharSequence;

/**
 * @see java.lang.Appendable
 */
public interface Appendable extends java.lang.Appendable
{
    Appendable append(java.lang.CharSequence csq) throws IOException;
    Appendable append(CharSequence csq, int start, int end) throws IOException;
    Appendable append(char c) throws IOException;
}
