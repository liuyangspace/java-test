package test.servlet;

import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.Reader;
import java.io.Writer;
import java.util.Iterator;

public class Http extends HttpServlet {
    public void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

        Writer writer = resp.getWriter();
        ServletContext servletContext = this.getServletContext();

        writer.write(servletContext.getRealPath("/index.jsp"));
        writer.write("<br/>");

        writer.write(servletContext.getResource("index.jsp").getPath());
        writer.write("<br/>");

        Reader reader = new InputStreamReader(servletContext.getResourceAsStream("index.html"));
        char[] chars = new char[1024];
        StringBuilder stringBuffer = new StringBuilder();
        while (reader.read(chars)>-1){
            stringBuffer.append(chars);
        }
        reader.close();
        writer.write(stringBuffer.toString());
        writer.write("<br/>");

        writer.write(Http.class.getClassLoader().getResource("").getPath());
        writer.write("<br/>");

        Iterator<String> iterator = servletContext.getInitParameterNames().asIterator();
        while (iterator.hasNext()){
            String key = iterator.next();
            writer.write(key+" = "+servletContext.getInitParameter(key));
            writer.write("<br/>");
        }
        writer.close();
    }
}
