package language.data.array.container.collection;

import language.data.array.container.collection.list.vector.Vector;

import java.util.*;
import java.util.function.Predicate;
import java.util.stream.Stream;
import java.util.stream.StreamSupport;

/**
 *  The root interface in the <i>collection hierarchy</i>.  A collection
 * represents a group of objects, known as its <i>elements</i>.  Some
 * collections allow duplicate elements and others do not.  Some are ordered
 * and others unordered.  The JDK does not provide any <i>direct</i>
 * implementations of this interface: it provides implementations of more
 * specific subinterfaces like {@code Set} and {@code List}.  This interface
 * is typically used to pass collections around and manipulate them where
 * maximum generality is desired.
 *
 * @see java.util.Collection
 * @see Set
 * @see ArrayList
 * @see LinkedList
 * @see Vector
 * @see Arrays#asList(Object[])
 * @see Collections#nCopies(int, Object)
 * @see Collections#EMPTY_LIST
 * @see AbstractList
 * @see AbstractSequentialList
 * @see     Set
 * @see     List
 * @see     Map
 * @see     SortedSet
 * @see     SortedMap
 * @see     HashSet
 * @see     TreeSet
 * @see     ArrayList
 * @see     LinkedList
 * @see     Vector
 * @see     Collections
 * @see     Arrays
 * @see     AbstractCollection
 */
public interface Collection<E> extends java.util.Collection<E> , Iterable<E> {

    int size();
    boolean isEmpty();
    boolean contains(Object o);
    boolean add(E e);
    boolean remove(Object o);
    void clear();

    boolean containsAll(java.util.Collection<?> c);
    boolean addAll(java.util.Collection<? extends E> c);
    boolean removeAll(java.util.Collection<?> c);
    boolean retainAll(java.util.Collection<?> c);
    default boolean removeIf(Predicate<? super E> filter) {return this.removeIf(filter);}

    Iterator<E> iterator();
    Object[] toArray();

    <T> T[] toArray(T[] a);

    default Spliterator<E> spliterator() { return Spliterators.spliterator((java.util.Collection<E>)this, 0); }
    default Stream<E> stream() { return StreamSupport.stream(spliterator(), false); }
    default Stream<E> parallelStream() { return StreamSupport.stream(spliterator(), true); }

    boolean equals(Object o);
    int hashCode();

}
