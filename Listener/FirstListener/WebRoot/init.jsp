<%@page import="com.fehead.entity.User"%>
<%@ page language="java" import="java.util.*" contentType="text/html; charset=utf-8"%>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";

request.setAttribute("requestName", "requestValue");
request.getSession().setAttribute("sessionName", "sessionValue");
request.getSession().getServletContext().setAttribute("contextName", "contextValue");

request.getSession().setAttribute("user", new User());
%>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
  <head>
    <base href="<%=basePath%>">
    
    <title>My JSP 'init.jsp' starting page</title>
    
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
    This is init jsp.
    <input type="button" value="init" onclick="window.location.href='init.jsp'"/>
    <input type="button" value="destroy" onclick="window.location.href='destroy.jsp'">
  </body>
</html>
