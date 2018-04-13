package language.data.object.classtype.annotation.type;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/** 注解是否将包含在JavaDoc中
 * If the annotation {@code @Documented} is present on the declaration
 * of an annotation type <i>A</i>, then any {@code @A} annotation on
 * an element is considered part of the element's public contract.
 *
 * @see java.lang.annotation.Documented
 */
@Documented
@Retention(RetentionPolicy.RUNTIME)
@Target(ElementType.ANNOTATION_TYPE)
public @interface Documented {
}
