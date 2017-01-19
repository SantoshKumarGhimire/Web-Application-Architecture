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
<div id="header">
<h1>Please check the available products of our store</h1>
</div>
   <div id="product-id">
	<c:forEach items="${products}" var="product">
		<div class="boxed">
		<ul>
		
		<li><a href = "product/${product.productId}" ><h3>Item ID :- ${product.productId}&nbsp;&nbsp;<button>View Details</button></span></h3></a></li>
		</ul>
		</div>
	</c:forEach>
	</div>
</body>
</html>