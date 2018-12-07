package javaee.servlet.http;

import javax.servlet.http.MappingMatch;

/**
 * Represents how the request from which this object was obtained was mapped to
 * the associated servlet.
 *
 * @see javax.servlet.http.HttpServletMapping
 */
public interface HttpServletMapping extends javax.servlet.http.HttpServletMapping{

    String getMatchValue();
    String getPattern();
    String getServletName();
    MappingMatch getMappingMatch();

}
