<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<form:form action="/MVC-HIBERNATE-REGISTER/profile" method="post" modelAttribute="obj">
		<h2 align="center">login form</h2>
		<table align="center">
			<tr>
				<td>ID</td>
				<td><form:input path="id" /></td>
			</tr>

			<tr>
				<td>NAME</td>
				<td><form:input path="name" /></td>
			</tr>
			
			<tr>
			<td><input type="submit" value="Register"></td>
			</tr>
</table>
</form:form>
</body>
</html>