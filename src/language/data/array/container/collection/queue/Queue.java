package language.data.array.container.collection.queue;

/**
 * A collection designed for holding elements prior to processing.
 *
 *  <tr>
 *    <td><b>Insert</b></td>
 *    <td>{@link java.util.Queue#add add(e)}</td>
 *    <td>{@link java.util.Queue#offer offer(e)}</td>
 *  </tr>
 *  <tr>
 *    <td><b>Remove</b></td>
 *    <td>{@link java.util.Queue#remove remove()}</td>
 *    <td>{@link java.util.Queue#poll poll()}</td>
 *  </tr>
 *  <tr>
 *    <td><b>Examine</b></td>
 *    <td>{@link java.util.Queue#element element()}</td>
 *    <td>{@link java.util.Queue#peek peek()}</td>
 *  </tr>
 *
 * @see java.util.Collection
 * @see java.util.Queue
 * @see java.util.concurrent.BlockingQueue
 * @param <E>
 */
public interface Queue<E> extends java.util.Queue<E>,java.util.Collection<E> {
    boolean add(E e);
    boolean offer(E e);
    E remove();
    E poll();
    E element();
    E peek();
}
