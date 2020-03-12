<%@ page language="java" contentType="text/html; charset=utf-8"
    pageEncoding="utf-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="utf-8">
<title>删除结果</title>
</head>
<body>
<% out.print(request.getAttribute("deleteresult")); %><br/>
<a href="LoginWithSession">返回首页</a>
</body>
</html>