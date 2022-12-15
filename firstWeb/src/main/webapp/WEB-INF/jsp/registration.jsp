<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Registration</title>
</head>
<body>
	<h2>Registration</h2>
	<form action="RegistrationServlet" method="post">
		<input type="hidden" name="command" value="forward" /> 
		Login: <input type="text" name="login" /> 
		<br>
		<br> 
		Email: <input type="email" name="email" /> 
		<br>
		<br> 
		Password: <input type="password" name="password" /> 
		<br>
		<br>      
		<input type="submit" value="Confirm" />
	</form>
</body>
</html>