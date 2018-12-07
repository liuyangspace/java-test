package javaee.servlet.http;

import javax.servlet.annotation.ServletSecurity;

/**
 * Equivalent of {@link javax.servlet.annotation.HttpConstraint} for
 * programmatic configuration of security constraints.
 *
 * @since Servlet 3.0
 * @see javax.servlet.HttpConstraintElement
 */
public class HttpConstraintElement extends javax.servlet.HttpConstraintElement{

    public HttpConstraintElement() {super();}
    public HttpConstraintElement(ServletSecurity.EmptyRoleSemantic emptyRoleSemantic) {super(emptyRoleSemantic);}
    public HttpConstraintElement(ServletSecurity.TransportGuarantee transportGuarantee, String... rolesAllowed) {super(transportGuarantee,rolesAllowed);}
    public HttpConstraintElement(ServletSecurity.EmptyRoleSemantic emptyRoleSemantic, ServletSecurity.TransportGuarantee transportGuarantee, String... rolesAllowed) {super(emptyRoleSemantic,transportGuarantee,rolesAllowed);}

    public ServletSecurity.EmptyRoleSemantic getEmptyRoleSemantic() { return super.getEmptyRoleSemantic(); }
    public ServletSecurity.TransportGuarantee getTransportGuarantee() { return super.getTransportGuarantee(); }
    public String[] getRolesAllowed() { return super.getRolesAllowed(); }

}
