package javaee.servlet.annotation;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/**
 * This annotation is used to declare an array of application classes which are
 * passed to a {@link javax.servlet.ServletContainerInitializer}.
 *
 * @see javax.servlet.annotation.HandlesTypes
 */
@Target(ElementType.TYPE)
@Retention(RetentionPolicy.RUNTIME)
public @interface HandlesTypes {
    /**
     * @return array of classes
     */
    Class<?>[] value();
}
