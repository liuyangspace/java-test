package language.data.object.reflect;

public interface Annotation extends java.lang.annotation.Annotation
{
    boolean equals(Object obj);
    int hashCode();
    String toString();
    Class<? extends java.lang.annotation.Annotation> annotationType();
}
