<%@ page language="java" import="java.util.*" contentType="text/html; charset=utf-8""%>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
  <head>
    <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
	<title>Spring4 MVC - HelloWorld</title>

  </head>
  
  <body>
  	<!-- el表达式的使用
  		${greeting},容器会依次从pageContext,request,session,application中
  		查找(getAttribute)绑定名称为greeting的对象
  		 -->
    <h1>${greeting}</h1>
  </body>
</html>
