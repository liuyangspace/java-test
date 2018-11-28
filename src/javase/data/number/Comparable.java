package javase.data.number;

/**
 * This interface imposes a total ordering on the objects of each class that
 * implements it.  This ordering is referred to as the class's <i>natural
 * ordering</i>, and the class's {@code compareTo} method is referred to as
 * its <i>natural comparison method</i>.<p>
 *
 * @see java.lang.Comparable
 */
public interface Comparable<T> {
    public int compareTo(T o);
}
