package javase.extension.io;

import java.io.Flushable;
import java.io.IOException;
import java.io.PrintWriter;
import java.io.Reader;

/**
 * Methods to access the character-based console device, if any, associated
 * with the current Java virtual machine.
 *
 * <blockquote><pre>{@code
 * Console cons;
 * char[] passwd;
 * if ((cons = System.console()) != null &&
 *     (passwd = cons.readPassword("[%s]", "Password:")) != null) {
 *     ...
 *     java.util.Arrays.fill(passwd, ' ');
 * }
 * }</pre></blockquote>
 *
 * @see java.io.Console
 * @see java.lang.System#console()
 *
 */
public final class Console implements Flushable
{
    private java.io.Console $this;
    private Console() {}

    public PrintWriter writer() { return $this.writer(); }
    public Reader reader() { return $this.reader(); }
    public java.io.Console format(String fmt, Object ...args) { return $this.format(fmt,args); }
    public java.io.Console printf(String format, Object ... args) { return $this.printf(format,args); }
    public String readLine(String fmt, Object ... args) { return $this.readLine(fmt,args); }
    public String readLine() { return $this.readLine(); }
    public char[] readPassword(String fmt, Object ... args) { return $this.readPassword(fmt,args); }
    public char[] readPassword() { return $this.readPassword(); }

    public void flush() throws IOException {$this.flush();}
}
