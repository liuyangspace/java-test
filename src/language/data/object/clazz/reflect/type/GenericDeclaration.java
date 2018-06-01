package language.data.object.clazz.reflect.type;

import java.lang.reflect.TypeVariable;
import java.lang.reflect.AnnotatedElement;

/**
 * A common interface for all entities that declare type variables.(泛型类型声明实体)
 *
 * @see java.lang.reflect.GenericDeclaration
 */
public interface GenericDeclaration extends java.lang.reflect.GenericDeclaration,AnnotatedElement
{
    public TypeVariable<?>[] getTypeParameters();
}
