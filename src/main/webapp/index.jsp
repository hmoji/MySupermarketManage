<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="utf-8">
<title>首页</title>
</head>
<body>
商品查询：<br/>
<form action="select">
<input type="text" name="name">
<input type="submit" value="查询"></form><br/>

增加商品：<br/>
<form action="add" method="post">
名称：<input type="text" name="name"><br/>
价格：<input type="text" name="price"><br/>
数量：<input type="text" name="number"><br/>
<input type="submit" value="提交">
</form>

</body>
</html>