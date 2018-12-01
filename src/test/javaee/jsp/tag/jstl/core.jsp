<%--
  Created by IntelliJ IDEA.
  User: VULCAN
  Date: 2018/5/6
  Time: 18:35
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
    <hr/>
    <h3>set</h3>
    <c:set var="name" value="<a href='#'>liming</a>" scope="page"/>
    <c:set var="age" value="18" scope="page"/>

    <hr/>
    <h3>remove</h3>
    <c:remove var="age"/>

    <hr/>
    <h3>out</h3>
    ${name}
    <br/>
    <c:out value="${name}"/>

    <hr/>
    <h3>if</h3>
    <c:if test="${!empty name}">
        name is not empty
    </c:if>

    <hr/>
    <h3>choice</h3>
    <c:choose>
        <c:when test="${empty name}">
            name is empty
        </c:when>
        <c:when test="${!empty age}">
            age is empty
        </c:when>
        <c:otherwise>
            default otherwise
        </c:otherwise>
    </c:choose>

    <hr/>
    <h3>forEach</h3>
    <c:forEach items="${headerValues}" var="headerValue">
        ${headerValue.key} =
        <c:forEach items="${headerValue.value}" var="value">
            ${value} ;
        </c:forEach>
        <br/>
    </c:forEach>

</body>
</html>
