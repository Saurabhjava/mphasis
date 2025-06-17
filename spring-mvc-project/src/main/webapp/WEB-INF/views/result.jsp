<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
 <%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<link rel="stylesheet"
	href="https://cdn.jsdelivr.net/npm/bootstrap@3.3.7/dist/css/bootstrap.min.css"
	integrity="sha384-BVYiiSIFeK1dGmJRAkycuHAHRg32OmUcww7on3RYdg4Va+PmSTsz/K68vbdEjh4u"
	crossorigin="anonymous">
</head>
<body>
		<table class="tbl table-bordered">
			<thead>
				<tr><th>Employee ID</th><th>Name</th><th>Email</th><th>Department</th></tr>
				<c:forEach var="e" items="${emps}">
					<tr><td>${e.empid}</td><td>${e.name}</td><td>${e.email}</td><td>${e.dept}</td></tr>
				</c:forEach>
			</thead>
		</table>
</body>
</html>