<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>错误！</title>
</head>
<body>
<% out.print(request.getAttribute("selectresult")); %><br/>
<a href="index.jsp">返回首页</a>
</body>
</html>