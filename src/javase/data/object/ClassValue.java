package javase.data.object;

/**
 * @see java.lang.ClassValue
 * @param <T>
 */
public abstract class ClassValue<T> extends java.lang.ClassValue<T> {

    protected ClassValue() { }

    protected abstract T computeValue(Class<?> type);

    public T get(Class<?> type) {return super.get(type);}
    public void remove(Class<?> type) { super.remove(type);}
}
