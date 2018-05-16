package language.data.object.classtype.annotation.annotation;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/**
 * The {@code @HotSpotIntrinsicCandidate} annotation is specific to the
 * HotSpot Virtual Machine.
 *
 * @see jdk.internal.HotSpotIntrinsicCandidate
 */
@Target({ElementType.METHOD, ElementType.CONSTRUCTOR})
@Retention(RetentionPolicy.RUNTIME)
public @interface HotSpotIntrinsicCandidate {
}
