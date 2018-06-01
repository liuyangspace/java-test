package language.data.object.clazz.annotation.type;

import java.lang.annotation.Documented;
import java.lang.annotation.ElementType;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/** 注解的生命周期。
 * Indicates how long annotations with the annotated type are to be retained.
 *
 * @see java.lang.annotation.Retention
 */
@Documented
@java.lang.annotation.Retention(RetentionPolicy.RUNTIME)
@Target(ElementType.ANNOTATION_TYPE)
public @interface Retention {
    RetentionPolicy value();
}
