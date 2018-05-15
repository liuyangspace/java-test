package language.data.object.classtype.annotation.annotation.vm;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/**
 * A method or constructor may be annotated as "force inline" if the standard
 * inlining metrics are to be ignored when the HotSpot VM inlines the method
 * or constructor.
 *
 * @see jdk.internal.vm.annotation.ForceInline
 */
@Target({ElementType.METHOD, ElementType.CONSTRUCTOR})
@Retention(RetentionPolicy.RUNTIME)
public @interface ForceInline {
}
