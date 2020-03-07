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
<form action="updateprice">
修改价格：<input type="text"  name="price">
<input type="submit" value="提交">
</form>
<form action="updatenumber">
修改余量：<input type="text"  name="number">
<input type="submit" value="提交">
</form>
<a href="index.jsp">返回首页</a>
</body>
</html>