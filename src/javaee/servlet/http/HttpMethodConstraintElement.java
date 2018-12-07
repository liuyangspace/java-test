package javaee.servlet.http;

import javax.servlet.HttpConstraintElement;

/**
 * TODO SERVLET3 - Add comments
 *
 * @see javax.servlet.HttpMethodConstraintElement
 */
public class HttpMethodConstraintElement extends javax.servlet.HttpMethodConstraintElement {

    public HttpMethodConstraintElement(String methodName) {super(methodName);}
    public HttpMethodConstraintElement(String methodName, HttpConstraintElement constraint) {super(methodName,constraint);}
    public String getMethodName() {return super.getMethodName();}

}
