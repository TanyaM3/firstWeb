<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Login</title>
</head>
<body>
	<h2>Login</h2>
	<form action="LoginServlet" method="post">
		<input type="hidden" name="command" value="forward" /> 
		Login:<input type="text" name="login" value="" /> 
		<br>
		<br>
		Password:<input type="password" name="password" value="" /> 
		<br>
		<br> 
		<input type="submit" value="Confirm" />
	</form>
</body>
</html>