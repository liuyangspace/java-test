package language.data.object.reflect;

import java.lang.reflect.TypeVariable;
import java.lang.reflect.AnnotatedElement;

public interface GenericDeclaration extends java.lang.reflect.GenericDeclaration,AnnotatedElement
{
    public TypeVariable<?>[] getTypeParameters();
}
