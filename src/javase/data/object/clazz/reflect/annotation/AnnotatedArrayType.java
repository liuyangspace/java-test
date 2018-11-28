package javase.data.object.clazz.reflect.annotation;

import java.lang.reflect.AnnotatedType;
import java.lang.reflect.GenericArrayType;

/**
 * {@code AnnotatedArrayType} represents the potentially annotated use of an array type, whose component type may
 * itself represent the annotated use of a type.
 *
 * @see java.lang.reflect.AnnotatedArrayType
 */
public interface AnnotatedArrayType extends AnnotatedType {
    /**
     * Returns the potentially annotated generic component type of this array type.
     *
     * @return the potentially annotated generic component type of this array type
     * @see GenericArrayType#getGenericComponentType()
     */
    AnnotatedType  getAnnotatedGenericComponentType();

    /**
     * Returns the potentially annotated type that this type is a member of, if
     * this type represents a nested type. For example, if this type is
     * {@code @TA O<T>.I<S>}, return a representation of {@code @TA O<T>}.
     *
     * <p>Returns {@code null} for an {@code AnnotatedType} that is an instance
     *     of {@code AnnotatedArrayType}.
     *
     * @return {@code null}
     *
     * @since 9
     */
    @Override
    AnnotatedType getAnnotatedOwnerType();
}
