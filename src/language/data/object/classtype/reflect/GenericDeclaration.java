package language.data.object.classtype.reflect;

import java.lang.reflect.TypeVariable;
import java.lang.reflect.AnnotatedElement;

/**
 * A common interface for all entities that declare type variables.
 *
 * @see java.lang.reflect.GenericDeclaration
 */
public interface GenericDeclaration extends java.lang.reflect.GenericDeclaration,AnnotatedElement
{
    public TypeVariable<?>[] getTypeParameters();
}
