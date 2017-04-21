<%@ page language="java" contentType="text/html; charset=utf-8"
         pageEncoding="utf-8"%>
<!DOCTYPE html>
<%--<%@ taglib prefix="c" uri="http://java.sun.com/jstl/core"%>--%>
<html lang="zh-cn">
<head>
    <meta charset="utf-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1">

    <title>用户登录</title>
    <link rel="stylesheet" href="/css/bootstrap.min.css">
    <link rel="stylesheet" href="/css/customer/login.css">
</head>
<!-- CSS件 -->

<body>
<div class="container">
    <form class="form-signin" action="register" method="post">
        <h2 class="form-signin-heading">Please sign in</h2>
        <div class="error-code">${err_code}</div>
        <input type="text" class="form-control" placeholder="Email address" required autofocus name="username" value="${username}">
        <input type="password" class="form-control" placeholder="Password" required name="password" value="${password}">
        <button class="btn btn-lg btn-primary btn-block" type="submit">Sign up</button>
        <button class="btn btn-lg btn-primary btn-block" type="submit">Sign in</button>

    </form>
</div>

<script src="/js/jquery.js"></script>
<script src="/js/bootstrap.min.js"></script>
</body>
</html>