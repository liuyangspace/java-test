package language.data.object.clazz.reflect.annotation;

import java.lang.reflect.AnnotatedElement;
import java.lang.reflect.Type;

/**
 * {@code AnnotatedParameterizedType} represents the potentially annotated use
 * of a parameterized type, whose type arguments may themselves represent
 * annotated uses of types.
 */
public interface AnnotatedType extends java.lang.reflect.AnnotatedType,AnnotatedElement
{
    public Type getType();
    default java.lang.reflect.AnnotatedType getAnnotatedOwnerType() {return null;}
}
