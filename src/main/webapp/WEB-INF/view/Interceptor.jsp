<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>拦截器页面</title>
</head>
<body>
<p>拦截器方法：<% out.print(request.getAttribute("message ")); %></p>

<p>处理器方法：${message1 }</p>
</body>
</html>