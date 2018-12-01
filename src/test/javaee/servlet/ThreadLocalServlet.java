package test.javaee.servlet;

import test.javaee.jdbc.connection.ThreadLocalDataSourceUtil;

import java.io.IOException;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class ThreadLocalServlet extends javax.servlet.http.HttpServlet {
    protected void doPost(javax.servlet.http.HttpServletRequest request, javax.servlet.http.HttpServletResponse response) throws javax.servlet.ServletException, IOException {

    }

    int count = 0;

    protected void doGet(javax.servlet.http.HttpServletRequest request, javax.servlet.http.HttpServletResponse response) throws javax.servlet.ServletException, IOException {
        request.setCharacterEncoding("UTF-8");
        response.setStatus(200);
        response.setHeader("Content-Type","text/html;charset=utf-8");
        count++;
        response.getWriter().write("this is ThreadLocalServlet! "+(new String("中文".getBytes("UTF-8")))+" count : "+count);
        response.getWriter().write("<br/><a href=\'/threadLocal?a=1\'>test1</a>");
        response.getWriter().write("<br/><a href=\'/threadLocal?a=2\'>test2</a>");

        if("1".equals(request.getParameter("a"))){
            try {
                Connection connection = ThreadLocalDataSourceUtil.getConnection();
                String sql = "INSERT INTO user (name,sex) VALUE (?,?)";
                PreparedStatement preparedStatement = connection.prepareStatement(sql);
                preparedStatement.setString(1,"liming");
                preparedStatement.setInt(2,1);
                int resultSet = preparedStatement.executeUpdate();
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }

        if("2".equals(request.getParameter("a"))){
            try {
                Connection connection = ThreadLocalDataSourceUtil.getConnection();
                String sql = "INSERT INTO user (name,sex) VALUE (?,?)";
                PreparedStatement preparedStatement = connection.prepareStatement(sql);
                preparedStatement.setString(1,"liming31");
                preparedStatement.setInt(2,1);
                preparedStatement.executeUpdate();
                preparedStatement.setString(1,"liming41");
                preparedStatement.setInt(2,1);
                preparedStatement.executeUpdate();
                //throw new Exception("test");
            } catch (Exception e) {
                throw new javax.servlet.ServletException();
            }
        }

        response.getWriter().close();
    }
}
