<%@ page import="java.util.HashMap" %><%--
  Created by IntelliJ IDEA.
  User: VULCAN
  Date: 2018/5/12
  Time: 15:39
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib uri="http://myTag.com" prefix="my"%>
<html>
<head>
    <title>Title</title>
</head>
<body>

    <hr/>
    <my:data/>

    <hr/>
    <my:compare var1="1" var2="2"/><br/>
    <my:compare var1="2" var2="2"/><br/>
    <my:compare var1="3" var2="2"/><br/>

    <hr/>
    <my:fileReader url="index.jsp"/>

    <hr/>
    <my:upperCase>this is test!</my:upperCase>

    <hr/>

    <my:foreach start="1" end="9" step="1" var="var">
        ${var}
    </my:foreach>
    <br/>
    <%
        String[] str = {"asd","sdasas","sdasas"};
        pageContext.setAttribute("str",str);
    %>
    <my:foreach var="strValue" in="${str}">
        ${strValue}
    </my:foreach>
    <br/>
    <%
        HashMap<String,String> map = new HashMap<String,String>();
        map.put("sasa","asasasq");
        map.put("sadsa","asqqsa");
        map.put("asqsa","qsasasqsq");
        pageContext.setAttribute("map",map);
    %>
    <my:foreach var="mapValue" in="${map}">
        ${mapValue.key} = ${mapValue.value} ,
    </my:foreach>

</body>
</html>
