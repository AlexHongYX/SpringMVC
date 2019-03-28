<%@ page language="java" import="java.util.*" contentType="text/html; charset=utf-8"%>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
  <head>
    <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
    <title>Add User From</title>

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
