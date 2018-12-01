<%--
  Created by IntelliJ IDEA.
  User: VULCAN
  Date: 2018/5/13
  Time: 9:41
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/functions" prefix="fn"%>
<%@ taglib uri="http://myFunction.com" prefix="myFn"%>
<html>
<head>
    <title>Title</title>
</head>
<body>
    <hr/>
    ${fn:toUpperCase("this is fn:toUpperCase test")}<br/>

    <hr/>
    ${myFn:upperCase("this is myFn:upperCase test")}<br/>

</body>
</html>
