<%@page import="com.product.entities.Product"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<%@include file="bootstrap.jsp" %>
<title>Product: List</title>
<%
Product product = (Product) request.getAttribute("product");
%>
</head>
<body>
	<div class="container">
		<div class="row">
			<div class="col-md-12">
				<h1 class="text-center mb-3">Product List</h1>
			</div>
		</div>
	</div>

	<%-- 

<div class="container">
<h2>Product List</h2>
Product Id: <br>
Product Name: <%=product.getName() %><br>
Product Description: <%=product.getDescription() %><br>
Product Price: <%=product.getPrice() %>
</div>

 --%>
</body>
</html>