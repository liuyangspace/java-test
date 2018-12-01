<%--
  Created by IntelliJ IDEA.
  User: VULCAN
  Date: 2018/5/8
  Time: 21:35
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ page isErrorPage="true" errorPage="calculator.jsp" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
    <jsp:useBean id="cal" class="test.javaee.jsp.Calculator"/>
    <jsp:setProperty name="cal" property="*"/>
    <c:if test="${empty pageContext.exception}">
        <%
            cal.run();
        %>
    </c:if>

    <hr>
    计算结果：   ${cal.var1}  ${cal.operator}   ${cal.var2}  =   ${cal.result}
    <hr>
    <c:url var="thisUrl" value="/jsp/tag/jstl/calculator.jsp"/>
    <form action="${thisUrl}" method="post">
        <table>
            <tr>
                <td>参数1</td>
                <td><input type="text" name="var1" value="${cal.var1}"/></td>
            </tr>
            <tr>
                <td>运算</td>
                <td>
                    <select name="operator" >
                        <option value="+">+</option>
                        <option value="-">-</option>
                        <option value="*">*</option>
                        <option value="/">/</option>
                    </select>
                </td>
            </tr>
            <tr>
                <td>参数2</td>
                <td><input type="text" name="var2" value="${cal.var2}"/></td>
            </tr>
            <tr>
                <td></td>
                <td><input type="submit" name="提交" value="提交"/></td>
            </tr>
        </table>
    </form>
</body>
</html>
