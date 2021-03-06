package javaee.servlet.filter;

import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import java.io.IOException;

/**
 * A FilterChain is an object provided by the servlet container to the developer
 * giving a view into the invocation chain of a filtered request for a resource.
 * Filters use the FilterChain to invoke the next filter in the chain, or if the
 * calling filter is the last filter in the chain, to invoke the resource at the
 * end of the chain.
 *
 * @see javax.servlet.FilterChain
 */
public interface FilterChain {

    public void doFilter(ServletRequest request, ServletResponse response) throws IOException, ServletException;

}
