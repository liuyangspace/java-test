package language.data.object.classtype.throwable.error;

import java.lang.LinkageError;

/**
 * @see java.lang.ClassFormatError
 */
public class ClassFormatError extends LinkageError
{
    private static final long serialVersionUID = -8420114879011949195L;
    public ClassFormatError() { super(); }
    public ClassFormatError(String s) { super(s); }
}
