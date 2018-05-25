package language.data.array.container.map;

import java.util.Collection;
import java.util.Map;
import java.util.Set;
import java.util.function.Function;

/**
 *
 * @see Map
 * @see Collection
 * @see java.util.AbstractMap<K,V>
 */
public abstract class AbstractMap<K,V> extends java.util.AbstractMap<K,V> implements Map<K,V> {
    protected AbstractMap() { }

    public int size() {return entrySet().size();}
    public boolean isEmpty() {return size() == 0;}

    public boolean containsValue(Object value) {return super.containsValue(value);}
    public boolean containsKey(Object key) {return super.containsKey(key);}
    public V get(Object key) {return super.get(key);}
    public V put(K key, V value) { throw new UnsupportedOperationException(); }
    public V remove(Object key) {return super.remove(key);}

    public void clear() {entrySet().clear();}
    public void putAll(Map<? extends K, ? extends V> m) {super.putAll(m);}

    public Set<K> keySet() {return super.keySet();}
    public Collection<V> values() {return super.values();}
    public abstract Set<Entry<K,V>> entrySet();

    public boolean equals(Object o) {return super.equals(o);}
    public int hashCode() {return super.hashCode();}
    public String toString() {return super.toString();}
    protected Object clone() throws CloneNotSupportedException {return super.clone();}

    public static class SimpleEntry<K,V> extends java.util.AbstractMap.SimpleEntry<K,V> implements Entry<K,V>, java.io.Serializable
    {
        public SimpleEntry(K key, V value) { super(key, value); }
        public SimpleEntry(Entry<? extends K, ? extends V> entry) { super(entry); }

        public K getKey() {return super.getKey();}
        public V getValue() {return super.getValue();}
        public V setValue(V value) {return super.setValue(value);}

        public boolean equals(Object o) {return super.equals(o);}
        public int hashCode() {return super.hashCode();}
        public String toString() {return super.toString();}
    }

    public static class SimpleImmutableEntry<K,V> extends java.util.AbstractMap.SimpleImmutableEntry<K,V> implements Entry<K,V>, java.io.Serializable
    {
        public SimpleImmutableEntry(K key, V value) {super(key, value);}
        public SimpleImmutableEntry(Entry<? extends K, ? extends V> entry) {super(entry);}

        public K getKey() {return super.getKey();}
        public V getValue() {return super.getValue();}
        public V setValue(V value) {return super.setValue(value);}

        public boolean equals(Object o) {return super.equals(o);}
        public int hashCode() {return super.hashCode();}
        public String toString() {return super.toString();}
    }
}
