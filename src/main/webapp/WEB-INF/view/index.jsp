<%@page import="smmanage.entity.Staff"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="utf-8">
<title>首页</title>
</head>
<body>
<h3>在使用前请确定mysql安全模式已关闭</h3>
当前用户：<%Staff staff=(Staff)request.getSession().getAttribute("STAFF_SESSION");
			out.print(staff.getName());%><br/>
商品查询：<br/>
<form action="select">
<input type="text" name="name">
<input type="submit" value="查询"></form><br/>

<form action="queryAll">
<input type="submit" value="查询所有商品">
</form>

增加商品：<br/>
<form action="add" method="post" >
名称：<input type="text" name="name"><br/>
价格：<input type="text" name="price"><br/>
数量：<input type="text" name="number"><br/>
<input type="submit" value="提交">
</form>

批量增加商品：<br/>
<form action="multipleAdd">
<input type="text" name="multipleAdd" style="width: 200px;height: 200px" placeholder="单个商品的属性请用“，”分割，多个商品之间请用逗号“-”分割">
</form>

</body>
</html>