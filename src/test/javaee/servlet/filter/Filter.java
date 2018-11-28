package test.javaee.servlet.filter;

import javax.servlet.*;
import java.io.IOException;

public class Filter implements javax.servlet.Filter{

@Override
public void init(FilterConfig filterConfig) throws ServletException {
System.out.println("this is javax.servlet.Filter init<br/>");

}

@Override
public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain) throws IOException, ServletException {
response.getWriter().write("this is javax.servlet.Filter doFilter<br/>");
System.out.println("this is javax.servlet.Filter doFilter<br/>");
chain.doFilter(request,response);
}

@Override
public void destroy() {
System.out.println("this is javax.servlet.Filter destroy<br/>");
}
}
