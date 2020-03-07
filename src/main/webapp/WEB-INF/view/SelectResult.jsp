<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@ page isELIgnored="false" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="utf-8">
<title>查询结果</title>
</head>
<body>
转发成功！<br/>
查询结果：<% out.print(request.getAttribute("selectresult")); %><br/>
<a href="index.jsp">返回首页</a>
</body>
</html>