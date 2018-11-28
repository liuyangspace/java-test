package test.javaee.servlet;

import java.io.IOException;

public class Servlet extends javax.servlet.http.HttpServlet {
    protected void doPost(javax.servlet.http.HttpServletRequest request, javax.servlet.http.HttpServletResponse response) throws javax.servlet.ServletException, IOException {

    }

    int count = 0;

    protected void doGet(javax.servlet.http.HttpServletRequest request, javax.servlet.http.HttpServletResponse response) throws javax.servlet.ServletException, IOException {
        response.setStatus(200);
        response.setHeader("Content-Type","text/html;charset=utf-8");
        count++;
        response.getWriter().write("this is Servlet! 中文 count : "+count);
        response.getWriter().close();
    }
}
