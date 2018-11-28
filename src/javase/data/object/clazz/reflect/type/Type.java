package javase.data.object.clazz.reflect.type;

/**
 * Type is the common superinterface for all types in the Java
 * programming javase. These include raw types, parameterized types,
 * array types, type variables and primitive types.
 *
 * @since 1.5
 *
 * @see java.lang.reflect.Type
 */
public interface Type extends java.lang.reflect.Type
{
    default String getTypeName() { return toString(); }
}
