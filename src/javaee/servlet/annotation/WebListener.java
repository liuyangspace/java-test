package javaee.servlet.annotation;

import java.lang.annotation.*;

/**
 * The annotation used to declare a listener for various types of event, in a
 * given web application context.
 *
 * @see javax.servlet.annotation.WebListener
 */
@Target(ElementType.TYPE)
@Retention(RetentionPolicy.RUNTIME)
@Documented
public @interface WebListener {
    /**
     * @return description of the listener, if present
     */
    String value() default "";
}
