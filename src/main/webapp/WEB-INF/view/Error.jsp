<%@ page language="java" contentType="text/html; charset=utf-8"
    pageEncoding="utf-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="utf-8">
<title>错误页面</title>
</head>
<body>
额....出现了一些错误。<br/>
<%=request.getAttribute("result") %><br/>
<a href="login.jsp">返回登录</a>
</body>
</html>