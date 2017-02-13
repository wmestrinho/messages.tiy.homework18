<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%--
  Created by IntelliJ IDEA.
  User: WagnerMestrinho
  Date: 2/12/17
  Time: 11:58 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>

<!DOCTYPE html>
<html lang="en">
<head>
    <title>The Wall</title>

    <meta charset="utf-8">
    <meta name="viewport" content="width=device-width, initial-scale=1">
    <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css">
    <script src="https://ajax.googleapis.com/ajax/libs/jquery/3.1.1/jquery.min.js"></script>
    <script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/js/bootstrap.min.js"></script>

</head>
<body>

<nav class="navbar navbar-inverse">
    <ul class="nav navbar-nav">
        <li><a href="/open/login.jsp"><h4>Login</h4></a></li>
        <li><a href="/secure/write.jsp"><h4>Start Writing</h4></a></li>
        <li><a href="/secure/wall.jsp"><h4>Wall</h4></a></li>
    </ul>

</nav>

<div class="container" align="center">
    <p><h1>LETTUCE SHARE ALL THE THINGS WE ARE GRATEFUL FOR</h1></p>
</div>
<div class="container" align="center">

    <c:forEach items="${mList}" var="aMovie">



    </c:forEach>
</div>

</body>
</html>
