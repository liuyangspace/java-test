package test.javaee.servlet;

import org.apache.catalina.core.StandardWrapperFacade;

import javax.servlet.Servlet;
import javax.servlet.*;
import java.io.IOException;

public class Hello implements Servlet {
    public Hello(){
        super();
        System.out.println("construct");
    }

    @Override
    public void init(ServletConfig servletConfig) throws ServletException {
        if(servletConfig instanceof StandardWrapperFacade){
            System.out.println("servletConfig is StandardWrapperFacade");
        }
        System.out.println("init");
        System.out.println(servletConfig.getInitParameter("init_key"));
    }

    @Override
    public ServletConfig getServletConfig() {
        System.out.println("getServletConfig");
        return null;
    }

    @Override
    public void service(ServletRequest servletRequest, ServletResponse servletResponse) throws ServletException, IOException {
        System.out.println("service");
        servletRequest.getParameterMap().forEach((a,b)->{
            System.out.println(a+" = "+b);
        });
        servletRequest.getServletContext().getServerInfo();
    }

    @Override
    public String getServletInfo() {
        System.out.println("getServletInfo");
        return null;
    }

    @Override
    public void destroy() {
        System.out.println("destroy");
    }
}
