package javase.data.array.container.collection.set;

import java.util.AbstractCollection;
import java.util.Collection;
import java.util.Set;

/**
 * This class provides a skeletal implementation of the {@code Set}
 * interface to minimize the effort required to implement this
 * interface. <p>
 *
 * @see Collection
 * @see AbstractCollection
 * @see Set
 *
 * @param <E>
 */
public abstract class AbstractSet<E> extends java.util.AbstractSet<E> implements Set<E> {
    protected AbstractSet() {  }

    public boolean equals(Object o) {return super.equals(o);}
    public int hashCode() {return super.hashCode();}
    public boolean removeAll(Collection<?> c) {return super.removeAll(c);}
}
