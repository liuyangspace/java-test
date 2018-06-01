package language.data.array.container.collection.set;

import java.util.*;
import java.util.Set;

/**
 * A {@link Set} that further provides a <i>total ordering</i> on its elements.
 *
 * @see java.util.SortedSet
 * @see Set
 * @see TreeSet
 * @see SortedMap
 * @see Collection
 * @see Comparable
 * @see Comparator
 * @see ClassCastException
 *
 */
public interface SortedSet<E> extends java.util.SortedSet<E>,Set<E>  {
    Comparator<? super E> comparator();
    java.util.SortedSet<E> subSet(E fromElement, E toElement);
    java.util.SortedSet<E> headSet(E toElement);
    java.util.SortedSet<E> tailSet(E fromElement);
    E first();
    E last();
    // default Spliterator<E> spliterator(){ }
}
