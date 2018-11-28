package test.javaee.servlet.filter;

import test.javaee.jdbc.connection.ThreadLocalDataSourceUtil;

import javax.servlet.Filter;
import javax.servlet.*;
import java.io.IOException;
import java.sql.Connection;
import java.sql.SQLException;

public class ThreadLocalConnectionFilter implements Filter {

    @Override
    public void init(FilterConfig filterConfig) throws ServletException {

    }

    @Override
    public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain) throws IOException, ServletException {
        Connection connection = null;
        try {
            connection = ThreadLocalDataSourceUtil.getConnection();
            connection.setAutoCommit(false);
            chain.doFilter(request,response);
            connection.commit();
        }catch (Exception e){
            try {
                connection.rollback();
            } catch (SQLException e1) {
                e1.printStackTrace();
            }
        }finally {
            try {
                connection.close();
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }
    }

    @Override
    public void destroy() {

    }
}
