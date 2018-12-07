package javaee.servlet.http;

/**
 * Represents the ways that a request can be mapped to a servlet
 *
 * @see javax.servlet.http.MappingMatch
 */
public enum MappingMatch {
    CONTEXT_ROOT,
    DEFAULT,
    EXACT,
    EXTENSION,
    PATH
}
