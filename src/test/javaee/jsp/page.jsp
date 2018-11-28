<%--
  Created by IntelliJ IDEA.
  User: VULCAN
  Date: 2018/5/5
  Time: 18:23
  To change this template use File | Settings | File Templates.
--%>
<%--<%@ page contentType="text/html;charset=UTF-8" javase="java" %>--%>
<%@page pageEncoding="UTF-8" %>
<%@page contentType="text/html; charset=UTF-8" %>
<%@page import="java.util.*" %>
<%@page info="my jsp" %>
<%@page session="true" %>
<%@page extends="org.apache.jasper.runtime.HttpJspBase" %>
<%@page isErrorPage="true" errorPage="pageError.jsp" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
    this is jsp page.
<%
    List list = new ArrayList();

    if(!session.isNew()){
        throw new RuntimeException();
    }

%>
</body>
</html>
