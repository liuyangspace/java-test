<%--
  Created by IntelliJ IDEA.
  User: VULCAN
  Date: 2018/5/6
  Time: 14:06
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>

<%!
    public class User {
        private String name;

        public User(String name){
            this.name=name;
        }

        public void setNickname(String name){
            this.name=name;
        }

        public String getNickname(){
            return this.name;
        }
    }
%>

<%
    pageContext.setAttribute("user","test");
    pageContext.setAttribute("user","test_request",PageContext.REQUEST_SCOPE);

    User userBean = new User("test_bean");
    pageContext.setAttribute("user",userBean,PageContext.SESSION_SCOPE);

%>

<br/>${user}
<br/>${requestScope.user}
<br/>${sessionScope.user.nickname}

</body>
</html>
