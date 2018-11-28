package javase.data.array.container.collection.set;

import java.util.Iterator;
import java.util.SortedSet;

/**
 * @see java.util.NavigableSet
 * @param <E>
 */
public interface NavigableSet<E> extends java.util.NavigableSet<E>,SortedSet<E> {
    E lower(E e);
    E floor(E e);
    E ceiling(E e);
    E higher(E e);
    E pollFirst();
    E pollLast();
    Iterator<E> iterator();
    java.util.NavigableSet<E> descendingSet();
    Iterator<E> descendingIterator();
    java.util.NavigableSet<E> subSet(E fromElement, boolean fromInclusive, E toElement, boolean toInclusive);
    java.util.NavigableSet<E> headSet(E toElement, boolean inclusive);
    java.util.NavigableSet<E> tailSet(E fromElement, boolean inclusive);
    SortedSet<E> subSet(E fromElement, E toElement);
    SortedSet<E> headSet(E toElement);
    SortedSet<E> tailSet(E fromElement);
}
