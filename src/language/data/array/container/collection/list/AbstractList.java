package language.data.array.container.collection.list;

import java.util.*;
import java.util.List;

/**
 * @see java.util.AbstractList
 * @param <E>
 */
public abstract class AbstractList<E> extends java.util.AbstractList<E> /** @see  AbstractCollection<E> */ implements List<E> {
    protected AbstractList() {}

    public boolean add(E e) {return super.add(e);}
    public abstract E get(int index);
    public E set(int index, E element) {throw new UnsupportedOperationException();}
    public void add(int index, E element) {throw new UnsupportedOperationException();}
    public void clear() {removeRange(0, size());}
    public E remove(int index) {throw new UnsupportedOperationException();}

    public boolean addAll(int index, Collection<? extends E> c) {return super.addAll(index,c);}

    public int indexOf(Object o) {return super.indexOf(o);}
    public int lastIndexOf(Object o) {return super.lastIndexOf(o);}

    public Iterator<E> iterator(){return super.iterator();}
    public ListIterator<E> listIterator(){return super.listIterator();}
    public ListIterator<E> listIterator(final int index) {return super.listIterator(index);}
    public List<E> subList(int fromIndex, int toIndex) {return super.subList(fromIndex,toIndex);}
    protected void removeRange(int fromIndex, int toIndex) {super.removeRange(fromIndex,toIndex);}

    public boolean equals(Object o) {return super.equals(o);}
    public int hashCode() {return super.hashCode();}
}
