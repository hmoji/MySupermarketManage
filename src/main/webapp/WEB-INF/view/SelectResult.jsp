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
<form action="update">
<input type="hidden" name="name" value="<%= request.getAttribute("nameresult") %>">
修改价格：<input type="text"  name="price" value="<%=request.getAttribute("priceresult")%>"><br/>
修改余量：<input type="text"  name="number" value="<%=request.getAttribute("numberresult")%>"><br/>
<input type="submit" value="提交">
</form>
<form action="delete">
<input type="hidden" name="name" value="<%= request.getAttribute("nameresult") %>">
<input type="submit" value="删除">
</form>
<a href="LoginWithSession">返回首页</a>
</body>
</html>