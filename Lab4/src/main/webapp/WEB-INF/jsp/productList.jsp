<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Product List</title>
</head>
<body>

 <div id="product-id">
	<c:forEach items="${productList}" var="product">
		<div class="boxed">
		<ul>
	<li><a href = "productDescription/${product.productId}">${product.productId}</a>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<a href="deleteProduct/${product.productId}">Delete</a></li> 
	
		</ul>
		</div>
	</c:forEach>
	</div>
</body>
</html>