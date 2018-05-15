package language.data.string;

import java.lang.CharSequence;

/**
 * {@code StringJoiner} is used to construct a sequence of characters separated
 * by a delimiter and optionally starting with a supplied prefix
 * and ending with a supplied suffix.
 *
 *  * @apiNote
 * <p>The String {@code "[George:Sally:Fred]"} may be constructed as follows:
 *
 * <pre> {@code
 * StringJoiner sj = new StringJoiner(":", "[", "]");
 * sj.add("George").add("Sally").add("Fred");
 * String desiredString = sj.toString();
 * }</pre>
 * <p>
 * A {@code StringJoiner} may be employed to create formatted output from a
 * {@link java.util.stream.Stream} using
 * {@link java.util.stream.Collectors#joining(CharSequence)}. For example:
 *
 * <pre> {@code
 * List<Integer> numbers = Arrays.asList(1, 2, 3, 4);
 * String commaSeparatedNumbers = numbers.stream()
 *     .map(i -> i.toString())
 *     .collect(Collectors.joining(", "));
 * }</pre>
 *
 * @see     java.util.StringJoiner
 * @see java.util.stream.Collectors#joining(CharSequence)
 * @see java.util.stream.Collectors#joining(CharSequence, CharSequence, CharSequence)
 */
public class StringJoiner {

}
