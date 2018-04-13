package language.data.object.classtype.annotation;

/**
 * The common interface extended by all annotation types.
 *
 * @see java.lang.annotation
 * @see java.lang.annotation.Annotation
 */
public interface Annotation extends java.lang.annotation.Annotation
{
    boolean equals(Object obj);
    int hashCode();
    String toString();
    Class<? extends java.lang.annotation.Annotation> annotationType();
}
