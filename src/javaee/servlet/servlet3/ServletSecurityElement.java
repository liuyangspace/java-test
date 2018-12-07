package javaee.servlet.servlet3;

import javax.servlet.HttpConstraintElement;
import javax.servlet.HttpMethodConstraintElement;
import javax.servlet.annotation.ServletSecurity;
import java.util.Collection;

/**
 * @since Servlet 3.0
 * TODO SERVLET3 - Add comments
 *
 * @see javax.servlet.ServletSecurityElement
 */
public class ServletSecurityElement extends javax.servlet.ServletSecurityElement{

    public ServletSecurityElement() { super(); }
    public ServletSecurityElement(HttpConstraintElement httpConstraintElement) { super(httpConstraintElement); }
    public ServletSecurityElement(Collection<HttpMethodConstraintElement> httpMethodConstraints) { super(httpMethodConstraints); }
    public ServletSecurityElement(HttpConstraintElement httpConstraintElement, Collection<HttpMethodConstraintElement> httpMethodConstraints) { super(httpConstraintElement,httpMethodConstraints); }
    public ServletSecurityElement(ServletSecurity annotation) { super(annotation); }

    public Collection<HttpMethodConstraintElement> getHttpMethodConstraints() { return super.getHttpMethodConstraints(); }
    public Collection<String> getMethodNames() { return super.getMethodNames(); }

}
