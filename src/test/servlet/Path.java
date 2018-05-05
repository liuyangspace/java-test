package test.servlet;

import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.*;
import java.net.URLEncoder;

public class Path extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        System.out.println(request);
        request.setCharacterEncoding("UTF-8");
        response.setContentType("text/html;charset=UTF-8");
        Writer writer = response.getWriter();
        ServletContext servletContext = this.getServletContext();
        String url = request.getRequestURL().toString();

        String recentPath = request.getParameter("recentPath");

        if(recentPath==null) {
            recentPath = servletContext.getRealPath("");
            recentPath = recentPath.substring(0,recentPath.length()-1);
        }

        //recentPath = URLEncoder.encode(recentPath);
        File file = new File(recentPath);

        if(file.isDirectory()){
            String backPath = recentPath;
            backPath = backPath.substring(0,backPath.lastIndexOf("\\"));
            //writer.write("<a href=\""+url+"?recentPath="+URLEncoder.encode(recentPath+"./")+"\">.</a><br>");
            writer.write("<a href=\""+url+"?recentPath="+URLEncoder.encode(backPath)+"\">..</a><br>");
            String[] list = file.list();
            for (int j = 0; j < list.length; j++) {
                String link = url+"?recentPath="+URLEncoder.encode(recentPath+"\\"+list[j]);
                writer.write("<a href=\""+link+"\">"+list[j]+"</a><br/>");
            }
        }else if (file.isFile()) {
            if(file.getTotalSpace()>1024*1024){
                writer.write("文件过大");
            }else {
                Reader reader = new InputStreamReader(new FileInputStream(file));
                char[] chars = new char[1024];
                StringBuilder stringBuffer = new StringBuilder();
                while (reader.read(chars)>-1){
                    stringBuffer.append(chars);
                }
                reader.close();
                writer.write(stringBuffer.toString());
            }
        }
        //writer.write(realPath);
        //writer.write(recentPath);
        writer.close();
    }
}
