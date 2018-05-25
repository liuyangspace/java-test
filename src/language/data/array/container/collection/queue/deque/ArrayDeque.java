package language.data.array.container.collection.queue.deque;

import java.io.Serializable;
import java.util.*;
import java.util.Deque;
import java.util.function.Consumer;
import java.util.function.Predicate;

/**
 * Resizable-array implementation of the {@link Deque} interface.  Array
 * deques have no capacity restrictions; they grow as necessary to support
 * usage.  They are not thread-safe; in the absence of external
 * synchronization, they do not support concurrent access by multiple threads.
 * Null elements are prohibited.  This class is likely to be faster than
 * {@link Stack} when used as a stack, and faster than {@link LinkedList}
 * when used as a queue.
 *
 * <p>Most {@code ArrayDeque} operations run in amortized constant time.
 * Exceptions include
 * {@link #remove(Object) remove},
 * {@link #removeFirstOccurrence removeFirstOccurrence},
 * {@link #removeLastOccurrence removeLastOccurrence},
 * {@link #contains contains},
 * {@link #iterator iterator.remove()},
 * and the bulk operations, all of which run in linear time.
 */
public class ArrayDeque<E> extends java.util.ArrayDeque<E> implements Deque<E>, Cloneable, Serializable {

    public ArrayDeque() { super(); }
    public ArrayDeque(int numElements) {super(numElements);}
    public ArrayDeque(Collection<? extends E> c) {super(c);}

    public void addFirst(E e) {super.addFirst(e);}
    public void addLast(E e) {super.addLast(e);}

    public boolean addAll(Collection<? extends E> c) {return super.addAll(c);}
    public boolean removeAll(Collection<?> c) {return super.removeAll(c);}
    public boolean retainAll(Collection<?> c) {return super.retainAll(c);}

    public boolean offerFirst(E e) {return super.offerFirst(e);}
    public boolean offerLast(E e) {return super.offerLast(e);}

    public E removeFirst() {return super.removeFirst();}
    public E removeLast() {return super.removeLast();}

    public E pollFirst() {return super.pollFirst();}
    public E pollLast() {return super.pollLast();}

    public E getFirst() {return super.getFirst();}
    public E getLast() {return super.getLast();}

    public E peekFirst() {return super.peekFirst();}
    public E peekLast() {return super.peekLast();}

    public boolean removeFirstOccurrence(Object o) {return super.removeFirstOccurrence(o);}
    public boolean removeLastOccurrence(Object o) {return super.removeLastOccurrence(o);}

    public int size() {return super.size();}
    public boolean isEmpty() {return super.isEmpty();}
    public boolean contains(Object o) {return super.contains(o);}
    public boolean add(E e) {return super.removeFirstOccurrence(e);}
    public boolean offer(E e) {return super.offer(e);}
    public boolean remove(Object o){return super.remove(o);}
    public void clear() {super.clear();}

    public E remove() {return super.remove();}
    public E poll() {return super.poll();}
    public E element() {return super.element();}
    public void forEach(Consumer<? super E> action) {super.forEach(action);}
    public boolean removeIf(Predicate<? super E> filter) {return super.removeIf(filter);}

    public E peek() {return super.peek();}
    public void push(E e){super.push(e);}
    public E pop(){return super.pop();}

    public Object[] toArray() {return super.toArray();}
    public <T> T[] toArray(T[] a) {return super.toArray(a);}
    public Iterator<E> iterator() {return super.iterator();}
    public Iterator<E> descendingIterator() {return super.descendingIterator();}
    public Spliterator<E> spliterator() {return super.spliterator();}

    public java.util.ArrayDeque<E> clone() {return super.clone();}
}
