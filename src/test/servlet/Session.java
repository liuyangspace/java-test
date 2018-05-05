package test.servlet;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.Cookie;
import javax.servlet.http.*;
import java.io.IOException;

@WebServlet(name = "Session")
public class Session extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        HttpSession httpSession = request.getSession();
        Cookie cookie = new Cookie("JSESSIONID",httpSession.getId());
        cookie.setMaxAge(60*60);
        response.getWriter().print(httpSession.getId());
        response.getWriter().print("<a href=\""+response.encodeURL("/session")+"\">test</a>");
        response.addCookie(cookie);
    }
}
