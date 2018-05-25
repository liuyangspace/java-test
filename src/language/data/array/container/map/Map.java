package language.data.array.container.map;

import java.util.*;
import java.util.function.BiConsumer;
import java.util.function.BiFunction;
import java.util.function.Function;

/**
 * @see java.util.Map
 * @see HashMap
 * @see TreeMap
 * @see Hashtable
 * @see SortedMap
 * @see Collection
 * @see Set
 */
public interface Map<K, V> extends java.util.Map<K, V>{
    int size();
    boolean isEmpty();
    boolean containsKey(Object key);
    boolean containsValue(Object value);

    V get(Object key);
    V put(K key, V value);
    V remove(Object key);
    void clear();

    void putAll(java.util.Map<? extends K, ? extends V> m);

    Set<K> keySet();
    Collection<V> values();
    Set<java.util.Map.Entry<K, V>> entrySet();

    boolean equals(Object o);
    int hashCode();

    default V getOrDefault(Object key, V defaultValue) {V v; return (((v = get(key)) != null) || containsKey(key)) ? v : defaultValue;}
    default void forEach(BiConsumer<? super K, ? super V> action) { /** @see java.util.Map#forEach(BiConsumer)  */  }
    default void replaceAll(BiFunction<? super K, ? super V, ? extends V> function) { /** @see java.util.Map#replaceAll(BiFunction)  */ }
    default V putIfAbsent(K key, V value) {/** @see java.util.Map#putIfAbsent(K,V)  */return null; }
    default boolean remove(Object key, Object value) {/** @see java.util.Map#remove(Object,Object) */return false;}
    default boolean replace(K key, V oldValue, V newValue) {/** @see java.util.Map#replace(K,V,V) */return false;}
    default V replace(K key, V value) {/** @see java.util.Map#replace(K,V) */return null;}
    default V computeIfAbsent(K key, Function<? super K, ? extends V> mappingFunction)
        {/** @see java.util.Map#computeIfAbsent(K,Function) */return null;}
    default V computeIfPresent(K key, BiFunction<? super K, ? super V, ? extends V> remappingFunction)
        {/** @see java.util.Map#computeIfPresent(K,BiFunction) */return null;}
    default V compute(K key, BiFunction<? super K, ? super V, ? extends V> remappingFunction)
        {/** @see java.util.Map#compute(K,BiFunction) */return null;}
    default V merge(K key, V value, BiFunction<? super V, ? super V, ? extends V> remappingFunction)
        {/** @see java.util.Map#merge(K,V,BiFunction) */return null;}

    static <K, V> java.util.Map<K, V> of() {/** @see java.util.Map#of() */return null;}
    static <K, V> java.util.Map<K, V> of(K k1, V v1){/** @see java.util.Map#of(K,V) */return null;}
    static <K, V> java.util.Map<K, V> of(K k1, V v1, K k2, V v2){/** @see java.util.Map#of(K,V,K,V) */return null;}
    static <K, V> java.util.Map<K, V> of(K k1, V v1, K k2, V v2, K k3, V v3) {/** @see java.util.Map#of(K,V,K,V,K,V) */return null;}
    static <K, V> java.util.Map<K, V> of(K k1, V v1, K k2, V v2, K k3, V v3, K k4, V v4)
        {/** @see java.util.Map#of(K,V,K,V,K,V,K,V) */return null;}
    static <K, V> java.util.Map<K, V> of(K k1, V v1, K k2, V v2, K k3, V v3, K k4, V v4, K k5, V v5)
        {/** @see java.util.Map#of(K,V,K,V,K,V,K,V,K,V) */return null;}
    static <K, V> java.util.Map<K, V> of(K k1, V v1, K k2, V v2, K k3, V v3, K k4, V v4, K k5, V v5,K k6, V v6)
        {/** @see java.util.Map#of(K,V,K,V,K,V,K,V,K,V,K,V) */return null;}
    static <K, V> java.util.Map<K, V> of(K k1, V v1, K k2, V v2, K k3, V v3, K k4, V v4, K k5, V v5,K k6, V v6, K k7, V v7)
        {/** @see java.util.Map#of(K,V,K,V,K,V,K,V,K,V,K,V,K,V) */return null;}
    static <K, V> java.util.Map<K, V> of(K k1, V v1, K k2, V v2, K k3, V v3, K k4, V v4, K k5, V v5,K k6, V v6, K k7, V v7, K k8, V v8)
        {/** @see java.util.Map#of(K,V,K,V,K,V,K,V,K,V,K,V,K,V,K,V) */return null;}
    static <K, V> java.util.Map<K, V> of(K k1, V v1, K k2, V v2, K k3, V v3, K k4, V v4, K k5, V v5,K k6, V v6, K k7, V v7, K k8, V v8, K k9, V v9)
        {/** @see java.util.Map#of(K,V,K,V,K,V,K,V,K,V,K,V,K,V,K,V,K,V) */return null;}
    static <K, V> java.util.Map<K, V> of(K k1, V v1, K k2, V v2, K k3, V v3, K k4, V v4, K k5, V v5,K k6, V v6, K k7, V v7, K k8, V v8, K k9, V v9, K k10, V v10)
        {/** @see java.util.Map#of(K,V,K,V,K,V,K,V,K,V,K,V,K,V,K,V,K,V,K,V) */return null;}
    static <K, V> java.util.Map<K, V> ofEntries(Entry<? extends K, ? extends V>... entries)
        {/** @see java.util.Map#ofEntries(Entry<K,V>) */return null;}

    static <K, V> java.util.Map.Entry<K, V> entry(K k, V v) {/** @see java.util.Map#entry(K,V) */return null;}

    interface Entry<K, V> {
        K getKey();
        V getValue();
        V setValue(V value);
        boolean equals(Object o);
        int hashCode();
        public static <K extends Comparable<? super K>, V> Comparator<java.util.Map.Entry<K, V>> comparingByKey()
            {return java.util.Map.Entry.comparingByKey();}
        public static <K, V extends Comparable<? super V>> Comparator<java.util.Map.Entry<K, V>> comparingByValue()
            {return java.util.Map.Entry.comparingByValue();}
        public static <K, V> Comparator<java.util.Map.Entry<K, V>> comparingByKey(Comparator<? super K> cmp)
            {return java.util.Map.Entry.comparingByKey(cmp);}
        public static <K, V> Comparator<java.util.Map.Entry<K, V>> comparingByValue(Comparator<? super V> cmp)
            {return java.util.Map.Entry.comparingByValue(cmp);}
    }
}
