<%@ page import="com.example.myjavaweb.LoginBean" %>
<%@ page import="entity.Users" %><%--
  Created by IntelliJ IDEA.
  User: phuch
  Date: 5/10/2024
  Time: 11:37 AM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Login Controller</title>
</head>
<body>
<%
    //Step1: Call Controller
    String username = request.getParameter("username");
    String password = request.getParameter("password");

    //Step2: Call instance of JavaBean(Model)
    LoginBean loginBean = new LoginBean();
    boolean status = loginBean.checkLogin(username,password);
    if (status) {
%>

<jsp:forward page="success.jsp"></jsp:forward>

<%
} else {
%>

<jsp:forward page="failure.jsp"></jsp:forward>
<%
    }%>
</body>
</html>

