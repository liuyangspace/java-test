package javase.data.array.container.iterator;

import java.util.Spliterator;

/**
 * Static classes and methods for operating on or creating instances of
 * {@link Spliterator} and its primitive specializations
 * {@link Spliterator.OfInt}, {@link Spliterator.OfLong}, and
 * {@link Spliterator.OfDouble}.
 *
 * @see Spliterator
 * @see java.util.Spliterators
 */
public interface Spliterators {
    public static <T> Spliterator<T> emptySpliterator() { return java.util.Spliterators.emptySpliterator(); }
    public static Spliterator.OfInt emptyIntSpliterator() { return java.util.Spliterators.emptyIntSpliterator(); }
    public static Spliterator.OfLong emptyLongSpliterator() { return java.util.Spliterators.emptyLongSpliterator(); }
    public static Spliterator.OfDouble emptyDoubleSpliterator() { return java.util.Spliterators.emptyDoubleSpliterator(); }
    public static <T> Spliterator<T> spliterator(Object[] array, int additionalCharacteristics)
        { return java.util.Spliterators.spliterator(array,additionalCharacteristics); }
    public static <T> Spliterator<T> spliterator(Object[] array, int fromIndex, int toIndex, int additionalCharacteristics)
        { return java.util.Spliterators.spliterator(array,fromIndex,toIndex,additionalCharacteristics); }
    public static Spliterator.OfInt spliterator(int[] array,int additionalCharacteristics)
        { return java.util.Spliterators.spliterator(array,additionalCharacteristics); }
        
}
