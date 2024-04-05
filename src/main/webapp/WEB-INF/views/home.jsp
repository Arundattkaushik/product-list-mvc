<%@page import="com.product.services.Service"%>
<%@page import="com.product.entities.Product"%>
<%@page import="java.util.List"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<%@include file="bootstrap.jsp"%>
<title>Home</title>

<%
List<Product> products = Service.getProductList();
%>
</head>
<body>

	<div class="container">
		<div class="row">
			<div class="col-md-12">
				<h1 class="text-center mb-3">Welcome to Product App</h1>

				<table class="table">
					<thead class="thead-dark">
						<tr>
							<th scope="col">ID</th>
							<th scope="col">Name</th>
							<th scope="col">Description</th>
							<th scope="col">Price</th>
							<th scope="col">Action</th>
						</tr>
						<%
						for (Product product : products) {
						%>
						<%

						%>
					</thead>
					<tbody >
						<tr>

							<th scope="row"><%=product.getId()%></th>
							<td><a href="view-product?p_id=<%=product.getId()%>"><%=product.getName()%></a></td>
							<td><%=product.getDescription()%></td>
							<td><%=product.getPrice()%></td>
							<td> 
							<a href="delete-product?p_id=<%=product.getId()%>"><i class="fa-solid fa-trash"></i></a>
							<a href="edit-prod?p_id=<%=product.getId()%>"><i class="fa-solid fa-pen-to-square"></i></a>
							</td>
						</tr>
					</tbody>
					<%
					}
					%>
				</table>

				<div class="container text-center"><a class="btn btn-primary m-2" href="add-product">Add</a></div>
			</div>
		</div>
	</div>

</body>
</html>