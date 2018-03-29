package language.base;

import java.io.IOException;

/**
 * @see java.lang.Appendable
 */
public interface Appendable extends java.lang.Appendable
{
    Appendable append(CharSequence csq) throws IOException;
    Appendable append(CharSequence csq, int start, int end) throws IOException;
    Appendable append(char c) throws IOException;
}
