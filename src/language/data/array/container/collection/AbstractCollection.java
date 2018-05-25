package language.data.array.container.collection;

import java.util.Collection;
import java.util.Iterator;

/**
 * @see java.util.AbstractCollection
 */
public abstract class AbstractCollection<E> extends java.util.AbstractCollection<E> implements Collection<E> {
    protected AbstractCollection() { }

    public abstract int size();
    public boolean isEmpty(){return size() == 0;}

    public boolean contains(Object o) {return super.contains(o);}
    public boolean add(E e){return super.add(e);}
    public boolean remove(Object o) {return super.remove(o);}
    public void clear() {super.clear();}

    public boolean containsAll(Collection<?> c) {return super.containsAll(c);}
    public boolean retainAll(Collection<?> c) {return super.retainAll(c);}
    public boolean addAll(Collection<? extends E> c) {return super.addAll(c);}
    public boolean removeAll(Collection<?> c) {return super.removeAll(c);}

    public abstract Iterator<E> iterator();
    public Object[] toArray() {return super.toArray();}
    public <T> T[] toArray(T[] a) {return super.toArray(a);}

    public String toString() {return super.toString();}

}
