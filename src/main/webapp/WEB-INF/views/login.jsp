
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Login Page</title>
</head>
<body>
<form action="startmenu" th:href="@{/name}" th:object="${userName}" method="post"> 
<input type="text" name="userName"><br>
<input type="submit" value="Login">
</form>
</body>
</html>
<!--  
<!DOCTYPE HTML>
<html xmlns:th="http://www.thymeleaf.org">
<head>
    <title>Getting Started: Handling Form Submission</title>
    <meta http-equiv="Content-Type" content="text/html; charset=UTF-8" />
</head>
<body>
	<h1>Form</h1>
    <form action="startmenu" href="@{/name}" th:object="${userName}" method="post">
       <input type="text" name="userName"><br>
       <input type="submit" value="Login"> </form>
</body>
</html> -->