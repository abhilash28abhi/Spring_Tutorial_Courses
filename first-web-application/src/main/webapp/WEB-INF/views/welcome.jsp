<%@page language="java" contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>My Welcome JSP</title>
</head>
	<form action="/welcome.do" method="post">
	<p><font color="red">${errorMessage}</font></p>
		Enter your name : <input type="text" name="name"/>
		Enter your password : <input type="password" name="password"/>
		<input type="submit" value="login"/>
	</form>
<body>
</body>
</html>