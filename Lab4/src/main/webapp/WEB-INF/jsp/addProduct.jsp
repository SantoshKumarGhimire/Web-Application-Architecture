<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@taglib prefix="form" uri="http://www.springframework.org/tags/form"%>

<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>

	<form:form modelAttribute="newProduct" method="post">
		<form:errors path="*" element="div" />
	Product ID:
	<form:input path="productId" />
		<br /> Product Name:
	<form:input path="name" />
		<br /> Description:
	<form:textarea path="description" />
		<br /> Discontinued:
	<form:checkbox path="discontinued" />
		<br /> Condition:
	<form:radiobutton path="condition" value="New" />
	New
	<form:radiobutton path="condition" value="Old" />
	Old
	<form:radiobutton path="condition" value="Refurbished" />
	Refurbished
	<input type="submit" value="Add" />
	</form:form>
<a href="../productlist">View Product List</a><br>
</body>
</html>