<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<link rel="stylesheet"
	href="https://cdn.jsdelivr.net/npm/bootstrap@3.3.7/dist/css/bootstrap.min.css"
	integrity="sha384-BVYiiSIFeK1dGmJRAkycuHAHRg32OmUcww7on3RYdg4Va+PmSTsz/K68vbdEjh4u"
	crossorigin="anonymous">
</head>
<body>
	
	<div class="container">
	<h1>Index Page</h1>
		<form action="hello">
			<label>Name</label>
			<input type="text" name="name" class="form-control"> 
			<label>Email</label>
			<input type="text" name="email" class="form-control"> 
			<label>Department</label>
			<select class="form-control" name="dept">
				<option value="HR">HR
				<option value="Admin">Admin
				<option value="BFSI">BFSI
				<option value="Training">Training
			</select> 
			<input type="submit" class="btn btn-success" value="Submit">
		</form>
		<h3 style="color: blue">${response}</h3>
	</div>
</body>
</html>