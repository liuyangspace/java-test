package javase.data.array.container;

import java.util.Enumeration;

/**
 * The {@code Dictionary} class is the abstract parent of any
 * class, such as {@code Hashtable}, which maps keys to values.
 *
 * @see     java.util.Map
 * @see     java.lang.Object#equals(java.lang.Object)
 * @see     java.lang.Object#hashCode()
 * @see     java.util.Hashtable
 *
 */
public abstract class Dictionary<K,V> extends java.util.Dictionary<K,V>{
    public Dictionary() { }

    public abstract int size();
    public abstract boolean isEmpty();
    public abstract Enumeration<K> keys();
    public abstract Enumeration<V> elements();
    public abstract V get(Object key);
    public abstract V put(K key, V value);
    public abstract V remove(Object key);
}
