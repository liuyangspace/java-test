package language.data.array.container.collection.queue.deque;

import java.util.Collection;
import java.util.Iterator;

/** 双向队列
 * A linear collection that supports element insertion and removal at
 * both ends.
 *
 * <tr>
 *    <td><b>Insert</b></td>
 *    <td>{@link #addFirst(Object) addFirst(e)}</td>
 *    <td>{@link #offerFirst(Object) offerFirst(e)}</td>
 *    <td>{@link #addLast(Object) addLast(e)}</td>
 *    <td>{@link #offerLast(Object) offerLast(e)}</td>
 *  </tr>
 *  <tr>
 *    <td><b>Remove</b></td>
 *    <td>{@link #removeFirst() removeFirst()}</td>
 *    <td>{@link #pollFirst() pollFirst()}</td>
 *    <td>{@link #removeLast() removeLast()}</td>
 *    <td>{@link #pollLast() pollLast()}</td>
 *  </tr>
 *  <tr>
 *    <td><b>Examine</b></td>
 *    <td>{@link #getFirst() getFirst()}</td>
 *    <td>{@link #peekFirst() peekFirst()}</td>
 *    <td>{@link #getLast() getLast()}</td>
 *    <td>{@link #peekLast() peekLast()}</td>
 *  </tr>
 *
 * @see java.util.Deque
 * @param <E>
 */
public interface Deque<E> extends java.util.Deque<E>,java.util.Queue<E> {
    void addFirst(E e);
    void addLast(E e);
    boolean offerFirst(E e);
    boolean offerLast(E e);
    E removeFirst();
    E removeLast();
    E pollFirst();
    E pollLast();
    E getFirst();
    E getLast();
    E peekFirst();
    E peekLast();
    boolean removeFirstOccurrence(Object o);
    boolean removeLastOccurrence(Object o);

    boolean add(E e);
    boolean offer(E e);
    E remove();
    E poll();
    E element();
    E peek();

    boolean addAll(Collection<? extends E> c);

    void push(E e);
    E pop();

    int size();
    boolean remove(Object o);
    boolean contains(Object o);

    Iterator<E> iterator();
    Iterator<E> descendingIterator();
}
