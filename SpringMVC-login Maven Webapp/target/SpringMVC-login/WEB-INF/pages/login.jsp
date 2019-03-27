<%@ page language="java" import="java.util.*" contentType="text/html; charset=utf-8""%>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
  <head>
    <base href="<%=basePath%>">
    
    <title>Add User From</title>
    
	<meta http-equiv="pragma" content="no-cache">
	<meta http-equiv="cache-control" content="no-cache">
	<meta http-equiv="expires" content="0">    
	<meta http-equiv="keywords" content="keyword1,keyword2,keyword3">
	<meta http-equiv="description" content="This is my page">
	<!--
	<link rel="stylesheet" type="text/css" href="styles.css">
	-->

  </head>
  
  <body>
  	<h2>创建用户</h2>
    <form action="create">
    	<table>
    		<tr>
    			<td>username:</td>
    			<td><input type="text" name="username" value=""/></td>
    		</tr>
    		<tr>
    			<td>age:</td>
    			<td><input type="text" name="age" value=""/></td>
    		</tr>
    		<tr>
    			<td>password:</td>
    			<td><input type="password" name="password" value=""/></td>
    		</tr>
    		<tr>
    			<td><input type="submit" value="Create"/></td>
    		</tr>
    	</table>
    </form>

  </body>
</html>
