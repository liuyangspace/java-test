package language.data.array.container.collection.list;

import java.util.*;
import java.util.function.UnaryOperator;

/**
 * @see java.util.List
 * @see Collection
 * @see Set
 * @see ArrayList
 * @see LinkedList
 * @see Vector
 * @see Arrays#asList(Object[])
 * @see Collections#nCopies(int, Object)
 * @see Collections#EMPTY_LIST
 * @see AbstractList
 * @see AbstractSequentialList
 */
public interface List<E> extends java.util.List<E>,Collection<E> {
    int size();
    boolean isEmpty();

    boolean contains(Object o);
    boolean add(E e);
    boolean remove(Object o);
    void clear();

    boolean containsAll(Collection<?> c);
    boolean addAll(Collection<? extends E> c);
    boolean addAll(int index, Collection<? extends E> c);
    boolean removeAll(Collection<?> c);
    boolean retainAll(Collection<?> c);
    default void replaceAll(UnaryOperator<E> operator){ /** @see java.util.List#replaceAll(UnaryOperator)  */  }
    default void sort(Comparator<? super E> c) { /** @see java.util.List#sort(Comparator)  */ }

    E get(int index);
    E set(int index, E element);
    void add(int index, E element);
    E remove(int index);

    int indexOf(Object o);
    int lastIndexOf(Object o);

    Object[] toArray();
    <T> T[] toArray(T[] a);
    Iterator<E> iterator();
    ListIterator<E> listIterator();
    ListIterator<E> listIterator(int index);
    java.util.List<E> subList(int fromIndex, int toIndex);
    default Spliterator<E> spliterator() { /** @see java.util.List#spliterator()  */ return null; }

    static <E> java.util.List<E> of() { return java.util.List.of(); }
    static <E> java.util.List<E> of(E e1){return java.util.List.of(e1);}
    static <E> java.util.List<E> of(E e1, E e2){return java.util.List.of(e1,e2);}
    static <E> java.util.List<E> of(E e1, E e2, E e3) {return java.util.List.of(e1,e2,e3);}
    static <E> java.util.List<E> of(E e1, E e2, E e3, E e4){return java.util.List.of(e1,e2,e3,e4);}
    static <E> java.util.List<E> of(E e1, E e2, E e3, E e4, E e5){return java.util.List.of(e1,e2,e3,e4,e5);}
    static <E> java.util.List<E> of(E e1, E e2, E e3, E e4, E e5, E e6) {return java.util.List.of(e1,e2,e3,e4,e5,e6);}
    static <E> java.util.List<E> of(E e1, E e2, E e3, E e4, E e5, E e6, E e7){return java.util.List.of(e1,e2,e3,e4,e5,e6,e7);}
    static <E> java.util.List<E> of(E e1, E e2, E e3, E e4, E e5, E e6, E e7, E e8){return java.util.List.of(e1,e2,e3,e4,e5,e6,e7,e8);}
    static <E> java.util.List<E> of(E e1, E e2, E e3, E e4, E e5, E e6, E e7, E e8,E e9){return java.util.List.of(e1,e2,e3,e4,e5,e6,e7,e8,e9);}
    static <E> java.util.List<E> of(E e1, E e2, E e3, E e4, E e5, E e6, E e7, E e8,E e9, E e10){return java.util.List.of(e1,e2,e3,e4,e5,e6,e7,e8,e9,e10);}
    static <E> java.util.List<E> of(E... elements) {return java.util.List.of(elements);}

    boolean equals(Object o);
    int hashCode();
}
