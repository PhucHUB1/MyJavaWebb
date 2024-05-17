<%--
  Created by IntelliJ IDEA.
  User: phuch
  Date: 5/17/2024
  Time: 9:37 AM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Product Management</title>
    <h1>Product List</h1>

    <br/>
    <from action="ProductController" method="post">
        <input type="hidden" name="action" value="add">
        Name:<input type="text" name="name"><br/>
        Price:<input type="text" name="price"><br/>
        <input type="submit" value="Add Product">
    </from>


</head>
<body>

</body>
</html>
