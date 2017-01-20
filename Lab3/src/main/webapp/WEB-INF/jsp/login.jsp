<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<link rel="stylesheet" href="resources/style.css">
<title>Insert title here</title>
</head>
<body>
	<div class="login">
		<form action="welcome" method="POST" modelAttribute="user">
			<span class="text-danger">${err_msg}</span> <input type="text"
				placeholder="Username" value="${cookie.userName.value }"
				id="username" name="username"> <input type="password" placeholder="password" name="password" id="password">
				 <label><input type="checkbox" name="remember"
				<c:if test="${cookie.containsKey('userName') }">checked</c:if> />remember me ? 
			</label> <input type="submit" name="submit" value="Login">
		</form>
		<div class="shadow"></div>


	</div>
</body>
</html>

