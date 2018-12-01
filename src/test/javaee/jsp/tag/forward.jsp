<%--
  Created by IntelliJ IDEA.
  User: VULCAN
  Date: 2018/5/6
  Time: 16:27
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>

${pageContext.request.characterEncoding="utf-8"}

<jsp:forward page="../pageError.jsp">
    <jsp:param name="name" value="黎明"/>
</jsp:forward>

</body>
</html>
