<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Add: Product</title>

<%@include file="bootstrap.jsp" %>
</head>
<body>
<div class="container  mt-2 text-center">
	<h2>Add a product</h2>
</div>

	<div class="container  col-md-4 offset-mb-4">

		<form action="create-product" method="post">
		
			<div class="mb-3">
				<label class="form-label">Name</label> 
				<input type="text" class="form-control" name="name" required="required">
			</div>
			
			<div class="mb-3">
				<label class="form-label">Description</label>
				<textarea type="password" class="form-control" rows="5" name="description"></textarea>
			</div>
			
			<div class="mb-3">
				<label class="form-label">Price</label> 
				<input type="text" class="form-control" name="price" required="required">
			</div>
			
			<div class="text-center">
			<a type="submit" class="btn btn-primary m-2" href="">Back</a>
			<button type="submit" class="btn btn-primary m-2">Add</button>			
			</div>
		</form>

	</div>
</body>
</html>