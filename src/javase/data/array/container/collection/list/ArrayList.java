package javase.data.array.container.collection.list;

import javase.data.array.container.collection.list.vector.Vector;

import java.util.*;
import java.util.LinkedList;
import java.util.RandomAccess;
import java.util.function.Consumer;
import java.util.function.Predicate;
import java.util.function.UnaryOperator;

/**
 * @see     java.util.ArrayList
 * @see     Collection
 * @see     java.util.List
 * @see     LinkedList
 * @see     Vector
 *
 * @param <E>
 */
public class ArrayList<E> extends java.util.ArrayList<E> /* AbstractList<E> */implements List<E>, RandomAccess, Cloneable, java.io.Serializable {

    public ArrayList() {super();}
    public ArrayList(int initialCapacity) {super(initialCapacity);}
    public ArrayList(Collection<? extends E> c) {super(c);}

    public void trimToSize() {super.trimToSize();}
    public void ensureCapacity(int minCapacity) {super.ensureCapacity(minCapacity);}

    public int size() {return super.size();}
    public boolean isEmpty() {return super.isEmpty();}
    public boolean contains(Object o) {return super.contains(o);}
    public E get(int index) {return super.get(index);}
    public E set(int index, E element) {return super.set(index,element);}
    public boolean add(E e) {return super.add(e);}
    public void add(int index, E element) {super.add(index,element);}
    public E remove(int index) {return super.remove(index);}
    public boolean remove(Object o) {return super.remove(o);}
    public void clear() {super.clear();}
    protected void removeRange(int fromIndex, int toIndex) {super.removeRange(fromIndex,toIndex);}
    public boolean removeIf(Predicate<? super E> filter) {return super.removeIf(filter);}

    public int indexOf(Object o) {return super.indexOf(o);}
    public int lastIndexOf(Object o) {return super.lastIndexOf(o);}

    public Object clone() {return super.clone();}
    public Object[] toArray() {return super.toArray();}
    public <T> T[] toArray(T[] a) {return super.toArray(a);}

    public boolean addAll(Collection<? extends E> c) {return super.addAll(c);}
    public boolean addAll(int index, Collection<? extends E> c) {return super.addAll(index,c);}
    public boolean removeAll(Collection<?> c) {return super.removeAll(c);}
    public boolean retainAll(Collection<?> c) {return super.retainAll(c);}
    public ListIterator<E> listIterator(int index) {return super.listIterator(index);}
    public ListIterator<E> listIterator() {return super.listIterator();}
    public Iterator<E> iterator() {return super.iterator();}
    public Spliterator<E> spliterator() {return super.spliterator();}

    public java.util.List<E> subList(int fromIndex, int toIndex) {return super.subList(fromIndex,toIndex);}
    public void forEach(Consumer<? super E> action) {super.forEach(action);}
    public void replaceAll(UnaryOperator<E> operator) {super.replaceAll(operator);}
    public void sort(Comparator<? super E> c) {super.sort(c);}

}
