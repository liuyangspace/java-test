package javaee.servlet.annotation;

import javax.servlet.annotation.ServletSecurity;
import java.lang.annotation.Documented;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

/**
 * Specific security constraints can be applied to different types of request,
 * differentiated by the HTTP protocol method type by using this annotation
 * inside the {@link javax.servlet.annotation.ServletSecurity} annotation.
 *
 * @see javax.servlet.annotation.HttpConstraint
 *
 */
@Retention(RetentionPolicy.RUNTIME)
@Documented
public @interface HttpMethodConstraint {

    /**
     * HTTP Protocol method name (e.g. POST, PUT)
     *
     * @return method name
     */
    String value();

    /**
     * The EmptyRoleSemantic determines the behaviour when the rolesAllowed list
     * is empty.
     *
     * @return empty role semantic
     */
    ServletSecurity.EmptyRoleSemantic emptyRoleSemantic() default ServletSecurity.EmptyRoleSemantic.PERMIT;

    /**
     * Determines whether SSL/TLS is required to process the current request.
     *
     * @return transport guarantee
     */
    ServletSecurity.TransportGuarantee transportGuarantee() default ServletSecurity.TransportGuarantee.NONE;

    /**
     * The authorized roles' names. The container may discard duplicate role
     * names during processing of the annotation. N.B. The String "*" does not
     * have a special meaning if it occurs as a role name.
     *
     * @return array of names. The array may be of zero length, in which case
     *         the EmptyRoleSemantic applies; the returned value determines
     *         whether access is to be permitted or denied regardless of the
     *         identity and authentication state in either case, PERMIT or DENY.<br>
     *         Otherwise, when the array contains one or more role names access
     *         is permitted if the user a member of at least one of the named
     *         roles. The EmptyRoleSemantic is not applied in this case.
     */
    String[] rolesAllowed() default {};
}
