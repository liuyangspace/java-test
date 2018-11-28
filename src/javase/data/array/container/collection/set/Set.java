package javase.data.array.container.collection.set;

import java.util.*;

/**
 * A collection that contains no duplicate elements.  More formally, sets
 * contain no pair of elements {@code e1} and {@code e2} such that
 * {@code e1.equals(e2)}, and at most one null element.  As implied by
 * its name, this interface models the mathematical <i>set</i> abstraction.
 *
 * {@link java.util.Set#of(Object...) Set.of()}
 * @see java.util.Set;
 * @see Collection
 * @see List
 * @see SortedSet
 * @see HashSet
 * @see TreeSet
 * @see AbstractSet
 * @see Collections#singleton(java.lang.Object)
 * @see Collections#EMPTY_SET
 *
 */
public interface Set<E> extends Collection<E>,java.util.Set<E> {
    int size();
    boolean isEmpty();
    boolean contains(Object o);

    Iterator<E> iterator();
    Object[] toArray();
    <T> T[] toArray(T[] a);

    boolean add(E e);
    boolean remove(Object o);
    boolean containsAll(Collection<?> c);
    boolean addAll(Collection<? extends E> c);
    boolean retainAll(Collection<?> c);
    boolean removeAll(Collection<?> c);

    void clear();
    boolean equals(Object o);
    int hashCode();

    default Spliterator<E> spliterator() { return Spliterators.spliterator(this, Spliterator.DISTINCT); }

    static <E> java.util.Set<E> of() { return java.util.Set.of(); }
    static <E> java.util.Set<E> of(E e1) { return java.util.Set.of(e1); }
    static <E> java.util.Set<E> of(E e1, E e2) { return java.util.Set.of(e1,e2); }
    static <E> java.util.Set<E> of(E e1, E e2, E e3) { return java.util.Set.of(e1,e2,e3); }
    static <E> java.util.Set<E> of(E e1, E e2, E e3, E e4) { return java.util.Set.of(e1,e2,e3,e4); }
    static <E> java.util.Set<E> of(E e1, E e2, E e3, E e4, E e5) { return java.util.Set.of(e1,e2,e3,e4,e5); }
    static <E> java.util.Set<E> of(E e1, E e2, E e3, E e4, E e5, E e6) { return java.util.Set.of(e1,e2,e3,e4,e5,e6); }
    static <E> java.util.Set<E> of(E e1, E e2, E e3, E e4, E e5, E e6, E e7) { return java.util.Set.of(e1,e2,e3,e4,e5,e6,e7); }
    static <E> java.util.Set<E> of(E e1, E e2, E e3, E e4, E e5, E e6, E e7, E e8) { return java.util.Set.of(e1,e2,e3,e4,e5,e6,e7,e8); }
    static <E> java.util.Set<E> of(E e1, E e2, E e3, E e4, E e5, E e6, E e7, E e8, E e9) { return java.util.Set.of(e1,e2,e3,e4,e5,e6,e7,e8,e9); }
    static <E> java.util.Set<E> of(E e1, E e2, E e3, E e4, E e5, E e6, E e7, E e8, E e9, E e10) { return java.util.Set.of(e1,e2,e3,e4,e5,e6,e7,e8,e9,e10); }
    static <E> java.util.Set<E> of(E... elements) {return java.util.Set.of(elements);}

}
