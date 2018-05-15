package language.data.object.classtype.reflect.annotation.annotation;

import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

import static java.lang.annotation.ElementType.METHOD;

/**
 * A method annotated @CallerSensitive is sensitive to its calling class,
 * via {@link jdk.internal.reflect.Reflection#getCallerClass Reflection.getCallerClass},
 * or via some equivalent.
 *
 * @see jdk.internal.reflect.CallerSensitive;
 */
@Retention(RetentionPolicy.RUNTIME)
@Target({METHOD})
public @interface CallerSensitive {
}
