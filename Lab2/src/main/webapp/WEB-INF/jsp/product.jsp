<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<link rel="stylesheet" href="../resources/style.css">
<title>Insert title here</title>
</head>
<body>
	<div id="item-property">

		<h3>Product Name :- &nbsp;${product.name}</h3>
		<div id="order">
			<form action="/Lab2/orderProduct" method="get">
				<input type="hidden" name="productId" value="${product.productId}">
				<label>Quantity</label><input type="text" name="order">
				 <input type="submit" name="order" value="order">

			</form>
		</div>

		<table>
			<tr>
				<td>Product Name</td>
				<td>${product.name}</td>
			</tr>
			<tr>
				<td>Product ID</td>
				<td>${product.productId}</td>
			</tr>
			<tr>
				<td>Units in stock</td>
				<td>${product.unitsInStock}</td>
			</tr>
			<tr>
				<td>Unit Price</td>
				<td>${product.unitPrice}</td>
			</tr>
			<tr>
				<td>Manufacturer</td>
				<td>${product.manufacturer}</td>
			</tr>
			<tr>
				<td>Description</td>
				<td>${product.description}</td>
			</tr>
			<tr>
				<td>Category</td>
				<td>${product.category}</td>
			</tr>
			<tr>
				<td>Units in order</td>
				<td>${product.unitsInOrder}</td>
			</tr>
			<tr>
				<td>Units in Stock</td>
				<td>${product.unitsInStock}</td>
			</tr>
			<tr>
				<td>Condition</td>
				<td>${product.condition}</td>
			</tr>



		</table>

	</div>

</body>
</html>