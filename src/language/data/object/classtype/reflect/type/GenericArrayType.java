package language.data.object.classtype.reflect.type;

import java.lang.reflect.Type;

/**
 * {@code GenericArrayType} represents an array type whose component
 * type is either a parameterized type or a type variable.
 *
 * @see java.lang.reflect.GenericArrayType;
 */
public interface GenericArrayType extends Type {
    Type getGenericComponentType();
}
