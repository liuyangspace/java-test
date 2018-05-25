package language.data.array.container.collection;

import java.util.Collections;
import java.util.List;
import java.util.function.Function;
import java.util.function.ToDoubleFunction;
import java.util.function.ToIntFunction;
import java.util.function.ToLongFunction;

/**
 * A comparison function, which imposes a <i>total ordering</i> on some
 * collection of objects.
 *
 * @see java.util.Comparator
 * @see  Collections#sort(List<T>, Comparator<? super T>)
 */
public interface Comparator<T> extends java.util.Comparator<T> {
    int compare(T o1, T o2);
    boolean equals(Object obj);
    default java.util.Comparator<T> reversed() { return Collections.reverseOrder(this); }

    default java.util.Comparator<T> thenComparing(java.util.Comparator<? super T> other) { return this.thenComparing(other); }
    default <U> java.util.Comparator<T> thenComparing( Function<? super T, ? extends U> keyExtractor, java.util.Comparator<? super U> keyComparator)
        { return thenComparing(comparing(keyExtractor, keyComparator)); }
    default <U extends Comparable<? super U>> java.util.Comparator<T> thenComparing( Function<? super T, ? extends U> keyExtractor)
        { return thenComparing(comparing(keyExtractor)); }
    default java.util.Comparator<T> thenComparingInt(ToIntFunction<? super T> keyExtractor) { return thenComparing(comparingInt(keyExtractor)); }
    default java.util.Comparator<T> thenComparingLong(ToLongFunction<? super T> keyExtractor) { return thenComparing(comparingLong(keyExtractor)); }
    default java.util.Comparator<T> thenComparingDouble(ToDoubleFunction<? super T> keyExtractor) { return thenComparing(comparingDouble(keyExtractor)); }

    public static <T extends Comparable<? super T>> java.util.Comparator<T> reverseOrder() { return Collections.reverseOrder(); }
    public static <T extends Comparable<? super T>> java.util.Comparator<T> naturalOrder() { return java.util.Comparator.naturalOrder(); }
    public static <T> java.util.Comparator<T> nullsFirst(java.util.Comparator<? super T> comparator) {return java.util.Comparator.nullsFirst(comparator); }
    public static <T> java.util.Comparator<T> nullsLast(java.util.Comparator<? super T> comparator) {return java.util.Comparator.nullsLast(comparator);}
    public static <T, U> java.util.Comparator<T> comparing( Function<? super T, ? extends U> keyExtractor, java.util.Comparator<? super U> keyComparator)
        { return java.util.Comparator.comparing(keyExtractor,keyComparator); }

    public static <T, U extends Comparable<? super U>> java.util.Comparator<T> comparing( Function<? super T, ? extends U> keyExtractor)
        { return java.util.Comparator.comparing(keyExtractor); }
    public static <T> java.util.Comparator<T> comparingInt(ToIntFunction<? super T> keyExtractor)
        { return java.util.Comparator.comparingInt(keyExtractor); }
    public static <T> java.util.Comparator<T> comparingLong(ToLongFunction<? super T> keyExtractor)
        { return java.util.Comparator.comparingLong(keyExtractor); }
    public static<T> java.util.Comparator<T> comparingDouble(ToDoubleFunction<? super T> keyExtractor)
        { return java.util.Comparator.comparingDouble(keyExtractor); }
}
