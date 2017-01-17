<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>User authentication</title>
</head>
<body>
<form action="/Lab1_2/login" method="post">
<label>Name</label><input type="text" name="username"><br>
<label>Password</label><input type="password" name="password"><br>
<input type="Submit" name="Submit" value="Submit">
<span>${message}</span>

</form>
</body>
</html>