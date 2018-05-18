package language.data.object.classtype.reflect.annotation;

import java.lang.reflect.AnnotatedType;
import java.lang.reflect.MalformedParameterizedTypeException;
import java.lang.reflect.ParameterizedType;

/**
 * {@code AnnotatedParameterizedType} represents the potentially annotated use
 * of a parameterized type, whose type arguments may themselves represent
 * annotated uses of types.
 *
 * @see java.lang.reflect.AnnotatedParameterizedType
 */
public interface AnnotatedParameterizedType  extends AnnotatedType {
    /**
     * Returns the potentially annotated actual type arguments of this parameterized type.
     *
     * @return the potentially annotated actual type arguments of this parameterized type
     * @see ParameterizedType#getActualTypeArguments()
     */
    java.lang.reflect.AnnotatedType[] getAnnotatedActualTypeArguments();

    /**
     * Returns the potentially annotated type that this type is a member of, if
     * this type represents a nested type. For example, if this type is
     * {@code @TA O<T>.I<S>}, return a representation of {@code @TA O<T>}.
     *
     * <p>Returns {@code null} if this {@code AnnotatedType} represents a
     *     top-level type, or a local or anonymous class, or a primitive type, or
     *     void.
     *
     * @return an {@code AnnotatedType} object representing the potentially
     *     annotated type that this type is a member of, or {@code null}
     * @throws TypeNotPresentException if the owner type
     *     refers to a non-existent type declaration
     * @throws MalformedParameterizedTypeException if the owner type
     *     refers to a parameterized type that cannot be instantiated
     *     for any reason
     *
     * @since 9
     */
    @Override
    AnnotatedType getAnnotatedOwnerType();
}
