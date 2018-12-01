<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page import="java.util.Map" %>
<%@ page import="java.util.HashMap" %><%--
  Created by IntelliJ IDEA.
  User: VULCAN
  Date: 2018/5/8
  Time: 20:55
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<%!
    public class Book{
        private String name;
        private String price;

        public String getPrice() {
            return price;
        }

        public Book(String name, String price) {
            this.name = name;
            this.price = price;
        }

        public void setPrice(String price) {
            this.price = price;
        }

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }
    }
%>

<%
    Map<String,Book> item.books = new HashMap<String,Book>();
    books.put("book1",new Book("数学","1.2"));
    books.put("book2",new Book("语文","1.3"));
    books.put("book3",new Book("英语","1.4"));

    pageContext.setAttribute("item/books",books);
%>

    <table border="1">
        <tr>
            <td>ID</td>
            <td>name</td>
            <td>price</td>
        </tr>

        <c:forEach items="${books}" var="book">
            <tr>
                <td>${book.key}</td>
                <td>${book.value.name}</td>
                <td>${book.value.price}</td>
            </tr>
        </c:forEach>

    </table>
</body>
</html>
