package language.data.object.classtype.reflect.annotation;

import java.lang.annotation.Annotation;

/**
 * Represents an annotated element of the program currently running in this VM.
 *
 * @see java.lang.reflect.AnnotatedElement
 */
public interface AnnotatedElement extends java.lang.reflect.AnnotatedElement
{
    default boolean isAnnotationPresent(Class<? extends Annotation> annotationClass) {return getAnnotation(annotationClass) != null;}//判断该程序元素上是否包含指定类型的注解，存在则返回true，否则返回false.

    <T extends Annotation> T getAnnotation(Class<T> annotationClass);//返回改程序元素上存在的、指定类型的注解，如果该类型注解不存在，则返回null
    Annotation[] getAnnotations();//返回该程序元素上存在的所有注解。
    /* default */ <T extends Annotation> T[] getAnnotationsByType(Class<T> annotationClass) ;//

    /* default */ <T extends Annotation> T getDeclaredAnnotation(Class<T> annotationClass) ;//返回直接存在于此元素上的所有注解。该方法将忽略继承的注解。
    Annotation[] getDeclaredAnnotations();
    /* default */ <T extends Annotation> T[] getDeclaredAnnotationsByType(Class<T> annotationClass) ;

}
