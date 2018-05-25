package language.data.array.container.collection.queue;

import java.util.AbstractCollection;
import java.util.Collection;
import java.util.Queue;

/**
 * @see java.util.AbstractQueue
 */
public abstract class AbstractQueue<E> extends java.util.AbstractQueue<E> /* AbstractCollection<E> */ implements Queue<E> {
    protected AbstractQueue() { }

    public boolean add(E e) {return super.add(e);}
    public E remove() {return super.remove();}
    public E element() {return super.element();}

    public void clear() { while (poll() != null) ; }
    public boolean addAll(Collection<? extends E> c) { return super.addAll(c); }
}
