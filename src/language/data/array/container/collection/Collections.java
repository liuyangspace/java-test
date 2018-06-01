package language.data.array.container.collection;

import java.util.*;
import java.util.Collection;
import java.util.Comparator;

/**
 * This class consists exclusively of static methods that operate on or return
 * collections.  It contains polymorphic algorithms that operate on
 * collections, "wrappers", which return a new collection backed by a
 * specified collection, and a few other odds and ends.
 *
 * @see     Collection
 * @see     Set
 * @see     List
 * @see     Map
 * @see     java.util.Collections
 *
 */
public class Collections {
    // 排序 搜索
    public static <T extends Comparable<? super T>> void sort(List<T> list) { list.sort(null); }
    public static <T> void sort(List<T> list, Comparator<? super T> c) { list.sort(c); }
    public static <T> int binarySearch(List<? extends Comparable<? super T>> list, T key) {return java.util.Collections.binarySearch(list,key);}
    public static <T> int binarySearch(List<? extends T> list, T key, Comparator<? super T> c){return java.util.Collections.binarySearch(list,key,c);}
    // 反转 打乱 交换 填充 复制
    public static void reverse(List<?> list){ java.util.Collections.reverse(list); }
    public static void shuffle(List<?> list){ java.util.Collections.shuffle(list); }
    public static void shuffle(List<?> list, Random rnd){ java.util.Collections.shuffle(list,rnd); }
    public static void swap(List<?> list, int i, int j){ java.util.Collections.swap(list,i,j); }
    public static <T> void fill(List<? super T> list, T obj){ java.util.Collections.fill(list,obj); }
    public static <T> void copy(List<? super T> dest, List<? extends T> src){ java.util.Collections.copy(dest,src); }
    // 极值
    public static <T extends Object & Comparable<? super T>> T min(Collection<? extends T> coll){ return java.util.Collections.min(coll); }
    public static <T> T min(Collection<? extends T> coll, Comparator<? super T> comp){ return java.util.Collections.min(coll,comp); }
    public static <T extends Object & Comparable<? super T>> T max(Collection<? extends T> coll){ return java.util.Collections.max(coll); }
    public static <T> T max(Collection<? extends T> coll, Comparator<? super T> comp){ return java.util.Collections.max(coll,comp); }
    // 旋转
    public static void rotate(List<?> list, int distance){ java.util.Collections.rotate(list,distance); }

    public static <T> boolean replaceAll(List<T> list, T oldVal, T newVal){ return java.util.Collections.replaceAll(list,oldVal,newVal); }
    public static int indexOfSubList(List<?> source, List<?> target){ return java.util.Collections.indexOfSubList(source,target); }
    public static int lastIndexOfSubList(List<?> source, List<?> target){ return java.util.Collections.lastIndexOfSubList(source,target); }

    public static <T> Collection<T> unmodifiableCollection(Collection<? extends T> c) { return java.util.Collections.unmodifiableCollection(c); }
    public static <T> Set<T> unmodifiableSet(Set<? extends T> s){ return java.util.Collections.unmodifiableSet(s); }
    public static <T> SortedSet<T> unmodifiableSortedSet(SortedSet<T> s){ return java.util.Collections.unmodifiableSortedSet(s); }
    public static <T> NavigableSet<T> unmodifiableNavigableSet(NavigableSet<T> s){ return java.util.Collections.unmodifiableNavigableSet(s); }
    public static <T> List<T> unmodifiableList(List<? extends T> list){ return java.util.Collections.unmodifiableList(list); }
    public static <K,V> Map<K,V> unmodifiableMap(Map<? extends K, ? extends V> m){ return java.util.Collections.unmodifiableMap(m); }
    public static <K,V> SortedMap<K,V> unmodifiableSortedMap(SortedMap<K, ? extends V> m){ return java.util.Collections.unmodifiableSortedMap(m); }
    public static <K,V> NavigableMap<K,V> unmodifiableNavigableMap(NavigableMap<K, ? extends V> m){ return java.util.Collections.unmodifiableNavigableMap(m); }
    public static <T> Collection<T> synchronizedCollection(Collection<T> c){ return java.util.Collections.synchronizedCollection(c); }
    public static <T> Set<T> synchronizedSet(Set<T> s){ return java.util.Collections.synchronizedSet(s); }
    public static <T> SortedSet<T> synchronizedSortedSet(SortedSet<T> s){ return java.util.Collections.synchronizedSortedSet(s); }
    public static <T> NavigableSet<T> synchronizedNavigableSet(NavigableSet<T> s){ return java.util.Collections.synchronizedNavigableSet(s); }
    public static <T> List<T> synchronizedList(List<T> list){ return java.util.Collections.synchronizedList(list); }
    public static <K,V> Map<K,V> synchronizedMap(Map<K,V> m){ return java.util.Collections.synchronizedMap(m); }
    public static <K,V> SortedMap<K,V> synchronizedSortedMap(SortedMap<K,V> m){ return java.util.Collections.synchronizedSortedMap(m); }
    public static <K,V> NavigableMap<K,V> synchronizedNavigableMap(NavigableMap<K,V> m){ return java.util.Collections.synchronizedNavigableMap(m); }

