package test.javaee.servlet.filter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.OutputStream;

public class Servlet extends HttpServlet {

    protected void doGet(HttpServletRequest req, HttpServletResponse resp)
            throws ServletException, IOException
    {
        resp.setHeader("Content-Type","text/html;charset=utf-8");
        OutputStream printWriter = resp.getOutputStream();
        printWriter.write("this is HttpServlet doGet<br/>".getBytes());
        printWriter.write("this is HttpServlet doGet<br/>".getBytes());
        //System.out.println("this is HttpServlet doGet<br/>");
        printWriter.close();
    }

}
