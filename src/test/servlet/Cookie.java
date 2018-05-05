package test.servlet;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;
import java.net.URLEncoder;

@WebServlet(name = "Cookie")
public class Cookie extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        PrintWriter printWriter = response.getWriter();
        javax.servlet.http.Cookie[] cookies = request.getCookies();
        if(cookies.length == 0){
            printWriter.println("no cookie <br/>");
        }else{
            for (javax.servlet.http.Cookie cookie : cookies){
                printWriter.println(cookie.getName()+" = "+cookie.getValue());
                printWriter.println("<br/>");
            }
        }

        printWriter.close();
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

        javax.servlet.http.Cookie cookie = new javax.servlet.http.Cookie("test","123456");
        response.setContentType("text/html;charset=utf-8");
        cookie.setMaxAge(60*60*24);
        cookie.setPath("/");
        response.addCookie(cookie);

        javax.servlet.http.Cookie cookie2 = new javax.servlet.http.Cookie("cn", URLEncoder.encode("中文"));
        response.addCookie(cookie2);

        PrintWriter printWriter = response.getWriter();
        printWriter.print("<form method=\"POST\"><button type=\"submit\">提交</button></form>");
        printWriter.close();
    }
}
