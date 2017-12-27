package language.data.object.reflect;

import java.lang.reflect.AnnotatedElement;
import java.lang.reflect.AnnotatedType;
import java.lang.reflect.GenericDeclaration;
import java.lang.reflect.Type;

public interface TypeVariable<D extends GenericDeclaration> extends java.lang.reflect.TypeVariable,Type, AnnotatedElement
{
    Type[] getBounds();
    D getGenericDeclaration();
    String getName();
    AnnotatedType[] getAnnotatedBounds();
}
