package javaee.servlet.annotation;


import javax.servlet.annotation.HttpConstraint;
import javax.servlet.annotation.HttpMethodConstraint;
import java.lang.annotation.*;

/**
 * Declare this annotation on a {@link javax.servlet.Servlet} implementation
 * class to enforce security constraints on HTTP protocol requests.<br>
 * The container applies constraints to the URL patterns mapped to each Servlet
 * which declares this annotation.<br>
 * <br>
 *
 * @see javax.servlet.annotation.ServletSecurity
 */
@Inherited
@Target(ElementType.TYPE)
@Retention(RetentionPolicy.RUNTIME)
@Documented
public @interface ServletSecurity {

    /**
     * Represents the two possible values of the empty role semantic, active
     * when a list of role names is empty.
     */
    enum EmptyRoleSemantic {

        /**
         * Access MUST be permitted, regardless of authentication state or
         * identity
         */
        PERMIT,

        /**
         * Access MUST be denied, regardless of authentication state or identity
         */
        DENY
    }

    /**
     * Represents the two possible values of data transport, encrypted or not.
     */
    enum TransportGuarantee {

        /**
         * User data must not be encrypted by the container during transport
         */
        NONE,

        /**
         * The container MUST encrypt user data during transport
         */
        CONFIDENTIAL
    }

    /**
     * The default constraint to apply to requests not handled by specific
     * method constraints
     *
     * @return http constraint
     */
    javax.servlet.annotation.HttpConstraint value() default @HttpConstraint;

    /**
     * An array of HttpMethodConstraint objects to which the security constraint
     * will be applied
     *
     * @return array of http method constraint
     */
    HttpMethodConstraint[] httpMethodConstraints() default {};
}
