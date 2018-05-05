package language.data.object.classtype.reflect;

import java.lang.reflect.AnnotatedElement;
import java.lang.reflect.AnnotatedType;
import java.lang.reflect.GenericDeclaration;
import java.lang.reflect.Type;

/**
 * TypeVariable is the common superinterface for type variables of kinds.
 * A type variable is created the first time it is needed by a reflective
 * method, as specified in this package.
 *
 * @see java.lang.reflect.TypeVariable
 */
public interface TypeVariable<D extends GenericDeclaration> extends java.lang.reflect.TypeVariable,Type, AnnotatedElement
{
    Type[] getBounds();
    D getGenericDeclaration();
    String getName();
    AnnotatedType[] getAnnotatedBounds();
}
