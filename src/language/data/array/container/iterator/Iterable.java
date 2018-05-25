package language.data.array.container.iterator;

import java.util.Iterator;
import java.util.Objects;
import java.util.Spliterator;
import java.util.Spliterators;
import java.util.function.Consumer;

/**
 * Implementing this interface allows an object to be the target of the enhanced
 * {@code for} statement (sometimes called the "for-each loop" statement).
 *
 * @see java.lang.Iterable
 */
public interface Iterable<T> {

    Iterator<T> iterator();

    default void forEach(Consumer<? super T> action) {
        Objects.requireNonNull(action);
        for (T t : (java.lang.Iterable<T>)this) {
            action.accept(t);
        }
    }

    default Spliterator<T> spliterator() { return Spliterators.spliteratorUnknownSize(iterator(), 0); }
}
