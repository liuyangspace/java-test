package language.data.object.classtype.reflect.annotation;

import java.lang.reflect.AnnotatedElement;
import java.lang.reflect.Type;

public interface AnnotatedType extends java.lang.reflect.AnnotatedType,AnnotatedElement
{
    public Type getType();
    default java.lang.reflect.AnnotatedType getAnnotatedOwnerType() {return null;}
}
