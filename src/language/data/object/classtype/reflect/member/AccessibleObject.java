package language.data.object.classtype.reflect.member;

import java.lang.annotation.Annotation;

/**
 * The {@code AccessibleObject} class is the base class for {@code Field},
 * {@code Method}, and {@code Constructor} objects (known as <em>reflected
 * objects</em>). It provides the ability to flag a reflected object as
 * suppressing checks for Java language access control when it is used.
 *
 * @see java.lang.reflect.AccessibleObject
 */
public class AccessibleObject //implements AnnotatedElement
{
    java.lang.reflect.AccessibleObject $this;

    public static void setAccessible(java.lang.reflect.AccessibleObject[] array, boolean flag) { java.lang.reflect.AccessibleObject.setAccessible(array,flag); }
    public void setAccessible(boolean flag) {$this.setAccessible(flag);}
    public final boolean trySetAccessible() {return $this.trySetAccessible();}
    public boolean isAccessible() { return $this.isAccessible(); }
    public final boolean canAccess(Object obj) {return $this.canAccess(obj);}
    // Annotation
    public <T extends Annotation> T getAnnotation(Class<T> annotationClass) {return $this.getAnnotation(annotationClass);}
    public boolean isAnnotationPresent(Class<? extends Annotation> annotationClass) {return $this.isAnnotationPresent(annotationClass);}
    public <T extends Annotation> T[] getAnnotationsByType(Class<T> annotationClass) {return $this.getAnnotationsByType(annotationClass);}
    public Annotation[] getAnnotations() { return $this.getAnnotations();}
    public <T extends Annotation> T getDeclaredAnnotation(Class<T> annotationClass) {return $this.getDeclaredAnnotation(annotationClass);}
    public <T extends Annotation> T[] getDeclaredAnnotationsByType(Class<T> annotationClass) {return $this.getDeclaredAnnotationsByType(annotationClass);}
    public Annotation[] getDeclaredAnnotations()  {return $this.getDeclaredAnnotations();}
}
