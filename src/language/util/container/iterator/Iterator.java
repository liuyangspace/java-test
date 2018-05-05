package language.util.container.iterator;
import java.util.Collection;
import java.util.ListIterator;

/**
 * <p>This interface is a member of the
 * <a href="{@docRoot}/java/util/package-summary.html#CollectionsFramework">
 * Java Collections Framework</a>.
 * @author  Josh Bloch
 * @param <E> the type of elements returned by this iterator
 * @see Collection
 * @see ListIterator
 * @see Iterable
 * @since 1.2
 */
interface Iterator<E> extends java.util.Iterator
{
    boolean hasNext();
    E next();
    default void remove() {
        throw new UnsupportedOperationException("remove");
    }
    //default void forEachRemaining(Consumer<? super E> action) { super.wait(); };
}