    public static <E> Collection<E> checkedCollection(Collection<E> c, Class<E> type){ return java.util.Collections.checkedCollection(c,type); }
    public static <E> Queue<E> checkedQueue(Queue<E> queue, Class<E> type){ return java.util.Collections.checkedQueue(queue,type); }
    public static <E> Set<E> checkedSet(Set<E> s, Class<E> type){ return java.util.Collections.checkedSet(s,type); }
    public static <E> SortedSet<E> checkedSortedSet(SortedSet<E> s, Class<E> type){ return java.util.Collections.checkedSortedSet(s,type); }
    public static <E> NavigableSet<E> checkedNavigableSet(NavigableSet<E> s, Class<E> type){ return java.util.Collections.checkedNavigableSet(s,type); }
    public static <E> List<E> checkedList(List<E> list, Class<E> type){ return java.util.Collections.checkedList(list,type); }
    public static <K, V> Map<K, V> checkedMap(Map<K, V> m, Class<K> keyType, Class<V> valueType){ return java.util.Collections.checkedMap(m,keyType,valueType); }
    public static <K,V> SortedMap<K,V> checkedSortedMap(SortedMap<K, V> m, Class<K> keyType, Class<V> valueType){ return java.util.Collections.checkedSortedMap(m,keyType,valueType); }
    public static <K,V> NavigableMap<K,V> checkedNavigableMap(NavigableMap<K, V> m, Class<K> keyType, Class<V> valueType){ return java.util.Collections.checkedNavigableMap(m,keyType,valueType); }

    public static <T> Iterator<T> emptyIterator(){return java.util.Collections.emptyIterator();}
    public static <T> ListIterator<T> emptyListIterator(){return java.util.Collections.emptyListIterator();}
    public static <T> Enumeration<T> emptyEnumeration(){return java.util.Collections.emptyEnumeration();}

    // public static final List EMPTY_LIST = new EmptyList<>();
    public static final <T> List<T> emptyList() { return java.util.Collections.emptyList(); }
    // public static final Map EMPTY_MAP = new EmptyMap<>();
    public static final <K,V> Map<K,V> emptyMap() { return java.util.Collections.emptyMap(); }
    public static final <K,V> SortedMap<K,V> emptySortedMap(){return java.util.Collections.emptySortedMap();}
    public static final <K,V> NavigableMap<K,V> emptyNavigableMap(){return java.util.Collections.emptyNavigableMap();}

    // public static final Set EMPTY_SET = new java.util.Collections.EmptySet<>();
    public static final <T> Set<T> emptySet() { return java.util.Collections.emptySet(); }
    public static <E> SortedSet<E> emptySortedSet(){return java.util.Collections.emptySortedSet();}
    public static <E> NavigableSet<E> emptyNavigableSet(){return java.util.Collections.emptyNavigableSet();}

    public static <T> Set<T> singleton(T o){return java.util.Collections.singleton(o);}
    public static <T> List<T> singletonList(T o){return java.util.Collections.singletonList(o);}
    public static <K,V> Map<K,V> singletonMap(K key, V value){return java.util.Collections.singletonMap(key,value);}

    public static <T> List<T> nCopies(int n, T o){return java.util.Collections.nCopies(n,o);}
    public static <T> Comparator<T> reverseOrder(){return java.util.Collections.reverseOrder();}
    public static <T> Comparator<T> reverseOrder(Comparator<T> cmp){return java.util.Collections.reverseOrder(cmp);}

    public static <T> Enumeration<T> enumeration(final Collection<T> c){return java.util.Collections.enumeration(c);}
    public static <T> ArrayList<T> list(Enumeration<T> e){return java.util.Collections.list(e);}

    public static int frequency(Collection<?> c, Object o){return java.util.Collections.frequency(c,o);}
    public static boolean disjoint(Collection<?> c1, Collection<?> c2){return java.util.Collections.disjoint(c1,c2);}
    public static <T> boolean addAll(Collection<? super T> c, T... elements){return java.util.Collections.addAll(c,elements);}
    public static <E> Set<E> newSetFromMap(Map<E, Boolean> map){return java.util.Collections.newSetFromMap(map);}
    public static <T> Queue<T> asLifoQueue(Deque<T> deque){return java.util.Collections.asLifoQueue(deque);}

}
