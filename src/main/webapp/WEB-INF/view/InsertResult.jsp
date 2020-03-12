<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>插入结果</title>
</head>
<body>
<% out.print(request.getAttribute("insertresult")); %><br/>
<a href="LoginWithSession">返回首页</a>
</body>
</html>