<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<table>
		<tr>
			<td>Username</td>
			<td>${customer.getUserName()}</td>
		</tr>
		<tr>
			<td>Address</td>
			<td>${customer.getAddress()}</td>
		</tr>
		<tr>
			<td>Birthdate</td>
			<td>${customer.getBirthDate()}</td>
		</tr>
		<tr>
			<td>Password</td>
			<td>${customer.getPassword()}</td>
		</tr>
		<tr>
			<td>Sex</td>
			<td>${customer.getSex()}</td>
		</tr>

	</table>
</body>
</html>