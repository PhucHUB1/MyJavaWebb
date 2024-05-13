<%@ page contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<%@ page import="java.util.Date" %>
<%@ page import="java.sql.*" %>
<!DOCTYPE html>
<html>
<head>
  <title>JSP - Hello World</title>
</head>
<body>
<h1><%= "Hello!" %></h1>
<h2>
  <%
     java.util.Date date = new java.util.Date();
  %>
    Now is : <%=date.toString() %>
</h2>
<h2><a href="login.jsp">login</a></h2>

<%--<a href="logout.jsp">logout</a>|--%>
<%--<a href="profile.jsp">profile</a>--%>

<br/>
<a href="hello-servlet">Hello Servlet</a>
</body>
</html>