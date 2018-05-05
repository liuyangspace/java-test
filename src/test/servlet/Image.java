package test.servlet;

import javax.imageio.ImageIO;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.awt.*;
import java.awt.image.BufferedImage;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Random;

@WebServlet(name = "Image")
public class Image extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        response.setContentType("text/html;charset=utf-8");
        PrintWriter printWriter = response.getWriter();

        String imageStr = request.getSession().getAttribute("imageStr")==null?"":request.getSession().getAttribute("imageStr").toString();
        String image = request.getParameter("image");
        printWriter.print("imageStr = "+imageStr+"<br/>");
        printWriter.print("submit = "+image+"<br/>");
        if(!imageStr.equals("") && image.equals(imageStr)){
            printWriter.print("验证码正确"+image+"<br/>");
        }else{
            printWriter.print("验证码错误"+image+"<br/>");
        }
        printWriter.close();
        request.getSession().removeAttribute("imageStr");
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        response.setContentType("image/jpeg");

        int height = 40;
        int width = 100;
        BufferedImage image = new BufferedImage(width,height,BufferedImage.TYPE_INT_RGB);
        Graphics g = image.getGraphics();

        g.setColor(Color.BLACK);
        g.fillRect(0,0,width,height);
        g.setColor(Color.WHITE);
        g.fillRect(1,1,width-2,height-2);

        // char
        String charList = "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789";
        int charCount = 4;
        Random random = new Random();
        StringBuffer stringBuffer = new StringBuffer();
        for (int i = 0; i < charCount; i++) {
            String[] fontList = {"宋体","黑体","行楷","雅黑"};
            g.setFont(new Font(fontList[random.nextInt(4)],random.nextInt(3),30));

            g.setColor(new Color(random.nextInt(255),random.nextInt(255),random.nextInt(255)));
            int index = random.nextInt(charList.length());
            g.drawString(charList.substring(index,index+1),width*i/charCount,height-10);
            stringBuffer.append(charList.substring(index,index+1));
        }

        request.getSession().setAttribute("imageStr",stringBuffer);

        // line
        for (int i = 0; i < 10 ; i++) {
            g.setColor(new Color(random.nextInt(255),random.nextInt(255),random.nextInt(255)));
            g.drawLine(random.nextInt(width),random.nextInt(height),random.nextInt(width),random.nextInt(height));
        }

        ImageIO.write(image,"jpg",response.getOutputStream());
    }
}
