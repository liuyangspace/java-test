package javaee.servlet.annotation;

import javax.servlet.annotation.WebInitParam;
import java.lang.annotation.*;

/**
 * This annotation is used to declare the configuration of an {@link javax.servlet.Servlet}.
 *
 * E.g. <code>@WebServlet("/path")}<br>
 * public class TestServlet extends HttpServlet ... {</code><br>
 *
 * E.g.
 * <code>@WebServlet(name="TestServlet", urlPatterns={"/path", "/alt"}) <br>
 * public class TestServlet extends HttpServlet ... {</code><br>
 *
 * @see javax.servlet.annotation.WebServlet
 */
@Target(ElementType.TYPE)
@Retention(RetentionPolicy.RUNTIME)
@Documented
public @interface WebServlet {
    /**
     * @return name of the Servlet
     */
    String name() default "";

    /**
     * A convenience method, to allow extremely simple annotation of a class.
     *
     * @return array of URL patterns
     * @see #urlPatterns()
     */
    String[] value() default {};

    /**
     * @return array of URL patterns to which this Filter applies
     */
    String[] urlPatterns() default {};

    /**
     * @return load on startup ordering hint
     */
    int loadOnStartup() default -1;

    /**
     * @return array of initialization params for this Servlet
     */
    WebInitParam[] initParams() default {};

    /**
     * @return asynchronous operation supported by this Servlet
     */
    boolean asyncSupported() default false;

    /**
     * @return small icon for this Servlet, if present
     */
    String smallIcon() default "";

    /**
     * @return large icon for this Servlet, if present
     */
    String largeIcon() default "";

    /**
     * @return description of this Servlet, if present
     */
    String description() default "";

    /**
     * @return display name of this Servlet, if present
     */
    String displayName() default "";
}
