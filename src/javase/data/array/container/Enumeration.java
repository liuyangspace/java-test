package javase.data.array.container;

import java.util.Iterator;

/**
 * An object that implements the Enumeration interface generates a
 * series of elements, one at a time.
 *
 * @see java.util.Enumeration
 * @see     java.util.Iterator
 * @see     java.io.SequenceInputStream
 * @see     java.util.Enumeration#nextElement()
 * @see     java.util.Hashtable
 * @see     java.util.Hashtable#elements()
 * @see     java.util.Hashtable#keys()
 * @see     java.util.Vector
 * @see     java.util.Vector#elements()
 *
 */
public interface Enumeration<E> {
    boolean hasMoreElements();
    E nextElement();
    default Iterator<E> asIterator() {
        return new Iterator<>() {
            @Override public boolean hasNext() { return hasMoreElements(); }
            @Override public E next() { return nextElement(); }
        };
    }
}
