package language.data.object;

import java.lang.Object;
import java.util.Arrays;
import java.util.Comparator;
import java.util.function.Supplier;

/**
 * This class consists of {@code static} utility methods for operating
 * on objects, or checking certain conditions before operation.
 *
 * @see java.util.Objects
 */
public final class Objects {
    public static boolean equals(java.lang.Object a, Object b){return java.util.Objects.equals(a,b);}
    public static boolean deepEquals(Object a, Object b){return java.util.Objects.deepEquals(a,b);}
    public static int hashCode(Object o){return java.util.Objects.hashCode(o);}
    public static int hash(Object... values) { return Arrays.hashCode(values); }
    public static String toString(Object o) { return String.valueOf(o); }
    public static String toString(Object o, String nullDefault) { return (o != null) ? o.toString() : nullDefault; }
    public static <T> int compare(T a, T b, Comparator<? super T> c) { return (a == b) ? 0 :  c.compare(a, b); }

    public static <T> T requireNonNull(T obj) { return java.util.Objects.requireNonNull(obj); }
    public static <T> T requireNonNull(T obj, String message) { return java.util.Objects.requireNonNull(obj,message); }
    public static boolean isNull(Object obj) { return obj == null; }
    public static boolean nonNull(Object obj) { return obj != null; }
    public static <T> T requireNonNullElse(T obj, T defaultObj) { return java.util.Objects.requireNonNullElse(obj,defaultObj); }
    public static <T> T requireNonNullElseGet(T obj, Supplier<? extends T> supplier) { return java.util.Objects.requireNonNullElseGet(obj,supplier); }
    public static <T> T requireNonNull(T obj, Supplier<String> messageSupplier){ return java.util.Objects.requireNonNull(obj,messageSupplier); }

    public static int checkIndex(int index, int length) { return java.util.Objects.checkIndex(index, length); }
    public static int checkFromToIndex(int fromIndex, int toIndex, int length) { return java.util.Objects.checkFromToIndex(fromIndex, toIndex, length); }
    public static int checkFromIndexSize(int fromIndex, int size, int length) { return java.util.Objects.checkFromIndexSize(fromIndex, size, length); }

}
