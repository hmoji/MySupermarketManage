<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<% out.print(request.getAttribute("updateresult")); %><br/>
<a href="index.jsp">返回首页</a>
<a href="SelectResult.jsp">继续添加</a>
</body>
</html>