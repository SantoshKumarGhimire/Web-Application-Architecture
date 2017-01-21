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

	<h3>Product Name :- &nbsp;${product.name}</h3>
	<div id="order">

		<form:form action="/Lab4/update" modelAttribute="product" method="post">
			<table>
				<tr>
					<td>Product Name</td>
					<td><form:input type="text" path="name" value="${product.name}"/></td>
				</tr>
				<tr>
					<td>Product ID</td>
					<td><form:input type="text" path="productId"
						value="${product.productId}"/></td>
				</tr>
				<tr>
					<td>Units in stock</td>
					<td><form:input type="text" path="unitsInStock"
						value="${product.unitsInStock}"/></td>
				</tr>
				<tr>
					<td>Unit Price</td>
					<td><form:input type="text" path="unitPrice"
						value="${product.unitPrice}"/></td>
				</tr>
				<tr>
					<td>Manufacturer</td>
					<td><form:input type="text" path="manufacturer"
						value="${product.manufacturer}"/></td>
				</tr>
		
				<tr>
					<td>Category</td>
					<td><form:input type="text" path="category"
						value="${product.category}"/></td>
				</tr>
				<tr>
					<td>Units in order</td>
					<td><form:input type="text" path="unitsInOrder"
						value="${product.unitsInOrder}"/></td>
				</tr>
				<tr>
					<td>Units in Stock</td>
					<td><form:input type="text" path="unitsInStock"
						value="${product.unitsInStock}"/></td>
				</tr>
				<tr>
					<td>Condition</td>
					<td><form:input type="text" path="condition"
						value="${product.condition}"/></td>
				</tr>
				<tr>
					<td></td>
					<td><input  type="submit"  value="update"/>
					</td>
				</tr>
			</table>
		</form:form>

	</div>

</body>
</html>