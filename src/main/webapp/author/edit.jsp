<%--
  Created by IntelliJ IDEA.
  User: sonvu
  Date: 27/05/2022
  Time: 1:45 CH
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Sửa Tác Giả</title>
    <title>PHPJabbers.com | Free Book Online Store Website Template</title>
    <meta charset="utf-8" />
    <meta name="viewport" content="width=device-width, initial-scale=1, user-scalable=no" />
    <link rel="stylesheet" href="assets/bootstrap/css/bootstrap.min.css" />
    <link rel="stylesheet" href="assets/css/main.css" />
    <noscript><link rel="stylesheet" href="assets/css/noscript.css" /></noscript>
</head>
<body>
<header id="header">
    <div class="inner">

        <!-- Logo -->
        <a href="index.html" class="logo">
            <span class="fa fa-book"></span> <span class="title">Book Online Store Website</span>
        </a>
    </div>
</header>
<form method="post">
    <input type="text" name="name" value="${authorEdit.name}">
    <input type="text" name="id" value="${authorEdit.id}" hidden>
    <input type="submit" value="sửa">
</form>
</body>
</html>
