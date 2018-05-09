<%@ page import="javafx.application.Application" %><%--
  Created by IntelliJ IDEA.
  User: VULCAN
  Date: 2018/5/6
  Time: 11:21
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ page isErrorPage="true" errorPage="pageError.jsp" %>
<html>
<head>
    <title>Title</title>
</head>
<body>

<%
    System.out.println(request);
    System.out.println(response);
    System.out.println(pageContext);
    System.out.println(session);
    System.out.println(exception==null?"":exception.getMessage());
    System.out.println(application);
    System.out.println(config);
    System.out.println(out);
    System.out.println(page);

    pageContext.setAttribute("user","test");
    pageContext.setAttribute("user","test_request",PageContext.REQUEST_SCOPE);
    pageContext.setAttribute("user","test_session",PageContext.SESSION_SCOPE);
    pageContext.setAttribute("user","test_application",PageContext.APPLICATION_SCOPE);
%>

<%=pageContext.getAttribute("user")%><br/>
<%=pageContext.getAttribute("user",PageContext.REQUEST_SCOPE)%><br/>
<%=pageContext.getAttribute("user",PageContext.SESSION_SCOPE)%><br/>
<%=pageContext.getAttribute("user",PageContext.APPLICATION_SCOPE)%><br/>
<hr/>
<%=pageContext.findAttribute("user")%><br/>

</body>
</html>
