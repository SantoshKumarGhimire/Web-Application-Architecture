<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<%@taglib prefix="spring" uri="http://www.springframework.org/tags"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<a href="?locale=en">Click to set English Language</a>
	<br />
	<a href="?locale=np">Click to set Nepali</a>
	<h1>Customer Entry Form</h1>
	<form:form action="customerEntry" method="post"
		modelAttribute="newCustomer">
		<table>
			<tr>
				<td><spring:message code="label.username"/></td>
				<td><form:input path="userName" /></td>
				<td><form:errors path="userName" cssStyle="color: red" /></td>
			</tr>
			<tr>
				<td><spring:message code="label.address"/></td>
				<td><form:input path="address" /></td>
				<td><form:errors path="address" cssStyle="color: red" /></td>
			</tr>
			<tr>
				<td><spring:message code="label.address"/></td>
				<td><form:input path="address" /></td>
				<td><form:errors path="address" cssStyle="color: red" /></td>
			</tr>

			<tr>
				<td><spring:message code="label.dob"/></td>
				<td><form:input path="birthDate" /></td>
				<td><form:errors path="birthDate" cssStyle="color: red" /></td>
			</tr>
			<tr>
				<td><spring:message code="label.password"/></td>
				<td><form:input type="password" path="password" /></td>
				<td><form:errors path="password" cssStyle="color: red" /></td>
			</tr>
			<tr>
				<td><spring:message code="label.sex"/></td>
				<td><form:radiobutton path="sex" value="M" /> Male <form:radiobutton
						path="sex" value="F" /> Female</td>
				<td><form:errors path="sex" cssStyle="color: red" /></td>
			</tr>

			<tr>
				<td></td>
				<td></td>
				<td><input type="Submit"></td>
			</tr>


		</table>
	</form:form>

</body>
</html>