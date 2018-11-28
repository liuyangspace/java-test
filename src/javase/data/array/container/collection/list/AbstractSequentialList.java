package javase.data.array.container.collection.list;

import java.util.*;
import java.util.AbstractList;
import java.util.List;

/**
 * @see java.util.AbstractSequentialList
 * @see Collection
 * @see List
 * @see AbstractList
 * @see AbstractCollection
 *
 * @param <E>
 */
public abstract class AbstractSequentialList<E> extends java.util.AbstractSequentialList<E> /** @see  java.util.AbstractList <E> */
{
    protected AbstractSequentialList() { }

    public E get(int index) {return super.get(index);}
    public E set(int index, E element) {return super.set(index,element);}
    public void add(int index, E element) {super.add(index,element);}
    public E remove(int index) {return super.remove(index);}

    public boolean addAll(int index, Collection<? extends E> c) {return super.addAll(c);}
    public Iterator<E> iterator() { return super.listIterator(); }
    public abstract ListIterator<E> listIterator(int index);
}
